import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        System.out.println(getAge());
        getName("Gera");
        lastName("Gera", 25);
        System.out.println(addition(2, 3, 4));

    }

    public static int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur age");
        int age = scanner.nextInt();

        return age;
    }

    //task3

    public static void getName(String name){
        System.out.println("My name is: " + name);
    }

    //task4
    public static void lastName(String name, int age){
        System.out.println("name: " + name + ", age: " + age);

    }

    //task5
    public static int addition(int a, int b, int c){
        return a+b+c;

    }

    //



}
