package printexercise.input;

import printexercise.impl.IPrintJobCostCalculator.JOBTYPE;


public class JobItem {
     
	private int  nosinglesidedPrint = 0;
	private int  nodoublesidedPrint = 0;
	private int  jobsequence = 0;
	private JOBTYPE color ;
	private double price;
	
	public JobItem(int jobsequence, int singlesided, int doublesided, boolean b) {
		
		setColor(b ?  JOBTYPE.COLOR : JOBTYPE.BLACKANDWHITE);
		this.setJobsequence(jobsequence);
		this.setNosinglesidedPrint(singlesided);
		this.setNodoublesidedPrint(doublesided);
		
	}


	public int getNosinglesidedPrint() {
		return nosinglesidedPrint;
	}


	public void setNosinglesidedPrint(int nosinglesidedPrint) {
		this.nosinglesidedPrint = nosinglesidedPrint;
	}


	public int getNodoublesidedPrint() {
		return nodoublesidedPrint;
	}


	public void setNodoublesidedPrint(int nodoublesidedPrint) {
		this.nodoublesidedPrint = nodoublesidedPrint;
	}


	public JOBTYPE getColor() {
		return color;
	}


	public void setColor(JOBTYPE color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getJobsequence() {
		return jobsequence;
	}


	public void setJobsequence(int jobsequence) {
		this.jobsequence = jobsequence;
	}

}
