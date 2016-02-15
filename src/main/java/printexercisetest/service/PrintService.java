package printexercisetest.service;

import java.util.Map;
import java.util.HashMap;

import printexercisetest.impl.IPrintJobCostCalculator;
import printexercisetest.impl.P4DoubleSided;
import printexercisetest.impl.P4SingleSide;
import printexercisetest.input.Job;

public class PrintService {
	
	Map<String,IPrintJobCostCalculator> calculator = new HashMap<>();
	enum PrintType { SINGLEPAGE,DOUBLEPAGE};
	
	PrintService (){
		calculator.put(PrintType.SINGLEPAGE.name(), (new P4SingleSide()));
		calculator.put(PrintType.DOUBLEPAGE.name(), (new P4DoubleSided()));
	}
	
	
	/**
	 * Calculate cost of each Job
	 * @param jobs
	 * @return
	 */
	public Job[] calculateJobsCost(Job[] jobs){
		
		
		return null;
	}

	/**
	 * @param jobs
	 * @return
	 */
	public double totalPrintCostOfJobs(Job[] jobs){
		
		
		return 0;
		
	}
	
	
}
