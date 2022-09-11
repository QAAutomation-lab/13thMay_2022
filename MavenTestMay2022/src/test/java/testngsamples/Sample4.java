package testngsamples;

import org.testng.annotations.Test;

public class Sample4 {
	int age = 25;
	@Test
	public void c_compose() {
		System.out.println("I am compose...");
	}
	@Test
	public void b_login() {
		System.out.println("I am login....");
	}
	@Test
	public void a_signUp() {
		System.out.println("i am signup...");
	}
}
