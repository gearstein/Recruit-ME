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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://recruit-me.metrodataacademy.id/')

WebUI.click(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/a_MENU'))

WebUI.click(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/input_silahkan login_email'), 'geralepua98@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/input_silahkan login_password'), 
    'LKLnTxeN21p5MXT4H+g5IA==')

WebUI.takeFullPageScreenshotAsCheckpoint('Memasukkan data yang valid')

WebUI.click(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/a_MENU'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginSuccess/Page_Beranda  Recruit-ME/a_Geraldin'), 0)

WebUI.takeFullPageScreenshotAsCheckpoint('Login Telah Berhasil')

WebUI.closeBrowser()

