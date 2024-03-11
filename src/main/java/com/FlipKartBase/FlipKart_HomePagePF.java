package com.FlipKartBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart_HomePagePF {
	
	
	
	// *1. -----------* Declaration + Early Initialization *===========>
	
	
	
					@FindBy ( xpath = " //input[@type='text'] " )               				 //  X-Path of Search Box 
					
						private WebElement SearchBox ;											 // Declare SearchBox as Global Variable
					
					@FindBy ( xpath = "  //button[@type=\"submit\"] " )							 // X-Path of Search Bar
									
						private WebElement SubmitButton ;										 // Declare SubmitButton as Global Variable
					
					@FindBy ( xpath = "(//img[@loading='eager'])[1]" ) 						 // X-Path of Selected Product
					
						private WebElement SelectProduct  ;										 // Declare SubmitButton as Global Variable
			
					
					
	
	// *2. --------------------* Initialization *==========================>
					
					
					
					public  FlipKart_HomePagePF ( WebDriver driver ) {						     // Declare Constructor for Initialization of Web Driver Object
						
						PageFactory.initElements(driver, this) ;								 // Used as ===>  differnt_Class_Name.different_Method_Name ( Object Of WebDriver , this Keyword )
											
	 }
	
			
					
					
    // *3. ------------------------* Usage *==============================>
				
					
	
					public void InputInSearchBox ( ) {											 // Used ===> for Declaration of SearchBox Method
						
						
						SearchBox.sendKeys ("Laptop") ;										     // Used ===> for send Input to Search Box
					
	 }
					
					public void clickOnSubmitButton ( ) {							             // Used ===> for Declaration of SubmitButton Method
						
						
						 SubmitButton.click ( ) ;											     // Used ===> for click on SubmitButton WebElement
	
	 }
					
					public void clickOnProduct ( ) {										    // Used ===> for Declaration of SalectProduct Method
					
						
						SelectProduct.click ( ) ;												// Used ===> for click on Selected Product
	 }
	
					
     }
