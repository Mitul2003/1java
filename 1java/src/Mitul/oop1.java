package Mitul;

import Mitul.A.Message;

import static Mitul.A.Message.messagee;

class Student{
    int rno;
    String name;

    Student(int no, String namee){
        this.rno = no;
        this.name = namee;
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
    }

    Student(){
//        this.rno = 11;
//        this.name = "Keyur";
        this(11,"Keyur");
    }

    void greeting(){
        System.out.println("My Name is : " + this.name);
    }

}
public class oop1 {

    public static void main(String[] args) {
        Student s1 = new Student(11,"Mitul");
        s1.greeting();

        Student s2 = new Student();
        Student s3 = new Student(s1);

        System.out.println(s3);

        Student s4 = s1;
        System.out.println(s4.name);
        s1.name = "Dudhat";
        System.out.println(s4.name);

        final String name = "Mitul"; // do not modify the variable value
                                    // always insiliz while declare
//        name = "Dudhat";

        // pacakag modify
         messagee();


    }
}
