package org.example;

public class Inherit {
     /*
    public static void main(String[] args) {

        Module1 Agile = new Module1();
        Agile.infoModule();
        System.out.println("Presented" + Agile.location);
        System.out.println("Title" + Agile.subject);
        Agile.display();
        System.out.println("Course duration is " + Agile.duration + "hours");
        System.out.println("Evaluation consists of" + Agile.Test);
        Agile.endCourse("10.10.2022");

    }


      */
    // Create a Module2 child class of BaseModule, that is like Module1, having the following values:
    // duration = 12
    // subject = "Applied Data Visualisation"
    // Project = "a project based on applied concepts presented in the module"
    // End of the course is: "24.10.2022"
    // Then use it to create a "AppDataVis" object in the Inherit class, just like the Agile object

    public static void main(String[] args) {

        Module2 Agile = new Module2();
        Agile.infoModule();
        System.out.println("Presented " + Agile.location);
        System.out.println("Title " + Agile.subject);
        System.out.println("Course duration is " + Agile.duration + "hours");
        System.out.println("Evaluation consists of " + Agile.project);
        Agile.endCourse("24.10.2022");

    }
}
