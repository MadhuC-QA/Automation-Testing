package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng_ex {

@Test(priority=2,description=" This is login scenario")
	public void Login()
{
	System.out.println("Test1 executed");
	Assert.assertEquals(12, 13);
}

@Test(priority=1)
public void Login1()
{
System.out.println("Test2 executed");
}
}
