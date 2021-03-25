package com.qa.textcompare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class textCompareloginPage {
	WebDriver driver;
	
	@FindBy(id="SourceText")
	WebElement sourceTxtfield;
	@FindBy(id="DestinationText")
	WebElement destTxtfield;
	@FindBy(xpath="//*[@data-testid='compare']")
	WebElement compareBtn;
	@FindBy(xpath="//*[@data-testid='clearall']")
	WebElement ClearAllbtn;
	@FindBy(xpath="//span[@class='compareSwapClearAll']//button[@type='button'][2]")
	WebElement swapBtn;
	@FindBy(xpath="//button[contains(text(),'FILES')]")
	WebElement filesbtn;
	@FindBy(xpath="//*[@id='Upload 1']")
	WebElement uploadFile1;
	@FindBy(xpath="//*[@id='Upload 2']")
	WebElement uploadFile2;
	@FindBy(xpath="//*[@class='logo']")
	WebElement galaxeLogo;
	@FindBy(xpath="//*[@class='title']")
	WebElement welcometext;
	
	
	public textCompareloginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean locateGalaxelogo() {
		boolean galaxelogo= galaxeLogo.isDisplayed();
		return galaxelogo;
	}
	
	public boolean locatewelCometext() {
		boolean welcometextpage= welcometext.isDisplayed();
		return welcometextpage;
	}
	
	public void differentTexts() {
		sourceTxtfield.sendKeys("Galaxe");
		destTxtfield.sendKeys("galaxe");
		
	}
	public void clickCompareBtn() {
		compareBtn.click();
	}
	public void numerictexts() {
		sourceTxtfield.sendKeys("To verify numeric and special characters Galaxe@123");
		destTxtfield.sendKeys("To verify numeric and special characters Hello QA 124$56%");
	}
	
	public void clearalltexts() {
		sourceTxtfield.sendKeys("To verify Clear All button Galaxe@123");
		destTxtfield.sendKeys("To verify Clear All button Galaxe@123 Hello QA 124$56%");
		
	}
	public void clickclearallbtn() {
		 
		   ClearAllbtn.click();
		
	}
	public void clickFilesbtn() {
		 
		filesbtn.click();
		
	}
	public void clearallsourcetexts() {
		sourceTxtfield.sendKeys("To verify Clear All button in Source Galaxe@123");
		
	}
	
	public void sameinputTexts() {
		sourceTxtfield.sendKeys("Hello QA");
		destTxtfield.sendKeys("Hello QA");
		
	}
	
	
	public void oneinputText() {
		sourceTxtfield.sendKeys("Hello QA");
	}
	
	public boolean locateSwap() {
		boolean switchvisible= swapBtn.isDisplayed();
		return switchvisible;
	}
	
	public void verifySwap() {
		swapBtn.click();
	}
	
	public void sameUploadtextfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textSame1.txt");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textSame2.txt");
	}
	public void differentTextfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textDifferent1.txt");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textDifferent2.txt");
	}
	public void chooseOneTextFile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textSame1.txt");
		
	}
	public void differentextensionUploadfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonSameFile1.json");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textSame1.txt");
	}
	public void jsonextensionUploadSamefile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonSameFile1.json");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonSameFile2.json");
	}
	
	public void jsonextensionUploadDifferentfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonDifferentFile1.json");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonDifferntFile2.json");
	}
	
	public void jsonextensionCheckDifferentfileEx() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\jsonDifferentFile1.json");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\textSame1.txt");
	}
	
	public void xmlextensionUploadSamefile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlSameFile1.xml");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlSameFile2.xml");
	}
	
	public void xmlextensionUploadDifferentfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlDifferentFile1.xml");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlDifferentFile2.xml");
	}
	
	public void xmlextensionUploadDifferentfileEx() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlDifferentFile1.xml");
		uploadFile2.sendKeys("C:\\Users\\\\aponnusamy\\Documents\\My text compare sample files\\htmlDifferentFile1.html");
	}
	
	public void htmlextensionUploadSamefile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\htmlsameFile1.html");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\htmlsameFile2.html");
	}
	
	public void htmlextensionUploadDifferentfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\htmlDifferentFile1.html");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\htmlDifferentFile2.html");
	}
	
	public void htmlextensionUploadDifferentfileEx() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\htmlDifferentFile1.html");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlDifferentFile1.xml");
	}
	
	
	
	public void pdfextensionUploadSamefile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\pdfsamefile1.pdf");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\pdfsamefile2.pdf");
	}
	
	public void pdfextensionUploadDifferentfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\myfile.pdf");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\myfile2.pdf");
				
	}
	
	public void pdfextensionUploadDifferentfileEx() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\myfile.pdf");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\xmlDifferentFile1.xml");
	}
	
	
	
	public void docsextensionUploadSamefile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\samedoc1.docx");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\samedoc2.docx");
	}
	
	public void docsextensionUploadDifferentfile() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\LoremIpsum25LinesEditedSpaceAfterParagraph.pdf");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\LoremIpsum25LinesUneditedSpaceAfterParagraph.pdf");
	}
	
	public void docsextensionUploadDifferentfileEx() {
		uploadFile1.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\Doc1.docx");
		uploadFile2.sendKeys("C:\\Users\\aponnusamy\\Documents\\My text compare sample files\\RSAtoken.txt");
	
}
}

