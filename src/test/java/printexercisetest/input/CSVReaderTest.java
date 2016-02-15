package printexercisetest.input;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import printexercise.input.CSVFileReader;
import printexercise.input.JobItem;

import java.util.List;

public class CSVReaderTest {
	
	private CSVFileReader reader ;
	
	@Before
	public void setUp(){
		reader = new CSVFileReader();
	}
	
	@Test
	public void readJobs(){
	List<JobItem> jobList =	reader.getJobsFromMSource();
	assertTrue(jobList.size() > 0);
	}

}
