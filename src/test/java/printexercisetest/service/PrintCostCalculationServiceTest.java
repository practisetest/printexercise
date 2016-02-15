package printexercisetest.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import printexercise.PrintApplicationMainClass;
import printexercise.impl.P4DoubleSided;
import printexercise.impl.P4SingleSide;
import printexercise.input.Job;
import printexercise.input.JobItem;
import printexercise.service.PrintCostCalulationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PrintCostCalculationServiceTest.AppConfig.class,loader=AnnotationConfigContextLoader.class)
public class PrintCostCalculationServiceTest {
	
	@Configuration
	public static class AppConfig{
		
		@Bean
		public P4SingleSide getsingleSided(){
			return new P4SingleSide();
		}
		
		@Bean
		public P4DoubleSided getdoubleSided(){
			return new P4DoubleSided();
		}
		
		@Bean
		public PrintCostCalulationService getPrintCostCalulationService(){
			return new PrintCostCalulationService();
		}
	}
	
	@Autowired
	PrintCostCalulationService  service;
	
	@Before
	public void testSetUp(){
		
	}
	
	@Test
	public void testCost(){
		JobItem[] items = new JobItem[2];
		items[0] = new JobItem(1,25,10,true);
		items[1] = new JobItem(2,55,13,false);
		
		Job job = new Job(items);
		
		service.calculateJobsCost(job);
		
		assertTrue( job.getTotalcost() == 25.00);
		
	}

	@Test
	public void displayJobItem(){
		PrintApplicationMainClass.main(null);
	}
	
}
