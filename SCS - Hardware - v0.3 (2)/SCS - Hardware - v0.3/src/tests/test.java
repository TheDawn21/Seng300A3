package tests;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class test {
	private List<String> list;
	
	//Set up - Called before every test method
	@Before 
	public void setUp()
	{
		list = new ArrayList<String>();
	}

	
	//template
	@Test
	public void test ()
	{
		
	}
	
	@Test
	public void testElectronicScale()
	{
		
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
	
	
	//Tear down - Called after every test method
	@After 
	public void tearDown()
	{
		list = null;
	}
}
