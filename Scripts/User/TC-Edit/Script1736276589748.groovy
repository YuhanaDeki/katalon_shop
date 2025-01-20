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

WebUI.click(findTestObject('User/Edit/Btn_Edit'))

WebUI.sendKeys(findTestObject('User/Edit/Input_Username'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('User/Edit/Input_Username'), GlobalVariable.new_username_edit)

WebUI.click(findTestObject('User/Edit/Input_CheckBox'))

WebUI.setText(findTestObject('User/Edit/Input_Password'), GlobalVariable.new_password_edit)

WebUI.selectOptionByValue(findTestObject('User/Edit/Select_Role'), GlobalVariable.role_name_2, true)

WebUI.click(findTestObject('User/Edit/Btn_Submit'))

WebUI.click(findTestObject('User/Edit/Btn_OK'))

WebUI.setText(findTestObject('User/Edit/Input_Search'), GlobalVariable.new_username_edit)

WebUI.verifyElementText(findTestObject('User/Edit/Verify_Text'), GlobalVariable.new_username_edit)

