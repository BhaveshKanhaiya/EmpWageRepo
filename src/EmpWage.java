

import java.util.Random;

     class EmpWage {
        public static void main(String[] args) {
            //Welcome Message for User
            System.out.println("Welcome To Employee Wage Builder Made By Bhavesh Kanhaiya");
            //UC-2 Calculate Daily Employee Wage or Hour
            //UC-1 Checking for Employee Present or Absent
            int working_days = 0;
            int working_hrs = 0;
            Random random = new Random();
            //UC-5 20 Working Day Per Month
            while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS ) {
                int total_wage = 0;
                working_days++;
                System.out.println("Day : "+working_days);
                int empAttendance = random.nextInt() % 2;
                if (empAttendance == Constants.IS_ABSENT ) {
                    System.out.println("Employee is Absent");
                } else {
                    System.out.println("Employee is Present");
                    int emp_type = random.nextInt() % 2;
                    if(emp_type < 0){
                        emp_type = -emp_type;
                    }
                    //UC-3 Employee Wage Part Time or Full Time
                    //UC-4 Using Switch Case Statement
                    switch (emp_type) {
                        case Constants.IS_PART_TIME:
                            System.out.println("Part Time");
                            total_wage =Constants.WAGE_PER_HR * Constants.PART_TIME_HR;
                            working_hrs = working_hrs + Constants.PART_TIME_HR;
                            break;
                        case Constants.IS_FULL_TIME:
                            System.out.println("Full Time");
                            total_wage = Constants.WAGE_PER_HR * Constants.FULL_TIME_HR;
                            working_hrs = working_hrs + Constants.FULL_TIME_HR;
                            break;
                    }
                }
                System.out.println("Total Wage = " + total_wage);
                System.out.println("Total Working Hrs = "+ working_hrs);
            }
        }
    }



