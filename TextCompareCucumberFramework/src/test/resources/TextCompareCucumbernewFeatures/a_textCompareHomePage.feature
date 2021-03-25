@suite1
Feature: user able to compare two text files by 'Text compare' tool 
Background: 
	Given user Open the Chrome browser 
	When User enter the TextCompare URL "http://localhost:3000/" 


@Regression
@Functional1
Scenario: user able to navigate the Text Compare Home Page 

	When User able to land into Text Compare home Page 
	Then verify the homepage title. 

@Functional2
Scenario: user is able to locate the galaxe logo
	When User able to land into Text Compare home Page 
	Then verify "Galaxe logo" in Text Compare home page. 

@Functional3
Scenario: user is able to locate the welcome to text compare home page
	When User able to land into Text Compare home Page 
	Then verify "Welcome to Text-Compare banner"

@Functional4
Scenario: user able to Enter the values in the Text fields 

	When Enter the text in both text fields 
	Then verify the contents of the text fields
	
@Functional5
Scenario: Enter the numeric and special character in Text fields 

	When Enter the text in text field1 and text field2 
	Then verify the contents of numeric and special characters

@Functional6
Scenario: Clear All Button can clear the Text from two text boxes 

	When user able to give input in both text fields 
	 And user Click the Clear All button for clearing all the text 
	Then verify the clear all button clearing text filed 
	
@Functional7
Scenario: Clear All Button can clear the Text from first text box 

	When user able to give input to field 1
	And Click the Clear All button for clearing the text 
	Then verify the clear all button clearing texts 
@Functional8
Scenario: user able to compare the texts by using TextCompare tool 

	When user able to give input to text field 1 and text field 2
	And user able to click the Compare button 
	Then Verify user is able to Compare the Text 
@Functional9
Scenario: user enters same texts in both text fields 

	When user able to give same inputs both the Text fields 
	And user able to click the Compare button 
	Then Verify user is able to see the message"Inputs are Identical" 
	
@Functional10
Scenario: user gives input to one of the texts boxes and click compare 

	When user able to give input to one of the Text fields 
	And user able to click the Compare button 
	Then Verify user is able to see the message"Please add text in both fields" 
	
@Functional11
Scenario: user clicks compare without giving inputs 

	When user able to click the Compare button 
	Then Verify user is able to see the message"Please add text in both fields" 
	
	
@Functional12
Scenario: user able to locate Swap button 

	Then Verify user is able to locate the Swap button 
@Functional13
Scenario: user able to swap the contents between the textf fields

	When user able to give inputs 
	And user clicks Swap button
	Then Verify user is able to swap the contents between the textf fields






