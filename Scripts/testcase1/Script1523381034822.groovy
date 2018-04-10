import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.orangehrm.com/')

WebUI.click(findTestObject('test1/Page_HR Management System  OrangeHR/a_Free 30 Day Trial'))

WebUI.setText(findTestObject('test1/Page_Free Human Resource Management/input_orangeName'), 'apoorva')

WebUI.setText(findTestObject('test1/Page_Free Human Resource Management/input_orangelName'), 'bairathi')

WebUI.setText(findTestObject('test1/Page_Free Human Resource Management/input_companyName'), 'DCU')

WebUI.selectOptionByValue(findTestObject('test1/Page_Free Human Resource Management/select_-- Select your industry'), 'Education', 
    true)

WebUI.setText(findTestObject('test1/Page_Free Human Resource Management/input_orangeEmail'), '123@gmail.com')

WebUI.setText(findTestObject('test1/Page_Free Human Resource Management/input_orangePhone'), '8776655443')

WebUI.selectOptionByValue(findTestObject('test1/Page_Free Human Resource Management/select_---Select Country---'), 'Ireland', 
    true)

WebUI.selectOptionByValue(findTestObject('test1/Page_Free Human Resource Management/select_--- No of Employees ---'), '21 - 25', 
    true)

WebUI.click(findTestObject('test1/Page_Free Human Resource Management/div_col-md-1 controls'))

WebUI.click(findTestObject('test1/Page_Free Human Resource Management/div_Create A Free Trial'))

WebUI.closeBrowser()

