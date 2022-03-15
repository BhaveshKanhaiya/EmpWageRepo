

import java.util.Random;

     class EmpWage {

     int working_days = 0;
     int working_hrs = 0;
     int total_wage = 0;
     Random random = new Random();
     public void empCalculate () {
          while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS){
               working_days++;
               System.out.println("Day : " + working_days);
               int empAttendance = random.nextInt() % 2;
               if (empAttendance == Constants.IS_ABSENT) {
                    System.out.println("Employee is Absent");
               } else {
                    System.out.println("Employee is Present");
                    int emp_type = random.nextInt() % 2;
                    if (emp_type < 0) {
                         emp_type = -emp_type;
                    }
                    switch (emp_type) {
                         case Constants.IS_PART_TIME:
                              System.out.println("Part Time");
                              total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.PART_TIME_HR);
                              working_hrs = working_hrs + Constants.PART_TIME_HR;
                              break;
                         case Constants.IS_FULL_TIME:
                              System.out.println("Full Time");
                              total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                              working_hrs = working_hrs + Constants.FULL_TIME_HR;
                              break;
                    }
               }
          }
     }
     public void empWage() {
          System.out.println("Total Wage = " + total_wage);
          System.out.println("Total Working Hrs = " + working_hrs);
     }
     public static void main(String[] args) {
          EmpWage employee = new EmpWage();
          employee.empCalculate();
          employee.empWage();
     }
}



