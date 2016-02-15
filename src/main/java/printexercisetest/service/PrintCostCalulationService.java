package printexercisetest.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import printexercisetest.impl.IPrintJobCostCalculator;
import printexercisetest.impl.IPrintJobCostCalculator.JOBTYPE;
import printexercisetest.impl.P4DoubleSided;
import printexercisetest.impl.P4SingleSide;
import printexercisetest.input.Job;
import printexercisetest.input.JobItem;

public class PrintCostCalulationService implements IPrintCost {
	
	private IPrintJobCostCalculator singleSided ;
	private IPrintJobCostCalculator doubleSided ;
	
	enum PrintType { SINGLEPAGE,DOUBLEPAGE};
	
	public PrintCostCalulationService (IPrintJobCostCalculator singleSided ,
			IPrintJobCostCalculator doubleSided){
		this.singleSided = singleSided;
	    this.doubleSided=doubleSided;
	}
	
	
	/**
	 * Calculate cost of each Job
	 * @param jobs
	 * @return
	 */
	@Override
	public void calculateJobsCost(Job job){
		JobItem[] jobs = job.getJobitems();
		BigDecimal totalcost = new BigDecimal(0);
		for(JobItem jobitem : jobs){
			BigDecimal singlesidecost = singleSided.calculateCost(jobitem.getNosinglesidedPrint(), jobitem.getColor());
			singlesidecost.add(doubleSided.calculateCost(jobitem.getNosinglesidedPrint(), jobitem.getColor()));
			jobitem.setPrice(singlesidecost);
			totalcost.add(singlesidecost);
		}
		job.setTotalcost(totalcost);
	}
	
}
