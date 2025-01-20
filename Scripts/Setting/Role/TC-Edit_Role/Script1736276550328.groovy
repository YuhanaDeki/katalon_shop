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

WebUI.click(findTestObject('Setting/Role/Edit/Btn_Edit'))

WebUI.sendKeys(findTestObject('Setting/Role/Edit/Input_Role_Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Setting/Role/Edit/Input_Role_Name'), GlobalVariable.role_name_edit)

WebUI.selectOptionByValue(findTestObject('Setting/Role/Edit/Select_Status'), '2', true)

WebUI.click(findTestObject('Setting/Role/Edit/Btn_Submit'))

WebUI.click(findTestObject('Setting/Role/Edit/Btn_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Setting/Role/Edit/Btn_Role'))

WebUI.setText(findTestObject('Setting/Role/Edit/Input_Search'), GlobalVariable.role_name_edit)

WebUI.verifyElementText(findTestObject('Setting/Role/Edit/Verify_Text'), GlobalVariable.role_name_edit)

