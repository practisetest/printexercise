package printexercisetest.impl;

import java.math.BigDecimal;



public class P4DoubleSided implements IPrintJobCostCalculator {
    
	private BigDecimal costPerPageBW = new BigDecimal("0.10");
	private BigDecimal costPerPageColor = new BigDecimal("0.20");
	
	
	@Override
	public BigDecimal calculateCost(int noofpages, jobtype type) {
		if(type == jobtype.BLACKANDWHITE)
		 return	costPerPageBW.multiply(new BigDecimal(noofpages));
		if(type == jobtype.COLOR)
			 return	costPerPageColor.multiply(new BigDecimal(noofpages));
		return null;
	}

}