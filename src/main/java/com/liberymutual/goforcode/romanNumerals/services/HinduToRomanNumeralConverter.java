package com.liberymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	
	String result;
	
	public HinduToRomanNumeralConverter() {
		result = "";
	}

	public String convert(int numberToConvert) {
		
		while(numberToConvert >= 1000) {
			result += "M";
			numberToConvert -= 1000;
		}
		while(numberToConvert >= 900) {
			result += "CM";
			numberToConvert -= 900;
		}
		while(numberToConvert >= 500) {
			result += "D";
			numberToConvert -= 500;
		}
		while(numberToConvert >= 400) {
			result += "CD";
			numberToConvert -= 400;
		}
		while(numberToConvert >= 100) {
			result += "C";
			numberToConvert -= 100;
		}
		while(numberToConvert >= 90) {
			result += "XC";
			numberToConvert -= 90;
		}
		while(numberToConvert >= 50) {
			result += "L";
			numberToConvert -= 50;
		}
		while(numberToConvert >= 40) {
			result += "XL";
			numberToConvert -= 40;
		}
		while(numberToConvert >= 10) {
			result += "X";
			numberToConvert -= 10;
		}
		while(numberToConvert >= 9) {
			result += "IX";
			numberToConvert -= 9;
		}
		while(numberToConvert >= 5) {
			result += "V";
			numberToConvert -= 5;
		}
		while(numberToConvert >=4) {
			result += "IV";
			numberToConvert -= 4;
		}
		while(numberToConvert >= 1) {
			result += "I";
			numberToConvert -= 1;
		}
		
		return result;
		}
	}


