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

Windows.startApplicationWithTitle('C:\\Users\\Thuan\\AppData\\Roaming\\Telegram Desktop\\Telegram.exe', 'Telegram')

Windows.click(findWindowsObject('Object Repository/new_group/check_search_member/btn_menu'))

Windows.click(findWindowsObject('Object Repository/new_group/check_search_member/btn_new_group'))

Windows.clearText(findWindowsObject('Object Repository/new_group/check_search_member/input_group_name'))

Windows.setText(findWindowsObject('Object Repository/new_group/check_search_member/input_group_name'), group_name)

Windows.click(findWindowsObject('Object Repository/new_group/check_search_member/btn_next'))

Windows.clearText(findWindowsObject('Object Repository/new_group/check_search_member/input_menber_name'))

Windows.setText(findWindowsObject('Object Repository/new_group/check_search_member/input_menber_name'), menber_name)

menber_name_check = Windows.getText(findWindowsObject('Object Repository/new_group/check_search_member/input_menber_name'))

WebUI.verifyEqual(menber_name, menber_name_check)

Windows.closeApplication()

