import java.util.*;
// interface Animal{
//     void walk();
// }
// interface Herbivore{

// }

// class Tiger implements Animal, Herbivore{

//     public void walk(){

//     }
// }

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.colour = "Blue";
        // pen1.type = "Ball";
        // pen1.printcolour();

        // Pen pen2 = new Pen();
        // pen2.colour = "black";
        // pen2.type = "Gel";
        // pen2.printcolour();

        


        // Student s2 = new Student();
        // s2.name = "Rugved";
        // s2.age = 21;
        // s2.printinfo(s2.age);

        // Triangle t1 = new Triangle();
        // t1.color = "Red";
        // t1.area(2,4);

        // equitriangle t2 = new equitriangle();
        // t2.area(3);
        Horse h = new Horse();
        h.walk();
        




        
    }

}

// class Student{
//     String name;
//     int age;

//     public void printinfo(String name){
//         System.out.println(this.name);
//     }

//     public void printinfo(int age){
//         System.out.println(this.age);
//     }

//     public void printinfo(String name,int age){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
 
// class Pen{

//     String colour;
//     String type;

//     public void write(){
//         System.out.println("Writing Something");
//     }

//     public void printcolour(){
//         System.out.println(this.colour);
//     }

// }

class Shape{
    String color;


    public void area(){
        System.out.println("DIsplays Area");

    }
}

class Triangle extends Shape {

    public void area(int lenght, int height){
        System.out.println(lenght*height);
    }

}

class equitriangle extends Triangle{
    public void area(int l){
        System.out.println(l*l);

    }
}

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    
}

class Horse extends Animal{
    Horse(){
        System.out.println("Hi my name is Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
        
    }
}