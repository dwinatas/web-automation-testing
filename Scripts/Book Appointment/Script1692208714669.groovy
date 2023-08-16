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

WebUI.callTestCase(findTestCase('Login Web'), [('username') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'
        , ('url') : 'https://katalon-demo-cura.herokuapp.com/profile.php#login'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Booking/Button Facilities'))

WebUI.click(findTestObject('Booking/Facility 3'))

WebUI.click(findTestObject('Booking/Checkbox - Apply'))

WebUI.click(findTestObject('Booking/Radio Button - Medicare'))

WebUI.click(findTestObject('Booking/Icon - Calender'))

WebUI.click(findTestObject('Booking/Date - 20'))

WebUI.click(findTestObject('Booking/Text Field - Comment'))

WebUI.setText(findTestObject('Booking/Text Field - Comment'), 'Testing Automation for Booking Appoinment')

WebUI.click(findTestObject('Booking/Button Book'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

