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

WebUI.click(findTestObject('Products/Admin/Edit/Btn_Edit'))

WebUI.sendKeys(findTestObject('Products/Admin/Edit/Input_Product_Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Products/Admin/Edit/Input_Product_Name'), GlobalVariable.product_name_edit)

WebUI.sendKeys(findTestObject('Products/Admin/Edit/Input_Product_Des'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Products/Admin/Edit/Input_Product_Des'), GlobalVariable.product_des_edit)

WebUI.sendKeys(findTestObject('Products/Admin/Edit/Input_Price'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Products/Admin/Edit/Input_Price'), GlobalVariable.product_price_edit)

WebUI.selectOptionByIndex(findTestObject('Products/Admin/Edit/Select_Category'), '1')

WebUI.selectOptionByIndex(findTestObject('Products/Admin/Edit/Select_Status'), '1')

WebUI.click(findTestObject('Products/Admin/Edit/Btn_Submit'))

WebUI.click(findTestObject('Products/Admin/Edit/Btn_OK'))

WebUI.setText(findTestObject('Products/Admin/Edit/Input_Search'), GlobalVariable.product_name_edit)

WebUI.verifyElementText(findTestObject('Products/Admin/Edit/Verify_Text'), GlobalVariable.product_name_edit)

