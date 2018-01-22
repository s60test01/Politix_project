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

WebUI.openBrowser('https://uat.samanthawills.com.au/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('HOME PAGE/Logo SW'))

not_run: WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

WebUI.verifyElementPresent(findTestObject('HOME PAGE/span_USD'), 40)

WebUI.scrollToPosition(50, 60)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/span_TAKE ME BACK'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-youtube-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-wishlist-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-up-thin'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-twitter-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-tumblr'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-pinterest-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-instagram-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-facebook-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-email-outline'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/i_icon-account-outline hidden-'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/icon key 1'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/icon key 2'), 40)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('HOME PAGE/icon key 3'), 40)

WebUI.takeScreenshot()

