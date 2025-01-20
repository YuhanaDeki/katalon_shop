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

WebUI.click(findTestObject('Setting/Bank/Edit/Btn_Edit'))

WebUI.sendKeys(findTestObject('Setting/Bank/Edit/Input_Bank_Initial_Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Setting/Bank/Edit/Input_Bank_Initial_Name'), GlobalVariable.bank_initial_name_edit)

WebUI.sendKeys(findTestObject('Setting/Bank/Edit/Input_Bank_Full_Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Setting/Bank/Edit/Input_Bank_Full_Name'), GlobalVariable.bank_full_name_edit)

WebUI.selectOptionByValue(findTestObject('Setting/Bank/Edit/Select_Status'), '2', true)

WebUI.click(findTestObject('Setting/Bank/Edit/Btn_Submit'))

WebUI.click(findTestObject('Setting/Bank/Edit/Btn_OK'))

WebUI.click(findTestObject('Setting/Bank/Edit/Btn_Bank'))

WebUI.setText(findTestObject('Setting/Bank/Edit/Input_Search'), GlobalVariable.bank_full_name_edit)

WebUI.verifyElementText(findTestObject('Setting/Bank/Edit/Verify_Text'), GlobalVariable.bank_full_name_edit)

