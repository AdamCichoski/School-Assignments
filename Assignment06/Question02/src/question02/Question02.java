package question02;

import fruits.Apple;
import fruits.Orange;
import animals.Chicken;
import animals.Dog;

/**
 * This program will create instances of classes that inherit parent classes, as
 * as some that implement an interface
 *
 * @author Adam Cichoski Assignment06 Question02
 */
public class Question02 {

    public static void main(String[] args) {
        Dog dog = new Dog("Charles Barkley", 2, "Husky");
        System.out.println(dog.toString());
        System.out.println("The dog's name: "+ dog.getName());
        System.out.println("The dog's age: "+ dog.getAge());
        System.out.println();

        Chicken chicken = new Chicken("No Name",4, 2);
        System.out.println(chicken.toString());
        System.out.println("The chicken’s name: " + chicken.getName());
        System.out.println("The chicken’s age: " + chicken.getAge());
        System.out.println("How to eat it? " + chicken.howToEat());
        System.out.println();
        
        Orange orange = new Orange(true, "Sweet");
        System.out.println(orange.toString());
        System.out.println("The taste of the orange: " + orange.getTaste());
        System.out.println("How to eat it? " + orange.howToEat());
        System.out.println();
        
        Apple apple = new Apple(true,"green");
        System.out.println(apple.toString());
        System.out.println("The color of the apple: " + apple.getColor());
        System.out.println("How to eat? " + apple.howToEat());
    }

}
