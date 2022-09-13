package runTimeRetryfailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {

	@Test
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
