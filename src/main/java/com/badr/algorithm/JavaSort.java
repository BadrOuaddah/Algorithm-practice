package com.badr.algorithm;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentCompare implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if((s1.getCgpa()*100) != (s2.getCgpa()*100)){
            int value = (int)(s2.getCgpa()*1000- s1.getCgpa()*1000);
            return value;
        }

        else if(!(s1.getFname().equals(s2.getFname()))){
            return s1.getFname().compareTo(s2.getFname());
        }
        else{
            return s1.getId() - s2.getId();
        }
    }
}
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        StudentCompare studentCompare = new StudentCompare();
        Collections.sort(studentList, studentCompare);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
