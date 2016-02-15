package printexercisetest.input;

import java.math.BigDecimal;

import printexercisetest.impl.IPrintJobCostCalculator.jobtype;

public class Job {
     
	private int  nosinglesidedPrint = 0;
	private int  nodoublesidedPrint = 0;
	private jobtype color ;
	private BigDecimal price;
	
	public Job(int singlesided, int doublesided, boolean b) {
		
		setColor(b ?  jobtype.COLOR : jobtype.BLACKANDWHITE);
		
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


	public jobtype getColor() {
		return color;
	}


	public void setColor(jobtype color) {
		this.color = color;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
