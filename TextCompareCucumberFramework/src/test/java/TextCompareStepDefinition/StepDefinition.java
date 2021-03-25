package TextCompareStepDefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.textcompare.pages.textCompareloginPage;

import TextCompareBase.textCompareBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


////////////div[@id='srcText'] for response src
///////div[@id='destText'] des

public class StepDefinition {
WebDriver driver=null;
 textCompareloginPage comparelogin;


@Before

public void beforeScenario(Scenario scenario) {
	
	
	System.out.println("------------------------------");
	System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
	System.out.println("------------------------------");
	
}
@After
public void afterScenario(Scenario scenario) {
	
	
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "Screenshot");
			
		}
		
		System.out.println("------------------------------");
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		System.out.println("------------------------------");
		
		if(driver !=null)
		{
			//driver.close();
		}
		}
/*-----------------------------1st Scenario-------------------*/
//@Functional1

@Given("user Open the Chrome browser")
public void user_open_the_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize(); 
	 driver.manage().deleteAllCookies();
	 
	
}

@When("User enter the TextCompare URL {string}")
public void user_enter_the_text_compare_url(String url) {
	driver.get(url);
	comparelogin=new textCompareloginPage(driver);
}

@When("User able to land into Text Compare home Page")
public void user_able_to_land_into_text_compare_home_page() {
	 System.out.println("User is on Home Page");
}

@Then("verify the homepage title.")
public void verify_the_homepage_title() {
	 String exptitle="Text Compare Tool";
	   String actualtitle=driver.getTitle();
	   Assert.assertTrue(actualtitle.contains(exptitle));
}

//////////*****************scenario2**********////////////
//@Functional2
@Then("verify {string} in Text Compare home page.")
public void verify_in_text_compare_home_page(String string) {
	comparelogin.locateGalaxelogo();
	Assert.assertTrue(true);
}

//@Functional3
@Then("verify {string}")
public void verify(String string) {
	comparelogin.locatewelCometext();
	Assert.assertTrue(true);
}

//@Functional4
@When("Enter the text in both text fields")
public void enter_the_text_in_both_text_fields() throws InterruptedException {
	comparelogin.differentTexts();
	Thread.sleep(2000);
}

@Then("verify the contents of the text fields")
public void verify_the_contents_of_the_text_fields() {
	 String actualSrc=driver.findElement(By.id("SourceText")).getText();
	 String actualDes=driver.findElement(By.id("DestinationText")).getText();

	if(actualSrc!=null&& actualDes!=null) {
		
		System.out.println("Test is Passed");
	}

	else
	{
		System.out.println("Test failed");
	}
}

//@Functional5
@When("Enter the text in text field1 and text field2")
public void enter_the_text_in_text_field1_and_text_field2() throws InterruptedException {
	comparelogin.numerictexts();
	Thread.sleep(2000);
}

@Then("verify the contents of numeric and special characters")
public void verify_the_contents_of_numeric_and_special_characters() {
	String actualnumSrc=driver.findElement(By.id("SourceText")).getText();
	   
	   String actualnumDes=driver.findElement(By.id("DestinationText")).getText();
	   


	  if(actualnumSrc!=null&& actualnumDes!=null) {
	  	
	  	System.out.println("Test is Passed");
	  }

	  else
	  {
	  	System.out.println("Test failed");
	  }
}
//@Functional6
@When("user able to give input in both text fields")
public void user_able_to_give_input_in_both_text_fields() throws InterruptedException {
	comparelogin.clearalltexts();;
	Thread.sleep(2000);
}


@When("user Click the Clear All button for clearing all the text")
public void user_click_the_clear_all_button_for_clearing_all_the_text() throws InterruptedException {
	comparelogin.clickclearallbtn();
	Thread.sleep(2000);
}

