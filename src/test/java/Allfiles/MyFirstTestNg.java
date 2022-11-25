package Allfiles;

import org.testng.annotations.Test;

public class MyFirstTestNg {
	
	@Test
	public void test1()
	{
		System.out.println("test 1 executed");
	}
	@Test
	public void test2()
	{
		System.out.println("test 2 executed");
	}
	@Test
	public void test3()
	{
		System.out.println("test 3  executed");
	}
	@Test(priority = 1)
	
	public void login() {
		System.out.println("login done");
	}
		
	@Test
	public void createAccount() {
		System.out.println("account created");
	}
	@Test(priority =2)
	public void deletedAccount() {
		System.out.println("deleted account");
		
	}
	@Test
	public void logout() {
		System.out.println("logged out");
	}
	

}
