package com.juaracoding.fundamental

public class Example {
    
    static void main(String[] args) {
        String text = 'Hello World'
		String text2 = ' W'
		String text3 = 'hello world'
        println(text)
		println(text.size())
		println(text.toUpperCase())
		println(text.contains(text2))
		println(text.equalsIgnoreCase(text3))
		println(text.substring(2, 5))
    }
    
}