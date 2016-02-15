package printexercisetest.input;

import java.util.List;

public abstract class Reader {
	
	public final Job[] getJobs(){
		List<Job> jobList  = getJobsFromMSource();
		//perform any operation on jobs
		//return array
		Job[] jobs = new Job[jobList.size()];
		
		return jobs = jobList.toArray(jobs);
	}
	
	protected abstract List<Job>  getJobsFromMSource();
	
}
