package printexercise.impl;


public interface IPrintJobCostCalculator {
	enum JOBTYPE { BLACKANDWHITE, COLOR }
	double calculateCost(int noofpages,JOBTYPE type);
}
