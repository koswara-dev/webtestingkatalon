package com.juaracoding.fundamental

public class ExampleLoops {
	
	static void main(String[] args) {
		kotak(3)
		
		println '---'
		
		kotak(5)
		
		println '---'
		println'Masukan nilai awal = '
		def awal = System.in.newReader().readLine() as Integer
		println'Masukan nilai akhir = '
		def akhir = System.in.newReader().readLine() as Integer
		
		jmlGanjil(awal,akhir)
		
	}
	
	static void kotak(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				print '#'
			}
			println ''
		}
	}
	
	static void jmlGanjil(int awal, int akhir) {
		
		int sum = 0
		
		for(int i=awal;i<akhir;i++) {
			if(i%2==1) {
				println i
				sum+=i
			}
		}
		
		println sum
	}
}
