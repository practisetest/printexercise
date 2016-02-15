package printexercisetest;

public class PrintManagement {
	
	private PrintManagement(){
		
	}
	
    private static class Singleton{
    	private static PrintManagement printManagement = new PrintManagement();
     }
    
    public PrintManagement getPrintManagementInstance(){
    	return Singleton.printManagement;
    }
    
    public void run(){
    	
    }
	
}
