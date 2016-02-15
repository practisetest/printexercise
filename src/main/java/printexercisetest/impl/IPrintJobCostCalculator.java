package printexercisetest.impl;

import java.math.BigDecimal;

public interface IPrintJobCostCalculator {
	enum JOBTYPE { BLACKANDWHITE, COLOR }
	BigDecimal calculateCost(int noofpages,JOBTYPE type);
}
