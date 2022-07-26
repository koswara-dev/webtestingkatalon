package com.juaracoding.fundamental

import internal.GlobalVariable

public class ExampleDate {
	
	static void main(String[] args) {
		Date tanggalwaktu = new Date()
		
		println (tanggalwaktu.toString())
		
		println (tanggalwaktu.format('MMM'))
		
		println (tanggalwaktu.format('dd-MM-yyyy'))
	}
	
}
