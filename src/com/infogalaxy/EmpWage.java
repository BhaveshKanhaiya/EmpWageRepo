package com.infogalaxy;

import java.sql.SQLOutput;
import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {
        // Welcom message for user
        System.out.println("Welcom To Employee Wage Calculation Problem");
        //UC-2 Calculate Daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
        // UC-1 Emp Attendence
        Random r = new Random();
        int empAttendance = r.nextInt() % 2;
        System.out.println(empAttendance);
        if (empAttendance == 0) {
            System.out.println("Employee Is Absent");
        } else {
            System.out.println("Employee Is Present");
            total_wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Total Wage =" + total_wage);
    }
}



