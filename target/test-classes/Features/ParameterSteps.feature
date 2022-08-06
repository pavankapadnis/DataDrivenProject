Feature: Test parameterization 

Scenario: Tets the test case using int Parameter 
	Given this is 10 and 20 Parameter 
	When addition of above number 
	Then check addition is even or not 

@Regression	
Scenario: Tets the test case using word Parameter 
	Given this is Pavan and Kapadnis Parameter here 
	When join the above string 
	Then check string join or not 
	
Scenario: Tets the test case using String Parameter 
	Given this is "Pavan Kapadnis" String Parameter 
	When take string in two global variable 
	Then compare two global string 
	
Scenario: Test the multiple data in Map 
	Given pass the city name and state: 
		|Mumbai|Maharshtra|
		|Delhi|India|
		|Chennai|Tamilnadu|	
		|Banglore|Karnataka|	
		|Gndhinagar|Gujrat|	
		|Jodhpur|Rajasthan|	
		|Lucknow|Uttar Pradesh|			

		
Scenario: Test the multiple data in List 
	Given pass the Only city name: 
		|Mumbai|
		|Delhi|
		|Chennai|
		|Banglore|
		|Gndhinagar|
		|Jodhpur|
		|Lucknow|	

#This is for data driven testing		
Scenario Outline: 
	Given I have "<rto_code>" and "<city_name>" 
	
	Examples:
		|rto_code|city_name| 
		|Mumbai|Maharshtra|
		|Delhi|India|
		|Chennai|Tamilnadu|	
		|Banglore|Karnataka|	
		|Gndhinagar|Gujrat|	
		|Jodhpur|Rajasthan|	
		|Lucknow|Uttar Pradesh|	
		
Scenario Outline:
	Given we have only "<row_num>" of excel sheet
	
	Examples:
		|row_num|
		|1|
		|2|
		|3|
		|4|
		|5|
		|6|
		|7|
		|8|
		|9|
		|10|
		
		
	
	
	
	
				 	 
		 