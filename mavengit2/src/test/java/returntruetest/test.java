package returntruetest;

import org.testng.annotations.Test;

import actions.returntrueclass;

public class test {
	
	@Test
	public void truetest()
	{
		returntrueclass OBJ=new returntrueclass();
		System.out.println(OBJ.returntrue());
	}

}
