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

WebUI.click(findTestObject('Login/Admin/Btn_Login'))

WebUI.setText(findTestObject('Login/Admin/Input_Username'), GlobalVariable.register_username)

WebUI.setText(findTestObject('Login/Admin/Input_Password'), GlobalVariable.register_password)

WebUI.click(findTestObject('Login/Admin/Btn_Submit'))

boolean isElePresent = false

isElePresent = WebUI.waitForElementPresent(findTestObject('Login/Admin/Btn_OK'), 5, FailureHandling.OPTIONAL)

println('First isElePresent : ' + isElePresent)

int maxRe = 3

int retryCount = 0

if (isElePresent === false) {
    WebUI.takeFullPageScreenshot()

    while ((retryCount < maxRe) && (isElePresent === false)) {
        println('Retrying .... Attempt: ' + (retryCount + 1))

        retryCount++

        WebUI.setText(findTestObject('Login/Admin/Input_Username'), GlobalVariable.register_username)

        WebUI.setText(findTestObject('Login/Admin/Input_Password'), GlobalVariable.register_password)

        WebUI.click(findTestObject('Login/Admin/Btn_Submit'))

        isElePresent = WebUI.waitForElementPresent(findTestObject('Login/Admin/Btn_OK'), 5, FailureHandling.OPTIONAL)

        if (isElePresent === true) {
            isElePresent === true
        }
        
        println('Second isElePresent : ' + isElePresent)

        WebUI.click(findTestObject('Login/Admin/Btn_OK'))
    }
} else {
    isElePresent = WebUI.waitForElementPresent(findTestObject('Login/Admin/Btn_OK'), 5, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Login/Admin/Btn_OK'))

    WebUI.delay(2)
}

