package printexercisetest.printest;


import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import printexercisetest.impl.IPrintJobCostCalculator;
import printexercisetest.impl.P4DoubleSided;



public class P4DoubleSidedTest {
	
	P4DoubleSided doublesided;
	
	@Before
	public void setup(){
		
		doublesided = new P4DoubleSided();	
	}
	
	@Test
	public void calculateCostTestColor(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.COLOR);
		assertTrue(result.compareTo(new BigDecimal(20)) == 0);
	}
	
	@Test
	public void calculateCostTestBlack(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.BLACKANDWHITE);
		assertTrue(result.compareTo(new BigDecimal(10)) == 0);
	}
	
	@Test
	public void calculateCostTestColor_invalid(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.COLOR);
		assertFalse(result.compareTo(new BigDecimal(150)) == 0);
	}
	
	@Test
	public void calculateCostTestBlack_invalid(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.BLACKANDWHITE);
		assertFalse(result.compareTo(new BigDecimal(150)) == 0);
	}

}
