#!/bin/bash

/usr/local/bin/mvn clean test -Dcucumber.options="--tags ~@ignore --tags @reg_cred_card"

    if [ $? -eq 1 ]; then
       echo "rerunning failed scenario"
       mkdir target/Automation_First_round
       cp -R target/cucumber-html-reports/ target/Automation_First_round/
       /usr/local/bin/mvn test -Dcucumber.options="@target/rerun.txt"
       echo $?
    fi

exit 0