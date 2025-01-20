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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.click(findTestObject('Cart/CheckOut/Btn_CheckOut'))

WebUI.waitForPageLoad(3)

titlePage = WebUI.getWindowTitle()

WebUI.verifyMatch(titlePage, 'Payment', true)

WebUI.setText(findTestObject('Cart/CheckOut/Input_First_Name'), GlobalVariable.first_name)

WebUI.setText(findTestObject('Cart/CheckOut/Input_Last_Name'), GlobalVariable.last_name)

WebUI.setText(findTestObject('Cart/CheckOut/Input_Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Cart/CheckOut/Input_Address'), GlobalVariable.address)

WebUI.setText(findTestObject('Cart/CheckOut/Input_City'), GlobalVariable.city)

WebUI.setText(findTestObject('Cart/CheckOut/Input_Zip'), GlobalVariable.zip_code)

WebUI.uploadFile(findTestObject('Cart/CheckOut/Input_Upload'), RunConfiguration.getProjectDir() + GlobalVariable.image_receipt)

WebUI.selectOptionByIndex(findTestObject('Cart/CheckOut/Select_Bank'), 1)

WebUI.setText(findTestObject('Cart/CheckOut/Input_Receipt_Time'), GlobalVariable.receipt_time)

WebUI.click(findTestObject('Cart/CheckOut/Btn_Submit'))

WebUI.waitForPageLoad(3)

titilePage = WebUI.getWindowTitle()

WebUI.verifyMatch(titilePage, 'Order Dashboard', true)

