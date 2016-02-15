package printexercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * This file is our entry in the application.
 *
 */
@Configuration					
@ComponentScan(basePackages = "printexercise")
public class PrintApplicationMainClass {

	    public PrintApplicationMainClass(){
	    	
	    }
	
		public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(PrintApplicationMainClass.class);
	    PrintManagementApplication printApp = ctx.getBean("printcost",PrintManagementApplication.class);
	    printApp.displayFinalJobCosts();
		
    	}
	
}
