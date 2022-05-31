package Mitul;


public class oop2 {
    // with out create  oop2 class object run main function use static keyword  ..
    public static void main(String[] args) {
        Human Mitul = new Human(12,"Mitul",1000,true);
        System.out.println(Human.population);
        Human Keyur = new Human(12,"Mitul",1000,true);
        System.out.println(Human.population);

    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        oop2 obj = new oop2();
        obj.greeting();
    } 

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}
class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age,String name, int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
