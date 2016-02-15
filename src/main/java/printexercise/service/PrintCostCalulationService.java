package printexercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import printexercise.impl.P4DoubleSided;
import printexercise.impl.P4SingleSide;
import printexercise.input.Job;
import printexercise.input.JobItem;


/**
 * This class calculates the total cost of all jobs and 
 * also the cost associated with each job.
 * 
 * @author sharan
 *
 */

@Service
public class PrintCostCalulationService implements IPrintCost {
	
	@Autowired
	private P4SingleSide singleSided ;
	@Autowired
	private P4DoubleSided doubleSided ;
	
	public PrintCostCalulationService(){
		
	}
	
	public PrintCostCalulationService (P4SingleSide singleSided ,
			P4DoubleSided doubleSided){
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
		double totalcost = 0;
		
		for(JobItem jobitem : jobs){
			double singlesidecost = singleSided.calculateCost(jobitem.getNosinglesidedPrint(), jobitem.getColor());
			double doublesidecost = doubleSided.calculateCost(jobitem.getNosinglesidedPrint(), jobitem.getColor());
			jobitem.setPrice(singlesidecost +doublesidecost);
			totalcost = totalcost + jobitem.getPrice();
		}
		
		job.setTotalcost(totalcost);
	}
	
}
