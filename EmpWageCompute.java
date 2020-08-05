
public class EmpWageCompute {

	private String companyName;
	private int wagePerHr;
	private int workingDays;
	private int workingHrs;
	private int dailywage;
	
	public int getDailywage() {
		return dailywage;
	}

	public void setDailywage(int dailywage) {
		this.dailywage = dailywage;
	}
	private int totalWage;

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getWagePerHr() {
		return wagePerHr;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public int getWorkingHrs() {
		return workingHrs;
	}

	public EmpWageCompute(String companyName, int wagePerHr, int workingDays, int workingHrs) {
		this.companyName = companyName;
		this.wagePerHr = wagePerHr;
		this.workingDays = workingDays;
		this.workingHrs = workingHrs;

	}
	@Override
	public String toString() {
		
		return "Total Employee wage for company "+ this.companyName+ " is " + this.totalWage;
	}

	
}
