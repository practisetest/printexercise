package printexercise.input;



public class Job {

	private JobItem[] jobitems;
	
	private double totalcost;
	
	public double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public Job(JobItem[] jobs){
		this.jobitems = jobs;
	}

	public JobItem[] getJobitems() {
		return jobitems;
	}

	public void setJobitems(JobItem[] jobitems) {
		this.jobitems = jobitems;
	}
	
	
	
}
