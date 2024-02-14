import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Ali","Kaldarbekov",20);
        System.out.println("\nName: " + myClass.name + " \nLastname: " + myClass.lastname + " \nAge: " + myClass.age);

        MyClass myClass1 = new MyClass("ALi", "kaldarbekov", 20, myClass.grups,"lagman");
        System.out.println("\nName: " + myClass.name + " \nLastname: " + myClass.lastname + " \nAge: " + myClass.age + " \nGrup: " + Arrays.toString(myClass.grups) + " \nFood: " + Arrays.toString(myClass1.thefood));








    }
}