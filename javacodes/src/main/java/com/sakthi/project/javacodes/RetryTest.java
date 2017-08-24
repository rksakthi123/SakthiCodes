package com.sakthi.project.javacodes;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
	int counter=0,retryCount=4;

	
	public boolean retry(ITestResult result){
		if(counter<retryCount){
			counter++;
			return true;
		}
		return false;
	}
}
