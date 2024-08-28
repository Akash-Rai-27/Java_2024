package com.oops;

public class Oops_01 {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name = "max";
//        student1.marks = 430;
//        student1.rollno = 1;
//        System.out.println(student1.name+" "+student1.marks+" "+student1.rollno);

        Student st1 = new Student(1,"taz",330);
        Student st2 = new Student(st1);
//        System.out.println(st1.marks+" "+st1.name+" "+st1.marks);
        System.out.println(st2.rollno+" "+st2.name+" "+st2.marks);
        Student random = new Student();
        System.out.println(random.rollno+" "+random.name+" "+random.marks);

    }
}

// constructor
class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
// constructor overloading
    Student (Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

//   calling constructor from another constructor
    Student(){
        this(0,"defaultName",0);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object is destroyed");
    }
}



// create a class
//class Student {
//    int rollno ;
//    String name;
//    int marks;
//}


