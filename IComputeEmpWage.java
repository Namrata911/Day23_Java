
public interface IComputeEmpWage {
	
	public void addCompanyEmpWage(String companyName, int wagePerHr, int workingDays, int workingHrs);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
