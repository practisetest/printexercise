package printexercisetest.impl;

import java.math.BigDecimal;


public class P4SingleSide implements IPrintJobCostCalculator {
     
	private BigDecimal costPerPageBW = new BigDecimal("0.15");
	private BigDecimal costPerPageColor = new BigDecimal("0.25");
	
	
	@Override
	public BigDecimal calculateCost(int noofpages, JOBTYPE type) {
		if(type == JOBTYPE.BLACKANDWHITE)
		 return	costPerPageBW.multiply(new BigDecimal(noofpages));
		if(type == JOBTYPE.COLOR)
			 return	costPerPageColor.multiply(new BigDecimal(noofpages));
		return null;
	}

}
