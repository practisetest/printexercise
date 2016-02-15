package printexercisetest.printest;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import printexercise.impl.IPrintJobCostCalculator;
import printexercise.impl.P4DoubleSided;



public class P4DoubleSidedTest {
	
	P4DoubleSided doublesided;
	
	@Before
	public void setup(){
		
		doublesided = new P4DoubleSided();	
	}
	
	@Test
	public void calculateCostTestColor(){
		
		double result  = doublesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.COLOR);
		assertTrue(result == 20.00);
	}
	
	@Test
	public void calculateCostTestBlack(){
		
		double result  =  doublesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.BLACKANDWHITE);
		assertTrue(result == 10.00);
	}
	
	@Test
	public void calculateCostTestColor_invalid(){
		
		double result   = doublesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.COLOR);
		assertFalse(result == 150.00);//compare with any value
	}
	
	@Test
	public void calculateCostTestBlack_invalid(){
		
		double result   = doublesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.BLACKANDWHITE);
		assertFalse(result == 150.00);
	}

}
