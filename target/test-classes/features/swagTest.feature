@ALlTest
Feature: Test all scenario

@TestScenario1 @takescreenshot
Scenario Outline: Add the product into cart
Given Initialize the browser with chrome 
And Open the Site Url "https://www.saucedemo.com/" for Login
When User copy the user name and password enters details and log in  
Then verify the user is successfully logged with page title "PRODUCTS"
And add the product <Proname> to cart 
And go to the cart page and verify that product <Proname>  
Then checkout the product and enters the <firstname> , <lastname> and <postal code> and click continue
And verify that product and clicks finish
Then verify tha success message "THANK YOU FOR YOUR ORDER"
And close the browser 
Examples:
|Proname		      |firstname|lastname|postal code|
|Sauce Labs Bike Light|Agila    |G		 |605004     |

@TestScenario2 @takescreenshot
Scenario Outline: Get all the product in the list
Given Initialize the browser with chrome 
And Open the Site Url "https://www.saucedemo.com/" for Login
When User copy the user name and password enters details and log in  
Then verify the user is successfully logged with page title "PRODUCTS"
And Get all the product lists and check the particular product <Proname> is available
And close the browser 
Examples:
|Proname		        |
|Sauce Labs Bolt T-Shirt|

@TestScenario3 @takescreenshot
Scenario Outline: Validate the price with the product listing
Given Initialize the browser with chrome 
And Open the Site Url "https://www.saucedemo.com/" for Login
When User copy the user name and password enters details and log in  
Then verify the user is successfully logged with page title "PRODUCTS"
And get all product price in the list
Then clicks the particular product <proname> and verify that product name and price
And close the browser 
Examples:
|proname                |
|Sauce Labs Bolt T-Shirt|

@TestScenario4 @takescreenshot
Scenario Outline: Invalid Username and Password
Given Initialize the browser with chrome 
And Open the Site Url "https://www.saucedemo.com/" for Login
When User enters the <Username> and <Password> and clicks login 
Then verify the error message "Username and password do not match any user in this service"
And close the browser 
Examples:
|Username|Password|
|Agila   |Guna    |