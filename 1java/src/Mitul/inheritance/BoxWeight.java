package Mitul.inheritance;
import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

public BoxWeight(double l , double h , double w, double weight) {
        // used to initialise values present in parent class
//        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight); // print perent class weight
//        System.out.println(this.weight); // print current class weight


        System.out.println("this is W" + w);
        System.out.println("this is h" + h);
        this.weight = weight;
    }

}

