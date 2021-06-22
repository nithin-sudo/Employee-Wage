package com.bridgelabz;
public class EmployeeWage {
        public static void main(String[] args){
                int IS_FULL_TIME=1;
                /**
                 * Generating a random number by using that we are checking employee attendance.
                 */
                double random=Math.floor(Math.random()*10)%2;
                if (random==IS_FULL_TIME)
                {
                        System.out.println("Employee is present");
                }
                else
                {
                        System.out.println("Employee is absent");
                }
        }
}