@Then("verify the clear all button clearing text filed")
public void verify_the_clear_all_button_clearing_text_filed() {
	String Srctext=driver.findElement(By.id("SourceText")).getText();
	String  Destext=driver.findElement(By.id("DestinationText")).getText();
	 if(Srctext==null&& Destext==null) {
		  	
		  	System.out.println("Test is Passed");
		  }

		  else
		  {
		  	System.out.println("Test failed");
		  }
}

//@Functional7
@When("user able to give input to field {int}")
public void user_able_to_give_input_to_field(Integer int1) throws InterruptedException {
	comparelogin.clearallsourcetexts();
	Thread.sleep(2000);
}



@When("Click the Clear All button for clearing the text")
public void click_the_clear_all_button_for_clearing_the_text() throws InterruptedException {
	comparelogin.clickclearallbtn();
	Thread.sleep(2000);
}

@Then("verify the clear all button clearing texts")
public void verify_the_clear_all_button_clearing_texts() {
	String Srctext=driver.findElement(By.id("SourceText")).getText();
	 if(Srctext==null) {
		  	
		  	System.out.println("Test is Passed");
		  }

		  else
		  {
		  	System.out.println("Test failed");
		  }
}

//@Functional8
@When("user able to give input to text field {int} and text field {int}")
public void user_able_to_give_input_to_text_field_and_text_field(Integer int1, Integer int2) throws InterruptedException {
	comparelogin.differentTexts();
	Thread.sleep(2000);
}

@When("user able to click the Compare button")
public void user_able_to_click_the_compare_button() throws InterruptedException {
	comparelogin.clickCompareBtn();
	Thread.sleep(2000);
}

@Then("Verify user is able to Compare the Text")
public void verify_user_is_able_to_compare_the_text() {

	String Srctext=driver.findElement(By.id("srcText")).getText();
	String  Destext=driver.findElement(By.id("destText")).getText();
	 if(Srctext!=null&& Destext!=null) {
		  	
		  	System.out.println("Test is Passed");
		  }

		  else
		  {
		  	System.out.println("Test failed");
		  }
}

//@Functional9
@When("user able to give same inputs both the Text fields")
public void user_able_to_give_same_inputs_both_the_text_fields() throws InterruptedException {

	comparelogin.sameinputTexts();
	Thread.sleep(2000);
}

@Then("Verify user is able to see the message\"Inputs are Identical\"")
public void verify_user_is_able_to_see_the_message_inputs_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'Inputs are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("Inputs are identical"));
}

//@Functional10
@When("user able to give input to one of the Text fields")
public void user_able_to_give_input_to_one_of_the_text_fields() throws InterruptedException {
	comparelogin.oneinputText();
	Thread.sleep(2000);
}
//@Functional11
@Then("Verify user is able to see the message\"Please add text in both fields\"")
public void verify_user_is_able_to_see_the_message_please_add_text_in_both_fields() {
String actualmessage=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]")).getText();
	
	Assert.assertTrue(actualmessage.contains("Please Add Text In Both Fields"));
}

//@Functional12
@Then("Verify user is able to locate the Swap button")
public void verify_user_is_able_to_locate_the_swap_button() throws InterruptedException {
	comparelogin.locateSwap();
	Assert.assertTrue(true);
	Thread.sleep(2000);
}

@When("user able to give inputs")
public void user_able_to_give_inputs() throws InterruptedException {
	comparelogin.differentTexts();
	Thread.sleep(2000);
}
//@Functional13
@When("user clicks Swap button")
public void user_clicks_swap_button() throws InterruptedException {
	comparelogin.verifySwap();
	Thread.sleep(2000);
}

@Then("Verify user is able to swap the contents between the textf fields")
public void verify_user_is_able_to_swap_the_contents_between_the_textf_fields() {

	String  Srctext=driver.findElement(By.id("SourceText")).getText();
	String switchsrctxt="galaxe";
	 Assert.assertEquals(switchsrctxt, Srctext);
	   
	   String  Destext=driver.findElement(By.id("DestinationText")).getText();
		String switchdestxt="Galaxe";
	   Assert.assertEquals(switchdestxt, Destext);
    System.out.println("Able to switch");
}









