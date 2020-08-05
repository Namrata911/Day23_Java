public class EmpWageCompute{

	private String companyName;
	private int wagePerHr;
	private int workingDays;
	private int workingHrs;

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

	public static void empAttendance() {
		int present = 1;

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);
		if (empCheck == present) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome");
		empAttendance(); // attendace check is implemented as a static method now

		// Day23 UC9 -- building objects for multiple companies to compute wage

		EmpWageCompute company1 = new EmpWageCompute("Synechron", 5, 20, 8);
		System.out.print("For Company " + company1.getCompanyName() + " Total wage is ");
		System.out.println(monthlyWageCompute(company1));
		EmpWageCompute company2 = new EmpWageCompute("Doodle", 10, 22, 6);
		System.out.print("For Company " + company2.getCompanyName() + " Total wage is ");
		System.out.println(monthlyWageCompute(company2));

	}

//Use case 7 -- Created separate method to compute wage for employee
	public static void wageComputeforEmp(int wagePerHr) {
		final int fulldayHour = 8;
		final int partTimeHour = 4;
		int workingHrs = 0;
		final int check = (int) Math.floor(Math.random() * 10) % 2; // 0 for full time,1 for part time
		switch (check) {
		case 0:
			workingHrs = fulldayHour;
			break;
		case 1:
			workingHrs = partTimeHour;
			break;
		default:
			System.out.println("Bad inputs");
			break;

		}

		int dailyWage = dailyWageCompute(workingHrs, wagePerHr);
		System.out.println("Daily full time employee wage is " + dailyWage);
		int monthlyWage = 20 * dailyWage;
		System.out.println("Monthly wage of an employee is " + monthlyWage);
	}

	public static int dailyWageCompute(int workingHrs, int wagePerHr) {
		int dailyWage = wagePerHr * workingHrs;
		return dailyWage;

	}

	public static int monthlyWageCompute(EmpWageCompute empwagecompute) {

		int dailyWage = dailyWageCompute(empwagecompute.workingHrs, empwagecompute.wagePerHr);
		return dailyWage * empwagecompute.workingDays;

	}

//Use Case 6 Calculate Wages till a condition of total working hours or days is reached for a month
	public static void wageTillCondition(int empRatePerHr) {
		int hoursReached = 0, maxHours = 100;
		final int fullTime = 0;
		final int partTime = 1;
		int empHours = 0, monthlyWage = 0;
		while (hoursReached < maxHours) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case fullTime:

				empHours = 8;
				// System.out.println("Full Time");
				break;

			case partTime:

				empHours = 4;
				// System.out.println("Part Time");
				break;
			default:

				empHours = 0;
				// System.out.println("Absent");
			}

			hoursReached += empHours;

		}
		System.out.println("Hours worked for month " + hoursReached);

		monthlyWage = hoursReached * empRatePerHr;
		System.out.println("Wage for this month is " + monthlyWage);
	}

}
