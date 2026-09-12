//factorial cmdline, this keyword, default constructer and parameterised constructer


class factorial
{
    int factorial;

    factorial()
    {
        factorial = 1;
        System.out.println("Default Constructor Called");
    }

    factorial(int factorial)
    {
        this.factorial = factorial;

        int fact = 1;

        for(int i = 1; i <= this.factorial; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + this.factorial + " = " + fact);
    }
}

class newFactorial
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);

        factorial s1 = new factorial();

        factorial s2 = new factorial(a);
    }
}