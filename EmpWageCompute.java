public class EmpWageCompute{

public static void main(String[] args){
	System.out.println("Welcome");
	int isFullTime = 1;

		int empCheck = (int)Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
		if(empCheck == isFullTime)
		{
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}

	int wagePerHr=20;
	final int fulldayHour=8;
	final int partTimeHour=4;
	int workingHrs=0;
	final int check = (int)Math.floor(Math.random()*10)%2; // 0 for full time,1 for part time
	switch(check){
	case 0:
			workingHrs=fulldayHour;
			break;
	case 1:
			workingHrs=partTimeHour;
			break;
	default:
			System.out.println("Bad inputs");
			break;


	}

	int dailyWage=wagePerHr*workingHrs;
	System.out.println("Daily full time employee wage is "+dailyWage);
	int monthlyWage=dailyWage*20;
	System.out.println("Monthly wage of an employee is "+monthlyWage);
}

}

