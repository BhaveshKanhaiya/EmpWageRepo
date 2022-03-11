package com.infogalaxy;

import java.sql.SQLOutput;
import java.util.Random;


public class EmpWage {
    public static void main(String[] args) {
        //Welcome Message for User
        System.out.println("Welcome To Employee Wage Builder Made By Bhavesh Kanhaiya");
        //UC-2 Calculate Daily Employee Wage or Hour
        final int WAGE_PER_HR = 20;
        final int PART_TIME = 4;
        final int FULL_TIME = 8;
        int total_wage = 0;

        //UC-1 Checking for Employee Present or Absent
        //Create Random object and generate 0 or 1 using % Operator
        Random random = new Random();
        int empAttendance = random.nextInt() % 2;
        if (empAttendance == 0) {
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is Present");

            //UC-3 Employee Wage Part Time or Full Time
            int emp_type = random.nextInt() % 2;
            //UC-4 Using Switch Case Statement
            switch(emp_type){
                case 0:
                    System.out.println("Employee is Part Time");
                    total_wage = PART_TIME * WAGE_PER_HR;
                    break;
                case 1:
                case -1:
                    System.out.println("Employee is Full Time");
                    total_wage = FULL_TIME * WAGE_PER_HR;
                    break;
            }
        }
        System.out.println("Employee Wage=" +total_wage );
    }
}




