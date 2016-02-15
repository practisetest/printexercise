package printexercisetest;

public class PrintApplicationMainClass {

	public static void main(String[] args) {
		
		PrintManagement printservice = PrintManagement.getPrintManagementInstance();
		
		printservice.run();
	}
	
}
