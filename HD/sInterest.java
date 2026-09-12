//create a simple intrest which is using a consept of command line argument.use paramitrise constructor and member function.even us the //concept of this key word and deonstrait the program
import java.util.*;
class SimpleIntrest
{
    int p, r, t;

    SimpleIntrest(int p, int r, int t)
    {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    void display()
    {
        int SimpleIntrest = (p * r * t) / 100;

        System.out.println("Principal Amount: " + p);
        System.out.println("Rate: " + r);
        System.out.println("Time: " + t);
        System.out.println("Simple Interest: " + SimpleIntrest);
    }
}

class sInterest{
    public static void main(String[] args)
    {
        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);

        SimpleIntrest s1 = new SimpleIntrest(p, r, t);

        s1.display();
    }
}