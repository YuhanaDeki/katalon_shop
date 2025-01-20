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

WebUI.setText(findTestObject('Setting/Category/Edit/Input_Search'), GlobalVariable.category_name)

WebUI.click(findTestObject('Setting/Category/Edit/Btn_Edit'))

WebUI.verifyElementPresent(findTestObject('Setting/Category/Edit/Title_Category'), 2)

WebUI.sendKeys(findTestObject('Setting/Category/Edit/Input_Category_Name', [('dynamicValue') : GlobalVariable.var_category]), 
    Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Setting/Category/Edit/Input_Category_Name', [('dynamicValue') : GlobalVariable.var_category]), 
    GlobalVariable.category_name_edit)

WebUI.selectOptionByValue(findTestObject('Setting/Category/Edit/Select_Option'), '2', true)

WebUI.click(findTestObject('Setting/Category/Edit/Btn_Submit'))

WebUI.click(findTestObject('Setting/Category/Edit/Btn_OK'))

WebUI.setText(findTestObject('Setting/Category/Edit/Input_Search'), GlobalVariable.category_name_edit)

WebUI.verifyElementText(findTestObject('Setting/Category/Edit/Table_Category_Name'), GlobalVariable.category_name_edit)

