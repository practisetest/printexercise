package printexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import printexercise.input.CSVFileReader;
import printexercise.input.Job;
import printexercise.service.DisplayJobCost;
import printexercise.service.IPrintCost;

@Component("printcost")
public class PrintManagementApplication {

	@Autowired
	CSVFileReader fileReader;
	@Autowired
	IPrintCost printService;
	@Autowired
	DisplayJobCost displaycost;
	
	public PrintManagementApplication( ){
		}
	
	public void displayFinalJobCosts(){
		
		Job alljobs = fileReader.getJobs();
		printService.calculateJobsCost(alljobs);
		displaycost.displayJobs(alljobs);
	}
}
