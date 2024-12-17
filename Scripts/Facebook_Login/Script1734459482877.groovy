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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Facebook  log in or sign up/img_Facebook helps you connect and share wi_41e91d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Facebook  log in or sign up/div_Facebook helps you connect and share wi_33762e'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Forgotten password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Create new account'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Facebook  log in or sign up/div_Create a Page for a celebrity, brand or_5572c3'), 
    'Create a Page for a celebrity, brand or business.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Create a Page'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    invalid_email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    invalid_password)

WebUI.click(findTestObject('Page_Facebook  log in or sign up/button_Log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Log in to Facebook/img_Log in to Facebook__9ay6 img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Log in to Facebook/div_The email address or mobile number you _93c7eb'), 
    'The email address or mobile number you entered isn\'t connected to an account. Find your account and log in.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Log in to Facebook/a_Find your account and log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Log in to Facebook/div_Find your account and log in__55r1 _1kbt'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Log in to Facebook/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Log in to Facebook/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Find your account and log in_pass'), 
    password)

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log in'))

WebUI.closeBrowser()