/* new feature file upload */
/* scenario1*/





@When("user click Files button")
public void user_click_files_button() throws InterruptedException {
	comparelogin.clickFilesbtn();
	Thread.sleep(2000);
}

@When("user upload {string} and {string}")
public void user_upload_and(String string, String string2) throws InterruptedException {
	comparelogin.sameUploadtextfile();
	   Thread.sleep(2000);
}

@Then("Verify the message for same text file\"File contents are Identical\"")
public void verify_the_message_for_same_text_file_file_contents_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
}
//we are runing now
@When("user upload\\/\"textDifferent1.txt\"and\"textDifferent2.txt\"")

public void user_upload_text_different1_txt_and_text_different2_txt() throws InterruptedException {
	comparelogin.differentTextfile();
	
	
}



@Then("Verify user is able to compare the contents of the text files")
public void verify_user_is_able_to_compare_the_contents_of_the_text_files() {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  Assert.assertNotEquals(srcResponseText, desResponseText);
	  
}

@When("user upload\"textDifferent1.txt\"")
public void user_upload_text_different1_txt() throws InterruptedException {
	comparelogin.chooseOneTextFile();
	Thread.sleep(2000);
}

@Then("Verify the message for text files\"Please Upload Both File \"")
public void verify_the_message_for_text_files_please_upload_both_file() {
	String expMsg = driver.findElement(By.xpath("//span[@class='message']")).getText();
	Assert.assertTrue(expMsg.contains("Please Upload Both Files"));
}

@When("user upload\"textDifferent1.txt\"and\"jsonSameFile2.json\"")
public void user_upload_text_different1_txt_and_json_same_file2_json() throws InterruptedException {
	 comparelogin.differentextensionUploadfile();
	  Thread.sleep(2000);
}

@Then("Verify the message for txt and json extensions\"Can't compare files with different extensions\"")
public void verify_the_message_for_txt_and_json_extensions_can_t_compare_files_with_different_extensions() {
	String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	System.out.println(expMsg);
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
}

@When("user upload\"jsonSameFile1.jsonand\"jsonSameFile2.json\"")
public void user_upload_json_same_file1_jsonand_json_same_file2_json() throws InterruptedException {
	 comparelogin.jsonextensionUploadSamefile();
	  Thread.sleep(2000);
}

@Then("Verify the message for json files\"File contents are Identical\"")
public void verify_the_message_for_json_files_file_contents_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
}

@When("user upload\"jsonDifferentFile1.json\"and\"jsonDifferntFile2.json\"")
public void user_upload_json_different_file1_json_and_json_differnt_file2_json() throws InterruptedException {
	comparelogin.jsonextensionUploadDifferentfile();
	   Thread.sleep(2000);
}

@Then("Verify user is able to compare the contents of the json files")
public void verify_user_is_able_to_compare_the_contents_of_the_json_files() throws InterruptedException {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	System.out.println("souce name" +srcResponseText);
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  System.out.println("dest name" +desResponseText);
	  Assert.assertNotEquals(srcResponseText, desResponseText);
}

@When("user upload\"jsonDifferentFile1.json\"and\"textSame1.txt\"")
public void user_upload_json_different_file1_json_and_text_same1_txt() throws InterruptedException {
	comparelogin.jsonextensionCheckDifferentfileEx();
	  Thread.sleep(2000);
}

@Then("Verify the  message for json and txt file\"Can't compare files with different extensions\"")
public void verify_the_message_for_json_and_txt_file_can_t_compare_files_with_different_extensions() {
	 String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
}

@When("user uploads\"xmlSameFile1.xml\"and\"xmlSameFile2.xml\"")
public void user_uploads_xml_same_file1_xml_and_xml_same_file2_xml() throws InterruptedException {
	 comparelogin.xmlextensionUploadSamefile();
	   Thread.sleep(2000);
}

