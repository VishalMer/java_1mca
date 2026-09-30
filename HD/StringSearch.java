import java.util.Scanner;

class StringSearch
{
    static boolean search(String str, String search)
    {
        return str.contains(search);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter string to search: ");
        String search = sc.nextLine();

        if(search(str, search))
            System.out.println("String found");
        else
            System.out.println("String not found");
    }
}