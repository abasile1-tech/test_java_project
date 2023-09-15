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

    /*
     * Write a function that takes in a string of one or more words, and returns the
     * same string, but with all five or more letter words reversed Strings passed
     * in will consist of only letters and spaces. Spaces will be included only when
     * more than one word is present.
     */
    public static String reverseLongWords(String wordString) {
        String[] words = wordString.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    char c = words[i].charAt(j);
                    reversedString += c;
                }
            } else {
                reversedString += words[i];
            }
            if (i < words.length - 1) {
                reversedString += " ";
            }

        }

        return reversedString;
    }

    /*
     * Write a function that accepts an array of 10 integers (between 0 and 9), that
     * returns a string of those numbers in the form of a phone number. Example
     * create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns
     * "(123) 456-7890" The returned format must be correct in order to complete
     * this challenge. Don't forget the space after the closing parentheses!
     */
    public static String createPhoneNumber(int[] numsList) {
        String phoneNumber = "(";
        for (int i = 0; i < 10; i++) {
            phoneNumber += numsList[i];
            if (i == 2) {
                phoneNumber += ") ";
            } else if (i == 5) {
                phoneNumber += "-";
            }
        }
        return phoneNumber;
    }
}
