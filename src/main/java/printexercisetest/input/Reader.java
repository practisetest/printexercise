package printexercisetest.input;

import java.util.List;

public abstract class Reader {
	
	public final Job getJobs(){
		List<JobItem> jobList  = getJobsFromMSource();
		JobItem[] jobs = new JobItem[jobList.size()];
		Job job = null;
		if(jobs != null){
			job = new Job(jobList.toArray(jobs));
		}
		return job;
	}
	
	protected abstract List<JobItem>  getJobsFromMSource();
	
}
