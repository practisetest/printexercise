package printexercise.impl;

import org.springframework.stereotype.Component;

@Component
public class P4SingleSide implements IPrintJobCostCalculator {
     
	private double costPerPageBW = Double.valueOf("0.15");
	private double costPerPageColor = Double.valueOf("0.25");
	
	
	@Override
	public double calculateCost(int noofpages, JOBTYPE type) {
		if(type == JOBTYPE.BLACKANDWHITE)
		 return	noofpages * costPerPageBW;
		if(type == JOBTYPE.COLOR)
			 return	noofpages * costPerPageColor;
		return 0.00d;
	}

}
