package printexercisetest.printest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import printexercise.impl.IPrintJobCostCalculator;
import printexercise.impl.P4SingleSide;

public class P4SingleSidedTest {

	P4SingleSide singlesided;
	
	@Before
	public void setup(){
		
		singlesided = new P4SingleSide();	
	}
	
	@Test
	public void calculateCostTestColor(){
		
		double result  = singlesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.COLOR);
		assertTrue(result == 25.00);
	}
	
	@Test
	public void calculateCostTestBlack(){
		
		double result  =  singlesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.BLACKANDWHITE);
		assertTrue(result == 15.00);
	}
	
	@Test
	public void calculateCostTestColor_invalid(){
		
		double result   = singlesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.COLOR);
		assertFalse(result == 150.00);//compare with any value
	}
	
	@Test
	public void calculateCostTestBlack_invalid(){
		
		double result   = singlesided.calculateCost(100, IPrintJobCostCalculator.JOBTYPE.BLACKANDWHITE);
		assertFalse(result == 150.00);
	}

}
