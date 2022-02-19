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

	
	
	
	
	
	
	
	
	
	//Tear down - Called after every test method
	@After 
	public void tearDown()
	{
		list = null;
	}
}
