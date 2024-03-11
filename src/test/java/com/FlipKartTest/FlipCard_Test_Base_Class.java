package com.FlipKartTest;


import java.util.ArrayList;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import com.FlipKartBase.FlipKart_ChildPagePF;
import com.FlipKartBase.FlipKart_HomePagePF;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FlipCard_Test_Base_Class {
	
	
	
			

				public static void main ( String [] args ) throws InterruptedException {
				
						 
					     WebDriverManager.chromedriver().setup() ;						    // Used ===> ChromeDriver Manager class for launch the browser
						 
					     ChromeDriver driver = new ChromeDriver (  ) ;					   //  Used ===> for Create the Object of the Class 
					     
					     driver.manage().deleteAllCookies() ;							   //  Used ===> for Delete All Previous Cookies of the Browser
					     
					     driver.manage().window().maximize() ;							   //  Used ===> for Maximize the Window of the Browser
					     
					     driver.get("https://www.flipkart.com") ;						   //  Used ===> for Launch the URL
					    
					     Thread.sleep(3000) ;											   //  Used ===> for take Waiting time for Proper Loading all Web Element
					     
					     
	
				
				
					     
	// *1. -------------------------* Home Page Methods *===============================>		
					     
					     
						 
					
				FlipKart_HomePagePF P1 = new FlipKart_HomePagePF ( driver ) ;					//  Used ===> for Create the Object of FlipKart_HomePagePF Class 
				
						P1. InputInSearchBox () ;												//  Used ===> for Call to SearchBox Method from FlipKart_HomePagePF Class
						
						Thread.sleep (2000) ;													//  Used ===> for take Waiting Time for Proper Action
						
						P1. clickOnSubmitButton () ;											//  Used ===> for Call to SubmitButton Method from FlipKart_HomePagePF Class
						
						Thread.sleep (2000) ;													//  Used ===> for take Waiting Time for Proper Action
					

				JavascriptExecutor js = (JavascriptExecutor) driver;  							//  Used ===> for Handle the ScrollBar
				   			
				   		js.executeScript("window.scrollBy(0,100)") ;							//  Used ===> for Scroll Down Action 
				   		 	
						P1. clickOnProduct() ;													//  Used ===> for Call to Product Method from FlipKart_HomePagePF Class
	
						Thread.sleep ( 3000 ) ;				  									//  Used ===> for take Waiting Time for Proper Action
						
	
						
	// *2. --------------------------* FlipKart_ChildPagePF *=============================>
						
			
						
			    FlipKart_ChildPagePF  P2 = new FlipKart_ChildPagePF ( driver ) ;				// Used ===> for Create the Object of FlipKart_ChildPagePF Class
	
			    
					
					   Set<String> allIds = driver.getWindowHandles ( ) ;					    // Used ===> for Handling child Window of Browser
						
						   ArrayList<String> a1 = new ArrayList <> (allIds) ;                   // Used ===> Array Concept for String Initialization 
						
					   driver.switchTo().window((a1.get(1))) ;					                // Used ===> for Change our focus on Parent to Child Window
			  	   
			    	

		   		 JavascriptExecutor js1 = (JavascriptExecutor) driver ;  						//  Used ===> for Handle the ScrollBar
		   			   			
		   		 	    js1.executeScript("window.scrollBy(0,400)") ;							//  Used ===> for Scroll Down Action
		   			
			    
			    		P2. clickOnViewDetails ( ) ;											//  Used ===> for give Call to ViewDetails Method from FlipKart_ChildPagePF Class
			    		
			    		
			    			Thread.sleep (4000) ;												//  Used ===> for take Waiting Time for Proper Action
			    		
			    			
			    driver.findElementByXPath("//button[@class='_2KpZ6l _1KAjNd']").click() ;		//  Used ===> X-Path of Cancel Button of PopUp also it is used for click on PopUp Cancel Button
			    			
			    			Thread.sleep(2000) ;												//  Used ===> for take Waiting Time for Proper Action
			    		
			    		P2. clickOnaddToCart ( ) ;												//  Used ===> for give Call to ViewDetails Method from FlipKart_ChildPagePF Class
			    		
			    			Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action
			    												
			    			
			    		P2. clickOnProductdetails ( ) ;											//  Used ===> for give Call to Productdetails Method from FlipKart_ChildPagePF Class
			    		
			    			Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action
			    	
			    			
			    		P2.clickOnAddItem ( ) ;												    //  Used ===> for give Call to AddItem Method from FlipKart_ChildPagePF Class
			   
			    		   Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action
			    
			    		   
			    		P2. clickOnPlaceOrder ( ) ;												//  Used ===> for give Call to PlaceOrder Method from FlipKart_ChildPagePF Class
			    		 
			    			
			    		    Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action 
			    		
			    			driver. navigate (). back () ;										//  Used ===> for Go Back 1 Step In Browser History 
			    			
			    			Thread.sleep (3000) ;												//  Used ===> for take Waiting Time for Proper Action 
			    
			    			driver. navigate (). back () ;										//  Used ===> for Go Back 1 Step In Browser History 

				    		Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action
				    	
			    			
			    		P2. clickOnBuyNow ( ) ;													//  Used ===> for give Call to Productdetails Method from FlipKart_ChildPagePF Class
					
			    			Thread.sleep (2000) ;												//  Used ===> for take Waiting Time for Proper Action

	
			    			driver.quit();  													//  Used ===> for close the all window of the browser as well as close the driver

	}
				

   }
