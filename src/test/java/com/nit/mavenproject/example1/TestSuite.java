package com.nit.mavenproject.example1;

import java.lang.annotation.Annotation;

import org.testng.annotations.Test;

public class TestSuite implements Test {

	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean alwaysRun() {
		// TODO Auto-generated method stub
		return false;
	}

	public String dataProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<?> dataProviderClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] dependsOnGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] dependsOnMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public Class[] expectedExceptions() {
		// TODO Auto-generated method stub
		return null;
	}

	public String expectedExceptionsMessageRegExp() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] groups() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean ignoreMissingDependencies() {
		// TODO Auto-generated method stub
		return false;
	}

	public int invocationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long invocationTimeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] parameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public int priority() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Class retryAnalyzer() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean sequential() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean singleThreaded() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean skipFailedInvocations() {
		// TODO Auto-generated method stub
		return false;
	}

	public int successPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String suiteName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String testName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int threadPoolSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long timeOut() {
		// TODO Auto-generated method stub
		return 0;
	}

}
