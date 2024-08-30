package com.oops.Oops_06.CompareObject;

public class Students implements Comparable<Students> {
    int rollno;
    float marks;

    public Students(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Students o) {
        int diff  = (int)(this.marks - o.marks);

        return diff;
    }
}
