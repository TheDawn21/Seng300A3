package tests;

import org.junit.Test;
import java.util.*;

public class stub implements ElectronicScaleObserver {
	
	private double weight;
	private boolean overload;
	private boolean outOfOverload;
	
	void weightChanged(ElectronicScale scale, double weightInGrams)
	{
		weight = weightInGrams;
	}
	
	void overload(ElectronicScale scale)
	{
		overload = true;
		outOfOverload = false;
	}
	
	void outOfOverload(ElectronicScale scale);
	{
		outOfOverload = true;
		overload = false;
	}
  
}
