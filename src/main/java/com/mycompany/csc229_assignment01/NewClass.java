
package com.mycompany.csc229_assignment01;

/**
 *
 * @author Ozan Demir
 */
public class NewClass {
    
     public static void main(String[] args) {
         Course testCourse = new Course();
         System.out.println(testCourse);

         testCourse.setName("Data Structures");
         testCourse.setID(23260);
         testCourse.setCode("CSC229");

         System.out.println(testCourse);
     }
    
}
