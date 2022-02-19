package tests;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import org.lsmr.selfcheckout.Item;
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
		ElectronicScale a = new ElectronicScale(10,1);
		assertTrue("Return incorrect value",10==a.getWeightLimit());
	}
	
	@Test
	public void testGetCurrentWeight() throws OverloadException
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.endConfigurationPhase();
		assertTrue("", 0==a.getCurrentWeight());
	}
	
	@Test
	public void testGetCurrentWeight2()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testGetCurrentWeight3()
	{
		assertTrue("",false);
	}
	
	
	@Test
	public void testGetSensitivity()
	{
		assertTrue("",false);
	}
	
	@Test
	public void testAdd() throws OverloadException
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.endConfigurationPhase();
		Item pear;
		pear b = new pear();
		a.add(b);
		int c = 2;
		assertTrue("Weight different then expected",
				c==(int)a.getCurrentWeight());
	}
	
	@Test
	public void testAdd2()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		Item pear;
		pear b = new pear();
		a.forceErrorPhase();
		try
		{
			a.add(b);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown",true);
			return;
		}
		assertTrue("Expected error not thrown",false);
	}
	
	@Test 
	public void testAdd3()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		pear b = new pear();
		
		try
		{
			a.add(b);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown",false);
	}
	
	@Test
	public void testAdd4()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.endConfigurationPhase();
		pear b = new pear();
		a.add(b);
		try 
		{
			a.add(b);
		} 
		catch (SimulationException ex) {
			assertTrue("Item not added twice", true);
			return;
		}
		assertTrue("Item added twice", false);
	}

	@Test
	public void testAdd5()
	{
		ElectronicScale a = new ElectronicScale(1,1);
		a.endConfigurationPhase();
		pear b = new pear();
		a.add(b);
		assertTrue("Scale not overload when it should be", true);
		
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
