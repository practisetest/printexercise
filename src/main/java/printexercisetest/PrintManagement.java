package printexercisetest;

import printexercisetest.impl.P4DoubleSided;
import printexercisetest.impl.P4SingleSide;
import printexercisetest.input.CSVFileReader;
import printexercisetest.input.Job;
import printexercisetest.service.DisplayJobCost;
import printexercisetest.service.IPrintCost;
import printexercisetest.service.PrintCostCalulationService;

public class PrintManagement {
	
	private PrintManagement(){
		
	}
	
    private static class Singleton{
    	private static PrintManagement printManagement = new PrintManagement();
     }
    
    public static PrintManagement getPrintManagementInstance(){
    	return Singleton.printManagement;
    }
    
    public void run(){
    	
    	CSVFileReader fileReader = new CSVFileReader();
    	
    	IPrintCost printService = new PrintCostCalulationService(new P4SingleSide(),new P4DoubleSided());
    	
    	Job jobDetails = fileReader.getJobs();
    	
    	printService.calculateJobsCost(jobDetails);
    	
    	DisplayJobCost display = new DisplayJobCost(System.out);
    	
    	display.displayJobs(jobDetails);
    }
	
}
