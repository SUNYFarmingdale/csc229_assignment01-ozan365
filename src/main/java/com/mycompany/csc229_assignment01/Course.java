/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author Ozan Demir
 */
public class Course {
    //instance variables name, code, and id
    private String name;
    private String code;
    private int id;

    //No-arg constructor
    public Course(){
        this.name = "Introduction Class";
        this.code = "A101";
        this.id = 10000;
    }

    //Constructor with 3 parameters
    public Course(String name, String code, int id) {
        this.name = name;
        this.code = code;
        this.id = id;
    }

    //getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters and setters for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //getters and setters for id
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    //toString method to provide details of course
    public String toString() {
        return "Name: " + this.name +
                "\nID: " + this.id +
                "\nCode: " + this.code;
    }
}


