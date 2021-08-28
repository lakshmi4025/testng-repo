package newtestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class newtestNGclass {
  @Test
  public void f() {
	  System.out.println("testing phase");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test phase");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test phase");
  }

}
