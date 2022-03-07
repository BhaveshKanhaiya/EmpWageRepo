package com.infogalaxy;

import java.util.Random;

public class EmpWage {
    public static void main(String[] args) {
        // UC-1 Emp Attendence
        Random r = new Random();
        int empAttendance = r.nextInt() % 2;
        System.out.println(empAttendance);
        if (empAttendance == 0) {
            System.out.println("Employee Is Absent");
        } else {
            System.out.println("Employee Is Present");
        }
    }


}
