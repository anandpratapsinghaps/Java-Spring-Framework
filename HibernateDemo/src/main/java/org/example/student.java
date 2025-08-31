package org.example;

public class student {
    private int rollno;
    private  String sname;
    private int marks;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
