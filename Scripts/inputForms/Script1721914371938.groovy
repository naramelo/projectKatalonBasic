import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Rectangle


WebUI.openBrowser('')

WebUI.navigateToUrl('https://rpachallenge.com/')

WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge1/button_Start'))

def data = [
	['First Name': 'Nara1', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara2', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara3', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara4', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara5', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara6', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara7', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara8', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara9', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345'],
	['First Name': 'Nara10', 'Last Name': 'Family', 'Company Name':'PT XYZ', 'Role in Company':'Tester', 'Address':'Indonesia', 'Email':'narafamily@yopmail.com', 'Phone Number':'12345']
	] 

	
for (entry in data) {
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_First Name'), entry['First Name'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Last Name'), entry['Last Name'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Address'), entry['Address'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Company Name'), entry['Company Name'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Email'), entry['Email'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Phone Number'), entry['Phone Number'])
	WebUI.setText(findTestObject('Object Repository/Page_Rpa Challenge1/input_Role in Company'), entry['Role in Company'])
	
	WebUI.click(findTestObject('Object Repository/Page_Rpa Challenge1/input_btn'))
}

WebUI.waitForElementNotClickable(findTestObject('Object Repository/Page_Rpa Challenge1/div_Congratulations'), 5)

WebUI.takeScreenshot('D:/Working/Exa Mitra/result.png')

WebUI.closeBrowser()

