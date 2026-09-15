import java.util.Scanner;

class StudentMarksJagged 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[2];
        marks[1] = new int[4];
        marks[2] = new int[3];
        
        String[] students = {"Hardik", "Krunal", "Kishan"};

        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Enter marks for " + students[i] + ":");
            for (int j = 0; j < marks[i].length; j++) 
            {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < marks.length; i++) 
        {
            System.out.print(students[i] + "'s marks: ");
            for (int j = 0; j < marks[i].length; j++) 
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}