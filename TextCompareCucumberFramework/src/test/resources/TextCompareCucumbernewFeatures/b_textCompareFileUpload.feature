@suite2
Feature: user able to compare upload files in "Text compare tool" 
Background: 
	Given user Open the Chrome browser 
	When User enter the TextCompare URL "http://localhost:3000/" 



	@Functional14
Scenario: user uploads same text files in both upload file  and compare it.
    When user click Files button
	And user upload "textSame1.txt" and "textSame2.txt"
	And user able to click the Compare button 
	Then Verify the message for same text file"File contents are Identical"  
	
	@Functional15
Scenario: user uploads different text files in both upload file and comapre it.
        When user click Files button
	And user upload/"textDifferent1.txt"and"textDifferent2.txt"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the text files 

@Functional16
Scenario: user uploads one text file in upload File 1 and comapre it.
        When user click Files button
	And user upload"textDifferent1.txt"
	And user able to click the Compare button 
	Then Verify the message for text files"Please Upload Both File "
	
@Functional17
Scenario: user uploads files with txt and json extensions in upload File and comapare it.
     
     When user click Files button
	And user upload"textDifferent1.txt"and"jsonSameFile2.json"
	And user able to click the Compare button 
	Then Verify the message for txt and json extensions"Can't compare files with different extensions" 
	


@Functional18
Scenario: user uploads same content files with json extensions in upload File and compare it.
    When user click Files button
	And user upload"jsonSameFile1.jsonand"jsonSameFile2.json" 
	And user able to click the Compare button 
	Then Verify the message for json files"File contents are Identical" 
	
	@Functional19
Scenario: user uploads different content files with json extensions in upload File and compare it.
    When user click Files button
	And user upload"jsonDifferentFile1.json"and"jsonDifferntFile2.json"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the json files 
	
	@Functional20
Scenario: user uploads json and txt Extension files with json extensions in upload File and comapre it.
    When user click Files button
	And user upload"jsonDifferentFile1.json"and"textSame1.txt" 
	And user able to click the Compare button 
	Then Verify the  message for json and txt file"Can't compare files with different extensions"

	
	
	
	@Functional21
Scenario: user uploads same content files with xml extensions in upload File and comapre it.
    When user click Files button
	And user uploads"xmlSameFile1.xml"and"xmlSameFile2.xml"
	And user able to click the Compare button 
	Then Verify the message for xml file"File contents are Identical" 
	
	@Functional22
Scenario: user uploads different content files with xml extensions in upload File and comapre it.
    When user click Files button
	And user uploads"xmlDifferentFile1.xml"and"xmlDifferentFile2.xml"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the xml files 
	
	@Functional23
Scenario: user uploads different Extension files with xml extensions in upload and compare it.
    When user click Files button
	And user upload"xmlDifferentFile1.xml"and"textDifferent1.txt" 
	And user able to click the Compare button 
	Then Verify the message for xml file"Can't compare files with different extensions"
	
		@Functional24
	Scenario: user uploads same content files with html extensions in upload and compare it.
    When user click Files button
	And user upload"htmlsamefile1.html"and"htmlsamefile2.html"
	And user able to click the Compare button 
	Then Verify the message for html file"File contents are Identical" 
	
	
		@Functional25
	Scenario: user uploads different files with html extensions in upload and compare it.
    When user click Files button
	And user upload"htmlDifferentFile1.html"and"htmlDifferentFile2.html"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the html files

@Functional26
	Scenario: user uploads different Extension files with html extensions in upload and compare it.
    When user click Files button
	And user upload"htmlsamefile1.html"and"textDifferent1.txt"
	And user able to click the Compare button 
	Then  Verify the message for html file"Can't compare files with different extensions"
	
		@Functional27
	Scenario: user uploads same content files with pdf extensions in upload and compare it.
    When user click Files button
	And user upload"pdfsamefile1.pdf"and"pdfsamefile2.pdf"
	And user able to click the Compare button 
	Then Verify the message for pdf file"File contents are Identical" 
	
		@Functional28
	Scenario: user uploads different files with pdf extensions in upload and compare it.
    When user click Files button
	And user upload"myfile.pdf"and"myfile2.pdf"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the pdf files
	
	@Functional29
	Scenario: user uploads different Extension files with  pdf extensions in upload and compare it.
    When user click Files button
	And user upload"myfile.pdf"and"RSAtoken.txt"
	And user able to click the Compare button 
	Then  Verify the message for pdf file"Can't compare files with different extensions"
	
	@Functional30
	Scenario: user uploads same content files with docs extensions in upload and compare it.
    When user click Files button
	And user upload"Doc1.docx"and"Doc2.docx"
	And user able to click the Compare button 
	Then Verify the message for docs file"File contents are Identical" 
	
		@Functional31
	Scenario: user uploads different files with pdf extensions in upload and compare it.
    When user click Files button
	And user upload"Doc1.docx"and"Doc3.docx"
	And user able to click the Compare button 
	Then Verify user is able to compare the contents of the docs files
	
	@Functional32
	Scenario: user uploads different Extension files with  docs extensions in upload and compare it.
    When user click Files button
	And user upload"Doc1.docx"and"RSAtoken.txt"
	And user able to click the Compare button 
	Then  Verify the message for docs file"Can't compare files with different extensions"
	
	
	@functional11
	Scenario: user able to scroll  vertically in the response window after uploading the files
    
    When user uploads files in both upload file button
	And user able to Compare file in the response window
	And user able to scroll veritically
	Then  Verifying scroll bar is working
	
	Scenario: user able to scroll left in the response window after uploading the files
    
    When user click Files button
	And user upload"Doc1.docx"and"Doc3.docx"
	And user able to click the Compare button 
	Then  Verify the left scroll bar
	
	
	
	Scenario: user able to scroll down in the response window after uploading the files
    
    When user click Files button
	And user upload"Doc1.docx"and"Doc3.docx"
	And user able to click the Compare button 
	Then  Verify the down scroll bar
	
	
	Scenario: user able to scroll up in the response window after uploading the files
    
    When user click Files button
	And user upload"Doc1.docx"and"Doc3.docx"
	And user able to click the Compare button 
	Then  Verify the up scroll bar
	
	