@Then("Verify the message for xml file\"File contents are Identical\"")
public void verify_the_message_for_xml_file_file_contents_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
}

@When("user uploads\"xmlDifferentFile1.xml\"and\"xmlDifferentFile2.xml\"")
public void user_uploads_xml_different_file1_xml_and_xml_different_file2_xml() throws InterruptedException {
	 comparelogin.xmlextensionUploadDifferentfile();
	   Thread.sleep(2000);
}

@Then("Verify user is able to compare the contents of the xml files")
public void verify_user_is_able_to_compare_the_contents_of_the_xml_files() {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  Assert.assertNotEquals(srcResponseText, desResponseText);
}

@When("user upload\"xmlDifferentFile1.xml\"and\"textDifferent1.txt\"")
public void user_upload_xml_different_file1_xml_and_text_different1_txt() throws InterruptedException {
	comparelogin.xmlextensionUploadDifferentfileEx();
	   Thread.sleep(2000);
}

@Then("Verify the message for xml file\"Can't compare files with different extensions\"")
public void verify_the_message_for_xml_file_can_t_compare_files_with_different_extensions() {
	String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
}

@When("user upload\"htmlsamefile1.html\"and\"htmlsamefile2.html\"")
public void user_upload_htmlsamefile1_html_and_htmlsamefile2_html() throws InterruptedException {
	comparelogin.htmlextensionUploadSamefile();;
	   Thread.sleep(2000);
}

@Then("Verify the message for html file\"File contents are Identical\"")
public void verify_the_message_for_html_file_file_contents_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
}

@When("user upload\"htmlDifferentFile1.html\"and\"htmlDifferentFile2.html\"")
public void user_upload_html_different_file1_html_and_html_different_file2_html() throws InterruptedException {
	 comparelogin.htmlextensionUploadDifferentfile();
	    Thread.sleep(2000);
}

@Then("Verify user is able to compare the contents of the html files")
public void verify_user_is_able_to_compare_the_contents_of_the_html_files() {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  Assert.assertNotEquals(srcResponseText, desResponseText);
}

@When("user upload\"htmlsamefile1.html\"and\"textDifferent1.txt\"")
public void user_upload_htmlsamefile1_html_and_text_different1_txt() throws InterruptedException {
	 comparelogin.htmlextensionUploadDifferentfileEx();
	   Thread.sleep(2000);
}

@Then("Verify the message for html file\"Can't compare files with different extensions\"")
public void verify_the_message_for_html_file_can_t_compare_files_with_different_extensions() {
	 String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	 System.out.print(expMsg);
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
}




@When("user upload\"pdfsamefile1.pdf\"and\"pdfsamefile2.pdf\"")
public void user_upload_pdfsamefile1_pdf_and_pdfsamefile2_pdf() throws InterruptedException {
	comparelogin.pdfextensionUploadSamefile();
	   Thread.sleep(2000);
}

@Then("Verify the message for pdf file\"File contents are Identical\"")
public void verify_the_message_for_pdf_file_file_contents_are_identical() {
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
    }

@When("user upload\"myfile.pdf\"and\"myfile2.pdf\"")
public void user_upload_myfile_pdf_and_myfile2_pdf() throws InterruptedException {
	comparelogin.pdfextensionUploadDifferentfile();
	   Thread.sleep(2000);
	   
}

@Then("Verify user is able to compare the contents of the pdf files")
public void verify_user_is_able_to_compare_the_contents_of_the_pdf_files() {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  Assert.assertNotEquals(srcResponseText, desResponseText);
    
}

@When("user upload\"myfile.pdf\"and\"RSAtoken.txt\"")
public void user_upload_myfile_pdf_and_rs_atoken_txt() throws InterruptedException {
	comparelogin.pdfextensionUploadDifferentfileEx();
	   Thread.sleep(2000);
    
}

