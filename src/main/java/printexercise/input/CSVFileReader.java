package printexercise.input;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

@Service
public class CSVFileReader extends Reader {
	
	//Header CSV
    private static final String [] FILE_HEADER_MAPPING = {"A","B","C"};
	
	//Job attributes
	private static final String SINGLE = "A";
	private static final String DOUBLE = "B";
	private static final String COLOR = "C";
	
	private static String fileName = "c:\\printjobs.csv";
	
	@Override
	public List<JobItem>  getJobsFromMSource() throws ApplicationException {
		
			FileReader fileReader = null;
			
			CSVParser csvFileParser = null;
			
		    CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);
	     
	        try {
	        	
	        	fileReader = new FileReader(getFileName());
	            csvFileParser = new CSVParser(fileReader, csvFileFormat);
	            
	        	List<JobItem> jobList = new ArrayList<JobItem>();
	            
	            List<CSVRecord> csvRecords = csvFileParser.getRecords(); 
	            
	            //Read the CSV file records starting from the second record to skip the header
	            for (int i = 0; i < csvRecords.size(); i++) {
	            	CSVRecord record =  csvRecords.get(i);
	            	JobItem job = new JobItem(i,getIntger(record.get(SINGLE)), 
	            					  getIntger(record.get(DOUBLE)),
	            					  getBoolean(record.get(COLOR)));
	            	jobList.add(job);	
				}
	            return jobList;
	         } catch ( IOException ex){
	        	 new ApplicationException("Failure in reading jobdetails.csv",ex);
	         }
	        finally {
	            try {
	                fileReader.close();
	                csvFileParser.close();
	            } catch (IOException e) {
	            	System.out.println("Error while closing fileReader/csvFileParser !!!");
	                e.printStackTrace();
	            }
	        }
	     return null;   
	}
	
	@SuppressWarnings("static-access")
	public void setFileName(String filename){
		this.fileName = filename;	
	}
	
	private int getIntger(String str){
		if(str == null)
			return 0;
		else
		 return Integer.parseInt(str.trim());
	}
	
	private boolean getBoolean(String str){
		if(str == null)
			return false;
		else
		 return Boolean.parseBoolean(str.trim());
	}
	
	private String getFileName(){
		return fileName;
	}
}
