package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        Student.printNums();

        Student john = new Student("John");
        john.printName();

        Student.printFizzBuzz();

        System.out.println(Student.reverseLongWords("Hey fellow warriors"));
        System.out.println(Student.reverseLongWords("This is a test"));
        System.out.println(Student.reverseLongWords("This is another test"));
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(Student.createPhoneNumber(numbers));
    }
}