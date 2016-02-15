package printexercisetest.impl;

import java.math.BigDecimal;

public interface IPrintJobCostCalculator {
	enum jobtype { BLACKANDWHITE, COLOR }
	BigDecimal calculateCost(int noofpages,jobtype type);
}
