package apphooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {

	
	@Before("@sanity and @regression")
	public void beforeHook()
	{
		System.out.println("Before hook for @Sanity");
	}
	
	
	@After("@regression")
	public void afterHook()
	{
		System.out.println("After hook for @regression");
	}
	
	
	
	
	
	
	
	
	
//	@Before(order = 1)
//	public void beforeHook()
//	{
//		System.out.println("Before hook is executing");
//	}
//	
//	@After(order = 1)
//	public void afterHook()
//	{
//		System.out.println("After hook is executing");
//	}
	
//	@Before
//	public void beforeHook2()
//	{
//		System.out.println("before hook 2 is executing");
//	}
	
//	@After
//	public void afterHook2()
//	{
//		System.out.println("After hook 2 is executing");
//	}
	
//	@BeforeStep(order = 1)
//	public void beforeStep()
//	{
//		System.out.println("Before Step");
//	}
//	
//
//	@BeforeStep(order = 2)
//	public void beforeStep2()
//	{
//		System.out.println("Before Step2");
//	}
//	
//	@AfterStep(order = 1)
//	public void afterStep()
//	{
//		System.out.println("After step");
//	}
//	
//	@AfterStep(order = 2)
//	public void afterStep2()
//	{
//		System.out.println("After step2");
//	}
	
	
	
}
