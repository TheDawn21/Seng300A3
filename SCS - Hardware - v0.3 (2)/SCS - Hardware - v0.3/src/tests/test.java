package tests;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import org.lsmr.selfcheckout.Item;
import org.lsmr.selfcheckout.devices.*;

public class test {

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
		assertTrue("Current Weight not accurate", 0==(int)a.getCurrentWeight());
	}
	
	@Test
	public void testGetCurrentWeight2() throws OverloadException
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.forceErrorPhase();
		try
		{
			a.getCurrentWeight();
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error was thrown", true);
			return;
		}
		assertTrue("Expected error not thrown",false);
	}
	
	@Test
	public void testGetCurrentWeight3() throws OverloadException
	{
		ElectronicScale a = new ElectronicScale(10,1);
		try
		{
			a.getCurrentWeight();
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown",false);
	}

	@Test
	public void testGetCurrentWeight4() throws OverloadException
	{
		ElectronicScale a = new ElectronicScale(1,1);
		a.endConfigurationPhase();
		pear b = new pear();
		a.add(b);
		try
		{
			a.getCurrentWeight();
		}
		catch(OverloadException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown", false);
	}
	
	@Test
	public void testGetSensitivity()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		assertTrue("Sensitivity is incorrect",1==(int)a.getSensitivity());
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
		ElectronicScale a = new ElectronicScale(10,1);
		a.endConfigurationPhase();
		pear b = new pear();
		apple c = new apple();
		a.add(c);
		a.add(b);
		a.remove(b);
		assertTrue("Did not notify weightchanged ",true);
	}
	
	@Test 
	public void testRemove2()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.forceErrorPhase(); 
		pear b = new pear();
		try
		{
			a.remove(b);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown", false);
	}
	
	@Test
	public void testRemove3()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		pear b = new pear();
		try
		{
			a.remove(b);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown", false);
	}

	@Test
	public void testRemove4()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		a.endConfigurationPhase();
		pear b = new pear();
		try
		{
			a.remove(b);
		}
		catch(SimulationException ex)
		{
			assertTrue("Expected error thrown", true);
			return;
		}
		assertTrue("Expected error not thrown", false);
	}
	
	@Test 
	public void testRemove5()
	{
		ElectronicScale a = new ElectronicScale(5,1);
		a.endConfigurationPhase();
		pear b = new pear();
		apple c = new apple();
		
		a.add(b);
		a.add(c);
		a.remove(c);
		assertTrue("Did not notify outofoverload", true);
	}
	
	@Test
	public void testNotifyOverload()
	{
		ElectronicScale a = new ElectronicScale(10,1);

		assertTrue("",false);
	}
	@Test
	public void testNotifyOutOfOverload()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		
		assertTrue("",false);
	}
	
	@Test
	public void testNotifyWeightChanged()
	{
		ElectronicScale a = new ElectronicScale(10,1);
		assertTrue("",false);
	}
	
}
