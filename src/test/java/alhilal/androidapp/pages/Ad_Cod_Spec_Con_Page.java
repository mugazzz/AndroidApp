package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import org.openqa.selenium.By;

public class Ad_Cod_Spec_Con_Page extends CommonPage{

	public void Enter_Acc_Swifs(String Acc_Num, String Swif_Code) {
		enterText(ACC_NUM, Acc_Num);
		enterText(SWIF_COD, Swif_Code);
//		driver.hideKeyboard();
		hideKeyboard();
	}
	
	public void Verify_Code(By idLocator, String code) {
		String Text = driver.findElement(idLocator).getText();
		assert Text.equals(code) : "Code is not working";
	}
	
	public void Enter_Acc_Swif_US() {
		Enter_Acc_Swifs(Acc_Num, Swif_Code);
	}
	
	public void Verify_Code_US() {
		Verify_Code(CONT_CODE, Code_US);
	}
	
	public void Enter_Acc_Swif_UK() {
		Enter_Acc_Swifs(Acc_Num_UK, Swif_Code_UK);
	}
	
	public void Verify_Code_UK() {
		Verify_Code(CONT_CODE, Code_UK);
	}
	
	public void Enter_Acc_Swif_IN() {
		Enter_Acc_Swifs(Acc_Num_IN, Swif_Code_IN);
	}
	
	public void Verify_Code_IN() {
		Verify_Code(CONT_CODE, Code_IN);
	}
	
	public void Enter_Acc_Swif_CA() {
		Enter_Acc_Swifs(Acc_Num_CA, Swif_Code_CA);
	}
	
	public void Verify_Code_CA() {
		Verify_Code(CONT_CODE, Code_CA);
	}
	
	public void Enter_Acc_Swif_AU() {
		Enter_Acc_Swifs(Acc_Num_AU, Swif_Code_AU);
	}
	
	public void Verify_Code_AU() {
		Verify_Code(CONT_CODE, Code_AU);
	}
	
}
