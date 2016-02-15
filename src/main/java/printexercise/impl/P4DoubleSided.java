package printexercise.impl;

import org.springframework.stereotype.Component;


@Component
public class P4DoubleSided implements IPrintJobCostCalculator {
    
	private double costPerPageBW = 0.10;
	private double costPerPageColor = 0.20;
	
	
	@Override
	public double calculateCost(int noofpages, JOBTYPE type) {
		if(type == JOBTYPE.BLACKANDWHITE)
		 return	noofpages * costPerPageBW;
		if(type == JOBTYPE.COLOR)
			return	noofpages * costPerPageColor;
		return 0.00;
	}

}
