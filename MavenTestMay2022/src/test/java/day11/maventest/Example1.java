package day11.maventest;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void testCase1() {
	  System.out.println("TC1 is running");
	  calling();
  }
  @Test
  public void testCase4() {
	  System.out.println("TC4 is running");
	  calling();
  }
  @Test
  public void testCase2() {
	  System.out.println("TC2 is running");
	  calling();
  }
  @Test
  public void testCase3() {
	  System.out.println("TC3 is running");
	  calling();
  }
  void calling() {
	  System.out.println("Hi, I am calling method.....");
  }
}
