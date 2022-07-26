import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.juaracoding.fundamental.ExampleLoops
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

WebUI.click(findTestObject('Travels/Page_Bookings - PHPTRAVELS/a_My Bookings'))

txtTotal = WebUI.getText(findTestObject('Travels/Page_Bookings - PHPTRAVELS/strong_( 2 )'))

splitText = txtTotal.substring(2,3)

println(splitText)

//TestObject testObj = findTestObject('Object Repository/Travels/Page_Bookings - PHPTRAVELS/ListHotel')
WebDriver driver = DriverFactory.getWebDriver()
List<WebElement> txtListHotel = driver.findElements(By.xpath('//*[@scope="row"]'))

List<WebElement> txtListPending = driver.findElements(By.xpath('//*[@id="fadein"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr/td[3]'))

totalListHotel = txtListHotel.size()

println(txtListHotel.size())

println(txtListPending.size())

ExampleLoops bebas = new ExampleLoops()

bebas.kotak(3)

WebUI.back()

WebUI.getText(findTestObject('Travels/Page_Dashboard - PHPTRAVELS/h4_2'))

WebUI.verifyElementText(findTestObject('Travels/Page_Dashboard - PHPTRAVELS/h4_2'), totalListHotel.toString())

