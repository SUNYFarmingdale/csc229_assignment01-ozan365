
package com.mycompany.csc229_assignment01;

/**
 *
 * @author Ozan Demir
 */
public class NewClass {
    
     public static void main(String[] args) {
         //Instantiate testCourse1 using no-arg constructor
         Course testCourse1 = new Course();
         //Instantiate testCourse2 using constructor with 3 parameters
         Course testCourse2 = new Course("Intro to Mathematics", "MTH101", 12345);

         //Using toString to print out details of testCourse 1 and 2
         System.out.println(testCourse1);
         System.out.println(testCourse2);

         //Changing values of testCourse 1
         testCourse1.setName("Data Structures");
         testCourse1.setCode("CSC229");
         testCourse1.setID(23260);

         //Printing out details of testCourse1 after changes
         System.out.println(testCourse1);
     }
    
}
