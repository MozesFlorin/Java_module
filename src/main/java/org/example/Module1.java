package org.example;

public class Module1 extends BaseModule{                // This is a SubClass (child class)

    int duration = 16;

    String subject = "Methodologies/Project Management";

    String Test = "a test based on main concepts presented in the module";

    String location = "online only";

    public void display(){

        System.out.println("Presented " + super.location);
    }


}
