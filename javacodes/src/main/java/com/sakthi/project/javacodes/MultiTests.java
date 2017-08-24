package com.sakthi.project.javacodes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MultiTests {
	static int i=0;
	@Test(groups={"test1234","test1235"})
	public void test6(){
		System.out.println("====================");
		System.out.println("i am in test1");
		System.out.println("====================");
	}
	@Test(groups="test1234",retryAnalyzer=RetryTest.class)
	public void test2(){
		i++;
		String str="Sakthi1";
		System.out.println("====================");
		System.out.println("i am in test2:"+i);
		if(i==2){
			str="Sakthi";
		}
		
		Assert.assertEquals("Sakthi", str);
		System.out.println("====================");
	}
	public void test3(){
		System.out.println("====================");
		System.out.println("i am in test3");
		System.out.println("====================");
	}
	public void test4(){
		System.out.println("====================");
		System.out.println("i am in test4");
		System.out.println("====================");
	}

}
