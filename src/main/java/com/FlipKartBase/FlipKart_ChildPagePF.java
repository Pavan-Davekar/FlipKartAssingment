package com.FlipKartBase;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart_ChildPagePF {
	
		
			WebDriver driver1 ;																		// Used ===> for Declaration of Global Object
			
						
						
						@FindBy ( xpath = "//div[@class='_20cDxP']" ) 							    // X-Path of View Details
					
							private WebElement ViewDetails ; 										// Declare ViewDetails as Global Variable
						
						
									
						@FindBy ( xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']" ) 			// X-Path of Add to Cart Button
					
							private WebElement addToCart ;											// Declare addToCart as Global Variable
					
						
					
						@FindBy ( xpath = " //div[@class='_35mLK5'] ")								// X-Path of Product Details Box
					
							private WebElement Productdetails ;										// Declare Productdetails as Global Variable
					
						
						@FindBy ( xpath = " //button[@class='_2KpZ6l _3-J4S1'] " ) 					// X-Path of Add Item Button 
						
							private WebElement AddItem ;											// Declare AddItem as Global Variable
						
						
						@FindBy ( xpath = " _2KpZ6l _2ObVJD _3AWRsL " )								// X-Path of PlaceOrder
						
							private WebElement PlaceOrder ;											// Declare PlaceOrder as Global Variable
						
						
						@FindBy ( xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")		// X-Path of Buy Now Button 
					
							private WebElement BuyNow ;												// Declare BuyNow as Global Variable									
					
	
	
	
						
   // *2. --------------------* Initialization *==========================>
						
						
					
					public  FlipKart_ChildPagePF ( WebDriver driver ) {				    		    //  Declare Constructor for Initialization of Web Driver Object
						
							PageFactory.initElements(driver, this) ;				    		    //  Used ===>  differnt_Class_Name.different_Method_Name ( Object Of WebDriver , this Keyword )
								
									driver1 = driver ;								    		    //  Assign Local Object Information to Global Object
	 
	 }
							
							
	
   // *3. --------------------* Usage *============================>
					
					
					
							
					       public void clickOnViewDetails ( ) {										// Used ===> for Declaration of ViewDetails Method
								
					        	ViewDetails.click ( ) ; 											// Used ===> for click on ViewDetails WebElement
					        	
	 } 
				
							public void clickOnaddToCart ( ) {									   // Used ===> for Declaration of addToCart Method
								
								addToCart.click ( ) ;											   // Used ===> for click on addToCart WebElement
			 
	 }
							
							public void clickOnProductdetails ( ) {								   // Used ===> for Declaration of Productdetails Method
					
								
								Productdetails.click ( ) ;										   // Used ===> for click on Productdetails WebElement

								
								Productdetails.getText ( ) ;									   // Used ===> for fetch Text from Productdetails WebElement
														
	 }
							
							public void clickOnAddItem ( ) {									   // Used ===> for Declaration of AddItem Method
								
								AddItem.click ( ) ;												  //  Used ===> for click on AddItem WebElement
	 }
							
							public void clickOnPlaceOrder ( ) {									  // Used ===> for Declaration of PlaceOrder Method
								
								PlaceOrder.click ( ) ;											  // Used ===> for click on Place Order WebElement
							
	 }
												
							 public void clickOnBuyNow ( ) {									   // Used ===> for Declaration of BuyNow Method
								
								 BuyNow.click ( ) ;												   // Used ===> for click on BuyNow Button
						
	 }

							 
	 }
