package printexercisetest.printest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import printexercisetest.impl.IPrintJobCostCalculator;
import printexercisetest.impl.P4SingleSide;

public class P4SingleSidedTest {

	P4SingleSide doublesided;
	
	@Before
	public void setup(){
		
		doublesided = new P4SingleSide();	
	}
	
	@Test
	public void calculateCostTestColor(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.COLOR);
		assertTrue(result.compareTo(new BigDecimal(25)) == 0);
	}
	
	@Test
	public void calculateCostTestBlack(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.BLACKANDWHITE);
		assertTrue(result.compareTo(new BigDecimal(15)) == 0);
	}
	
	@Test
	public void calculateCostTestColor_invalid(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.COLOR);
		assertFalse(result.compareTo(new BigDecimal(150)) == 0);//compare with any value
	}
	
	@Test
	public void calculateCostTestBlack_invalid(){
		
		BigDecimal result  = doublesided.calculateCost(100, IPrintJobCostCalculator.jobtype.BLACKANDWHITE);
		assertFalse(result.compareTo(new BigDecimal(150)) == 0);
	}

}
