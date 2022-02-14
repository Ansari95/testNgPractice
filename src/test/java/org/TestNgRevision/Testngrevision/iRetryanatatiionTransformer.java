package org.TestNgRevision.Testngrevision;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class iRetryanatatiionTransformer implements org.testng.IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		org.testng.IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}


	@Override
	public void transform(IDataProviderAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		org.testng.IAnnotationTransformer.super.transform(annotation, method);
	}

	@Override
	public void transform(IFactoryAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		org.testng.IAnnotationTransformer.super.transform(annotation, method);
	}


	
	
}
