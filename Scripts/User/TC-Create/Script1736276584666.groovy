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

WebUI.click(findTestObject('User/Create/Btn_Add_User'))

WebUI.setText(findTestObject('User/Create/Input_Username'), GlobalVariable.new_username)

WebUI.verifyElementText(findTestObject('User/Create/Text_Success'), 'Username can be used.')

WebUI.setText(findTestObject('User/Create/Input_Password'), GlobalVariable.new_password)

WebUI.setText(findTestObject('User/Create/Input_Re_Password'), GlobalVariable.new_password)

WebUI.verifyElementText(findTestObject('User/Create/Text_Success_2'), 'Password is same')

WebUI.selectOptionByValue(findTestObject('User/Create/Select_Role'), GlobalVariable.role_name, true)

WebUI.click(findTestObject('User/Create/Btn_Submit'))

WebUI.click(findTestObject('User/Create/Btn_OK'))

WebUI.setText(findTestObject('User/Create/Input_Search'), GlobalVariable.new_username)

