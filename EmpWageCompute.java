import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpWageCompute {

	public static void main(String[] args) {
		System.out.println("Welcome");
		int isFullTime = 1;

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		// System.out.println(empCheck);
		if (empCheck == isFullTime) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}

		int wagePerHr = 20;
		wageComputeforEmp(wagePerHr);
		wageTillCondition(wagePerHr);

		// Day22 UC8 -- Compute wage for multiple companies
		Map<String, Integer> companyWiseWage = new HashMap<>();
		List<String> companies = new LinkedList<>();
		companies.add("Symantic");
		companies.add("TechInfo");
		companies.add("doodle");
		companies.add("MegaHard");
		companies.add("Locus");
		Scanner sc = new Scanner(System.in);
		for (String company : companies) {

			System.out.println("For " + company + " Enter below info");
			System.out.println("Enter daily working hours");
			int workingHrs = sc.nextInt();
			System.out.println("Enter wage per hour");
			wagePerHr = sc.nextInt();
			System.out.println("Enter working hours per month");
			int workingDays = sc.nextInt();

			int monthlywage = monthlyWageCompute(workingHrs, wagePerHr, workingDays);
			companyWiseWage.put(company, monthlywage);

		}
		sc.close();

		for (String company : companyWiseWage.keySet()) {
			System.out.println("For company " + company + " monthly emp wage is " + companyWiseWage.get(company));

		}

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
		int monthlyWage = monthlyWageCompute(workingHrs, wagePerHr, 20);
		System.out.println("Monthly wage of an employee is " + monthlyWage);
	}

	public static int dailyWageCompute(int workingHrs, int wagePerHr) {
		int dailyWage = wagePerHr * workingHrs;
		return dailyWage;

	}

	public static int monthlyWageCompute(int workingHrs, int wagePerHr, int workingDays) {

		int dailyWage = dailyWageCompute(workingHrs, wagePerHr);
		return dailyWage * workingDays;

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
