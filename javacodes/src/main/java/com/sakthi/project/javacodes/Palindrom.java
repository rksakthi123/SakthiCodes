package com.sakthi.project.javacodes;

import org.testng.annotations.Test;

public class Palindrom {

	public static void main(String[] args) {
		Palindrom obj=new Palindrom();
		//obj.test("baab");

	}
	
	@Test(groups="test123")
	public void test(){
		String str="saas";
		
		boolean status=true;
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
			if(str.charAt(i)!=str.charAt(j)){
				status=false;
			}
		}
		if(status){
			System.out.println("Palindrom");
		}
		else{
			System.out.println("Not a palindrom");
		}
	}
	
	public void test2(){
		System.out.println("hello");
	}
	public void test3(){
		System.out.println("hello world");
	}
	

}
