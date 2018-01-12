package com.infoshareacademy.javaintroduction.task16;


/**
 * Created by waldemar on 2018-01-03.
 */
public class Schoolboy {

    public  static int[] grade;
    private String average;
    public String name;
    public String surname;




    public static void main(String[] args) {

        Schoolboy[] schoolboys = new Schoolboy[3];
        String[] name = {"Abraham", "Thomas", "Nikola"};
        String[] surname = {"Lincoln", "Edison", "Tesla"};
        for (int i = 0; i < schoolboys.length; i++) {
            schoolboys[i] = new Schoolboy();
            schoolboys[i].name = name[i];
            schoolboys[i].surname = surname[i];
            schoolboys[i].grade = new int[]{1, 2, 3, 4};
        }
        System.out.println("Schoolboys are");
        for (int i = 0; i < schoolboys.length; i++) {
            System.out.println(schoolboys[i].name + " " + schoolboys[i].name + ", " + calcAverage(schoolboys[i].grade) + " grade");
        }


        try {
            Schoolboy obj = new Schoolboy();
            obj.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// instance variables here

    public void run(String[] args) throws Exception {
        this.grade = new int[]{5, 4, 3 };


        // Calling getMax() method for getting max value
        int max = getMax(grade);
        System.out.println("Maximum Value is: " + max);

        // Calling getMin() method for getting min value
        int min = getMin(grade);
        System.out.println("Minimum Value is: " + min);

        Schoolboy thisObj = new Schoolboy();
        thisObj.calcAverage(int[] grade);
        System.out.println("Average Value is: " + thisObj.calcAverage(int[] grade));


    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray) {

        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static double calcAverage(int[] grade) {
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum = sum + grade[i];
        }
        double average = sum / (double) grade.length;
        return average;

    }
}