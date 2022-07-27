import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.juaracoding.util.Util
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to Website PHP Travels")
	def User_navigate_to_Website_PHP_Travels() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.phptravels.net/')
		WebUI.maximizeWindow()
	}

	@When("User click button login page")
	def User_click_button_login_page() {
		WebUI.click(findTestObject('Object Repository/Travels/Page_PHPTRAVELS  Travel Technology Partner _11a09b/Page_Login'))
	}

	@And("User enter (.*) and (.*)")
	def User_enter_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Email_email'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Password_password'), password)
	}

	@And("User click button login")
	def User_click_button_login() {
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("User login with (.*) credentials")
	def User_login_successfully(String status) {
		WebUI.refresh()
		String txtME = WebUI.getText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/Message_Fail'))
		WebUI.verifyElementText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/Message_Fail'), txtME)
		WebUI.closeBrowser()
	}

	@When("User enter null username")
	def User_enter_null_username() {
		Util.goToLoginPage()
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Password_password'), 'test')
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("User required username")
	def User_required_username() {
		WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/Message_Null_Username'), 'required', 'true', 0)
	}

	@When("User enter null password")
	def User_enter_null_password() {
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Email_email'), 'user@phptravels.com')
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Password_password'), '')
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("User required password")
	def User_required_password() {
		WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/Message_Null_Password'), 'required', 'true', 0)
	}

	@When("User enter invalid format email")
	def User_enter_invalid_format_email() {
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Email_email'), 'user')
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("User must enter valid format email")
	def User_must_enter_valid_format_email() {
		WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/Message_Null_Username'), 'type', 'email', 0)
		WebUI.closeBrowser()
	}

	@When("User enter valid login")
	def User_enter_valid_login() {
		Util.goToLoginPage()
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Email_email'), 'user@phptravels.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Password_password'), '6weEYLVRi3+STmppai9GiQ==')
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("User login successfully")
	def User_login_successfully() {
		WebUI.refresh()
		String txtWB = WebUI.getText(findTestObject('Object Repository/Travels/Page_Dashboard - PHPTRAVELS/span_Welcome Back'))
		WebUI.verifyElementText(findTestObject('Travels/Page_Dashboard - PHPTRAVELS/span_Welcome Back'), txtWB)
		WebUI.closeBrowser()
	}
}