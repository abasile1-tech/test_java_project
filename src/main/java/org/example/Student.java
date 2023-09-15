package org.example;

public class Student {
    private String studentName;

    public Student(String name) {
        studentName = name;
    }

    public void printName() {
        System.out.println(studentName);
    }

    public static void printNums() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void printFizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d: fizzbuzz\n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%d: fizz\n", i);
            } else if (i % 5 == 0) {
                System.out.printf("%d: buzz\n", i);
            }
        }
    }

    // Write a function that takes in a string of one or
    // more words, and returns the same string,
    // but with all five or more letter words reversed
    // Strings passed in will consist of only letters and spaces.
    // Spaces will be included only when more than one word is
    // present.
    public static String reverseLongWords(String wordString) {
        String reversedString = "";
        for (int i = wordString.length() - 1; i >= 0; i--) {
            char c = wordString.charAt(i);
            reversedString += c;
        }
        return reversedString;
    }
}