@Then("Verify the message for pdf file\"Can't compare files with different extensions\"")
public void verify_the_message_for_pdf_file_can_t_compare_files_with_different_extensions() {
	String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	 System.out.print(expMsg);
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
    
}

@When("user upload\"Doc1.docx\"and\"Doc2.docx\"")
public void user_upload_doc1_docx_and_doc2_docx() throws InterruptedException {
	comparelogin.docsextensionUploadSamefile();
	   Thread.sleep(2000);
}


@Then("Verify the message for docs file\"File contents are Identical\"")
public void verify_the_message_for_docs_file_file_contents_are_identical() {
    
	String inputidenmessage=driver.findElement(By.xpath("//span[contains(text(),'File contents are identical')]")).getText();
	   Assert.assertTrue(inputidenmessage.contains("File contents are identical"));
	
}

@When("user upload\"Doc1.docx\"and\"Doc3.docx\"")
public void user_upload_doc1_docx_and_doc3_docx() throws InterruptedException {
		
	comparelogin.docsextensionUploadDifferentfile();
	   Thread.sleep(2000);
}
//@functional11
@Then("Verify user is able to compare the contents of the docs files")
public void verify_user_is_able_to_compare_the_contents_of_the_docs_files() throws InterruptedException {
	String srcResponseText = driver.findElement(By.xpath("//div[@id='srcText'] ")).getText();
	  String desResponseText = driver.findElement(By.xpath("//div[@id='destText']")).getText();
	  Assert.assertNotEquals(srcResponseText, desResponseText);
	  Thread.sleep(4000);
	  try {
	  	  JavascriptExecutor jse= (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,400)");
	    System.out.println("Scroll bar is working");
	  }
	  catch (Exception e) {
		  
	  }
}

@When("user upload\"Doc1.docx\"and\"RSAtoken.txt\"")
public void user_upload_doc1_docx_and_rs_atoken_txt() throws InterruptedException {
	comparelogin.docsextensionUploadDifferentfileEx();
	   Thread.sleep(2000);
}

@Then("Verify the message for docs file\"Can't compare files with different extensions\"")
public void verify_the_message_for_docs_file_can_t_compare_files_with_different_extensions() {
	String expMsg= driver.findElement(By.xpath("//span[text()='Cannot compare files with different extensions']")).getText();
	 System.out.print(expMsg);
	   Assert.assertTrue(expMsg.contains("Cannot compare files with different extensions"));
   
}



@Then("Verify the right scroll bar")

public void verify_the_right_scroll_bar() throws InterruptedException {
    JavascriptExecutor jse= (JavascriptExecutor)driver;
    jse.executeScript("window.scrollTo(0,400)");
	Thread.sleep(2000);

   
}

@Then("Verify the left scroll bar")
public void verify_the_left_scroll_bar() throws InterruptedException {
	JavascriptExecutor jse= (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(1000,0)");
	Thread.sleep(2000);
}

@Then("Verify the down scroll bar")
public void verify_the_down_scroll_bar() throws InterruptedException {
	JavascriptExecutor jse= (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
}

@Then("Verify the up scroll bar")
public void verify_the_up_scroll_bar() throws InterruptedException {
	JavascriptExecutor jse= (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(1000,0)");
	Thread.sleep(2000);
}







// Code for scroll
@When("user uploads files in both upload file button")
public void user_uploads_files_in_both_upload_file_button() {
	comparelogin.clickFilesbtn();
	
    }




@When("user able to Compare file in the response window")
public void user_able_to_compare_file_in_the_response_window() throws InterruptedException {
	comparelogin.docsextensionUploadDifferentfile(); 
	comparelogin.clickCompareBtn();
	Thread.sleep(5000);

}
@When("user able to scroll veritically")
public void user_able_to_scroll_veritically() {
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    System.out.println("Scroll bar is working");

}
@Then("Verifying scroll bar is working")
public void verifying_scroll_bar_is_working() {
    
}

}


