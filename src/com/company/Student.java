package com.company;

import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String courseName;

    public Student(String name, String surname, int age, String courseName){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courseName = courseName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCourseName() {
        return courseName;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of input");
        int count = scan.nextInt();
        System.out.println("1. Enter student\n" +
                "2. Show student\n" +
                "3. Exit");

        Student students[] = new Student[count];

        for (int i = 0;  i < count; i++) {

            int num = scan.nextInt();
            String name1, surname1, coursename1;
            int age1;
            if (num == 3) return;   //System.exit(0);
            else if (num == 1){
                name1 = scan.next();
                surname1 = scan.next();
                age1 = scan.nextInt();
                coursename1 = scan.next();
                students[i] = new Student(name1, surname1, age1, coursename1);
            }
            else if(num == 2){
                students[i].printArr(students);
            }
        }
    }
/////fdvdf
    public static void printArr(Student students[]) {

        for (int j = 0; j < students.length; j++) {
            if (students[j] != null) {
                System.out.println(students[j].getName());
                System.out.println(students[j].getSurname());
                System.out.println(students[j].getAge());
                System.out.println(students[j].getCourseName());
                System.out.println(students[j].toString());
            }
        }
    }
}
