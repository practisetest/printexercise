package printexercisetest.input;

import java.math.BigDecimal;

public class Job {

	private JobItem[] jobitems;
	
	private BigDecimal totalcost;
	
	public BigDecimal getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(BigDecimal totalcost) {
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
