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

WebUI.click(findTestObject('Setting/Bank/Create/Btn_Bank'))

WebUI.click(findTestObject('Setting/Bank/Create/Btn_Add'))

WebUI.setText(findTestObject('Setting/Bank/Create/Input_Bank_Init_Name'), GlobalVariable.bank_initial_name)

WebUI.setText(findTestObject('Setting/Bank/Create/Input_Bank_Full_Name'), GlobalVariable.bank_full_name)

WebUI.selectOptionByValue(findTestObject('Setting/Bank/Create/Select_Status'), '1', true)

WebUI.click(findTestObject('Setting/Bank/Create/Btn_Submit'))

WebUI.click(findTestObject('Setting/Bank/Create/Btn_OK'))

WebUI.click(findTestObject('Setting/Bank/Create/Btn_Bank'))

WebUI.setText(findTestObject('Setting/Bank/Create/Input_Search'), GlobalVariable.bank_full_name)

WebUI.verifyElementText(findTestObject('Setting/Bank/Create/Verify_Text'), GlobalVariable.bank_full_name)

