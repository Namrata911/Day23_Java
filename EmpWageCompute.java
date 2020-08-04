public class EmpWageCompute{

public static void main(String[] args){
   System.out.println("Welcome");
   int isFullTime = 1;

      int empCheck = (int)Math.floor(Math.random()*10)%2;
     // System.out.println(empCheck);
      if(empCheck == isFullTime)
      {
         System.out.println("Employee is present");
      }
      else {
         System.out.println("Employee is absent");
      }

   int wagePerHr=20;
   wageCompute(wagePerHr);

   wageTillCondition(wagePerHr);

}

//Use case 7 -- Created separate method to compute wage for employee
public static void wageCompute(int wagePerHr) {
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


//Use Case 6 Calculate Wages till a condition of total working hours or days is reached for a month
public static void wageTillCondition(int empRatePerHr){
int hoursReached=0,maxHours=100;
final int fullTime=0;
final int partTime=1;
int empHours=0,monthlyWage=0;
while(hoursReached<maxHours) {
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

         hoursReached+=empHours;

}
      System.out.println("Hours worked for month "+hoursReached);
   

      monthlyWage=hoursReached*empRatePerHr;
      System.out.println("Wage for this month is " + monthlyWage);
   }




}

