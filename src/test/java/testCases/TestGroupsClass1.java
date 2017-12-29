package testCases;

import org.testng.annotations.Test;

public class TestGroupsClass1 {
  @Test(priority=2,groups={"smoke"})
  public void method1() {
	  System.out.println("Method smoke executed");
  }
  
  @Test(priority=1,groups={"regression"})
  public void method2() {
	  System.out.println("Method regression executed");
  }
  @Test(priority=0,groups={"sanity"})
  public void method3() {
	  System.out.println("Method sanity executed");
  }
  
}
