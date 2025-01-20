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

WebUI.delay(GlobalVariable.user_delay)

WebUI.click(findTestObject('Setting/Category/View/Left_Menu'))

WebUI.waitForElementPresent(findTestObject('Setting/Category/View/Btn_Logout'), 5)

WebUI.click(findTestObject('Setting/Category/View/Btn_Logout'))

WebUI.verifyElementText(findTestObject('Setting/Category/View/Page_Login'), 'Login')

WebUI.click(findTestObject('Setting/Category/View/Btn_Home'))

WebUI.verifyElementText(findTestObject('Setting/Category/View/Title_H1_On_Page'), 'Welcome to Our Store')

println(GlobalVariable.var_category)

WebUI.scrollToElement(findTestObject('Setting/Category/View/Btn_Shop_By_Category', [('dynamicValue') : GlobalVariable.var_category]), 
    2)

WebUI.click(findTestObject('Setting/Category/View/Btn_Shop_By_Category', [('dynamicValue') : GlobalVariable.var_category]))

titlePage = WebUI.getWindowTitle()

WebUI.verifyEqual(titlePage, 'PRODUCT', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(GlobalVariable.user_delay)

