package printexercise;

import printexercise.impl.P4DoubleSided;
import printexercise.impl.P4SingleSide;
import printexercise.input.CSVFileReader;
import printexercise.input.Job;
import printexercise.service.DisplayJobCost;
import printexercise.service.IPrintCost;
import printexercise.service.PrintCostCalulationService;

public class PrintManagementByCreatingSingleton {
	
	private PrintManagementByCreatingSingleton(){
		
	}
	
    private static class Singleton{
    	private static PrintManagementByCreatingSingleton printManagement = new PrintManagementByCreatingSingleton();
     }
    
    public static PrintManagementByCreatingSingleton getPrintManagementInstance(){
    	return Singleton.printManagement;
    }
    
    public void run(){
    	
    	CSVFileReader fileReader = new CSVFileReader();
    	
    	IPrintCost printService = new PrintCostCalulationService(new P4SingleSide(),new P4DoubleSided());
    	
    	Job jobDetails = fileReader.getJobs();
    	
    	printService.calculateJobsCost(jobDetails);
    	
    	DisplayJobCost display = new DisplayJobCost();
    	
    	display.displayJobs(jobDetails);
    }
	
}
