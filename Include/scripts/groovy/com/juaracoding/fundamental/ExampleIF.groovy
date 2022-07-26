package com.juaracoding.fundamental

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ExampleIF {

	static void main(String[] args) {
		int a = 101
		if(a<100) {
			println 'Nilai A kurang dari 100'
		} else {
			println 'Nilai A lebih besar dari 100'
		}

		cekGanjilGenap(1300)

		cekGanjilGenap(1301)

		cetak()

		println add(10,5,7)

		println add(11,22,17)
	}

	static void cekGanjilGenap(int platNomor) {
		if(platNomor%2==0) {
			println 'Genap'
		} else {
			println 'Ganjil'
		}
	}

	static void cetak() {
		println 'Cetak deri method'
	}

	static int add(int na, int nb, int c) {
		return na+nb+c
	}
}
