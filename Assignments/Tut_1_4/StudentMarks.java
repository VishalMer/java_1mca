import java.util.Scanner;

class StudentMarks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
            
            if (marks[i] > highest) 
            {
                highest = marks[i];
            }
            if (marks[i] < lowest) 
            {
                lowest = marks[i];
            }
        }
        
        double average = (double) sum / n;
        
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Average Marks: " + average);
    }
}