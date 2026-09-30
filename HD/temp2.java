import java.util.*;

class student {
    int a;
    int b;
    temp t;

    student() {}

    student(int a, int b) {
        this.a = a;
        this.b = b;
        this.t = new temp(a);
    }

    // Deep Copy Constructor
    student(student s) {
        this.a = s.a;
        this.b = s.b;
        this.t = new temp(s.t);
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(t.x);
    }
}

class temp {
    int x;

    temp(int x) {
        this.x = x;
    }

    // Copy constructor for temp
    temp(temp t) {
        this.x = t.x;
    }
}

class tmp2 {
    public static void main(String[] args) {

        student s1 = new student(10, 20);
        student s2 = new student(s1);

        s2.t.x = 100;

        System.out.println("s1:");
        s1.display();

        System.out.println("s2:");
        s2.display();
    }
}