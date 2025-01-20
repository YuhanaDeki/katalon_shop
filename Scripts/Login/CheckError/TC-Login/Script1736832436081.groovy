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

boolean loginSuccess = false

int maxRe = 3
int retryCount = 0

WebUI.verifyElementPresent(findTestObject('Login/Admin/Btn_Login'), 2)

WebUI.click(findTestObject('Login/Admin/Btn_Login'))

while (!loginSuccess && retryCount < maxRe) {
	try {
		
		retryCount++
		
		println("Attemptin Login (Attempt ${retryCount})")
		
		WebUI.setText(findTestObject('Login/Admin/Input_Username'), GlobalVariable.username)

		WebUI.setText(findTestObject('Login/Admin/Input_Password'), GlobalVariable.password)

		WebUI.click(findTestObject('Login/Admin/Btn_Submit'))

		WebUI.waitForElementPresent(findTestObject('Login/Admin/Btn_OK'), 5)

		WebUI.click(findTestObject('Login/Admin/Btn_OK'))

		WebUI.delay(2)

		WebUI.verifyElementText(findTestObject('Login/Admin/Title_Dashboard'), 'Dashboard')
		
		loginSuccess = true
		
	}catch(Exception e) {
		println("Attemptin Login fail (Fail ${e.message})")
		
		
		if(retryCount == maxRe) {
			println("Max Re Login fail")
			break
		}
		
	}
}
