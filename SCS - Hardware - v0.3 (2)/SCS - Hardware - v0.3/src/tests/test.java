package tests;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.lsmr.selfcheckout.devices.ElectronicScale;

public class test {
	private List<String> list;
	/*
	//template
	@Test
	public void test ()
	{
		
	}
	*/
	
	@Test
	public void testElectronicScale()
	{
		double b,c;
		boolean d = false;
		
		ElectronicScale a = new ElectronicScale(10,1);
		b = a.getWeightLimit();
		c = a.getSensitivity();
		if(b==10 && c==1)
		{
			d = true;
		}
		assertTrue("Issue with constructor", d);
	}
	
	@Test
	public void testElectronicScale2()
	{
		new ElectronicScale(0,1);
	
	}
	
	@Test
	public void testElectronicScale3()
	{
		new ElectronicScale(1,0);
	
	}
	
	@Test
	public void testGetWeightLimit()
	{
		
	}
	
	@Test
	public void testGetCurrentWeight()
	{
		
	}
	
	@Test
	public void testGetSensitivity()
	{
		
	}
	
	@Test
	public void testAdd()
	{
		
	}
	
	@Test
	public void testRemove()
	{
		
	}
	
	@Test
	public void testNotifyOverload()
	{
		
	}
	@Test
	public void testNotifyOutOfOverload()
	{
		
	}
	
	@Test
	public void testNotifyWeightChanged()
	{
		
	}
	
}
