package printexercise.service;

import java.io.PrintStream;

import org.springframework.stereotype.Service;

import printexercise.input.Job;
import printexercise.input.JobItem;

@Service
public class DisplayJobCost implements IDisplayJobs {
	
	
    private PrintStream ostream = System.out;
	
    
    public DisplayJobCost(){
    
    }
    
    
	@Override
	public void displayJobs(Job jobs) {
		printJobs(jobs.getJobitems());
		printTotalCost(jobs.getTotalcost());
	}
	
	private void printTotalCost(double totalcost) {
		ostream.println(" 				Total cost of printing :"+totalcost);
	}
	
	
	private void printJobs(JobItem[] jobs){
		
		for (JobItem job : jobs) {
			ostream.println("Job Id :"+ job.getJobsequence()+ 
					" No of SingleSided Prints :"+job.getNosinglesidedPrint()+" No of Double Sided Prints :"+ 
					job.getNodoublesidedPrint()+ " Job Cost: "+job.getPrice());
		}
	}
}
