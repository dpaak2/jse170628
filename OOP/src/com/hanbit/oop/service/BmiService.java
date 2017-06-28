package com.hanbit.oop.service;

import java.util.Scanner;

public class BmiService {
	public static String execute(double height,double weight){
		Scanner s=new Scanner(System.in);
		
	
		double bmi= weight/(height*height);
		String result=null;
		System.out.print("height in meter: "+height+"\t");
		System.out.print("BMI: "+bmi+"\n");
		if(30.0<bmi){
			result="비만 입니다";
		}else if(25.0<bmi){
			result="과체중 입니다";
		}else if(18.5<bmi){
			result="정상 입니다";
		} else {
			result="저체중 입니다";
		}
		return result;
	}
}
