package tests;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.lsmr.selfcheckout.devices.*;

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
		try 
		{
			ElectronicScale a  =new ElectronicScale(0,1);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown",true);
			return;
		}
		assertTrue("Expected error not thrown", false);
	}
	
	@Test
	public void testElectronicScale3()
	{
			try 
			{
				ElectronicScale a = new ElectronicScale(1,0);
			}
			catch(SimulationException ex)
			{
				assertTrue("Expected error thrown",true);
				return;
			}
		assertTrue("Expected error not thrown", false);
	}
	
	@Test
	public void testGetWeightLimit()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testGetCurrentWeight()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testGetSensitivity()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testAdd()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testRemove()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testNotifyOverload()
	{
		assertTrue("",false);
	}
	@Test
	public void testNotifyOutOfOverload()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testNotifyWeightChanged()
	{
		assertTrue("",false);
	}
	
}
