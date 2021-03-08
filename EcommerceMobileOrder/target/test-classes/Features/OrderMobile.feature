#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Purchase a product from the eCommerce site

 
  Scenario: Order Lenovo Mobile with amazon website
    Given Launch chrome browser
    And Enter amazon website
    When Search product "lenovo mobile phone" and Goto desired product details page
    
    And Check the availability as In stock
    And Add product to cart (two qty)
    Then  Go to the cart page and check the product names and total prices
    

  