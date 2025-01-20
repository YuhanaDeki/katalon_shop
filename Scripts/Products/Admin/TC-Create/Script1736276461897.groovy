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

WebUI.click(findTestObject('Products/Admin/Create/Btn_Add'))

WebUI.setText(findTestObject('Products/Admin/Create/Input_Product_Name'), GlobalVariable.product_name)

WebUI.setText(findTestObject('Products/Admin/Create/Input_Des'), GlobalVariable.product_des)

WebUI.setText(findTestObject('Products/Admin/Create/Input_Price'), GlobalVariable.product_price)

WebUI.selectOptionByIndex(findTestObject('Products/Admin/Create/Select_Category'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Products/Admin/Create/Select_Status'), '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('Products/Admin/Create/Input_Upload'), RunConfiguration.getProjectDir() + GlobalVariable.product_image)

WebUI.click(findTestObject('Products/Admin/Create/Btn_Submit'))

WebUI.click(findTestObject('Products/Admin/Create/Btn_OK'))

WebUI.setText(findTestObject('Products/Admin/Create/Input_Search'), GlobalVariable.product_name)

WebUI.verifyElementText(findTestObject('Products/Admin/Create/Verify_Text'), GlobalVariable.product_name)

