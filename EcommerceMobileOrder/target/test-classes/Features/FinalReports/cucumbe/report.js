$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/OrderMobile.feature");
formatter.feature({
  "name": "Purchase a product from the eCommerce site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Order Lenovo Mobile with amazon website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter amazon website",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.enter_amazon_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search product \"lenovo mobile phone\" and Goto desired product details page",
  "keyword": "When "
});
formatter.match({
  "location": "StepsDefinition.search_product_and_Goto_desired_product_details_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the availability as In stock",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.check_the_availability_as_In_stock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add product to cart (two qty)",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinition.add_product_to_cart_two_qty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to the cart page and check the product names and total prices",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefinition.go_to_the_cart_page_and_check_the_product_names_and_total_prices()"
});
formatter.result({
  "status": "passed"
});
});