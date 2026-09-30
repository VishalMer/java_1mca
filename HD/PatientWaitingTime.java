//you need to store patient waiting time in array identify maximum and minimum waiting time.
//calculate average waiting time. first find average using 2D array in java




import java.util.Scanner;

public class PatientWaitingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int patients = 3;
        int sessions = 4;

        int[][] waitingTimes = new int[patients][sessions];

        System.out.println("Enter waiting times for " + patients + " patients:");
        for (int i = 0; i < patients; i++) {
            for (int j = 0; j < sessions; j++) {
                System.out.print("Patient " + (i+1) + ", Session " + (j+1) + ": ");
                waitingTimes[i][j] = sc.nextInt();
            }
        }

        int min = waitingTimes[0][0];
        int max = waitingTimes[0][0];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < patients; i++) {
            for (int j = 0; j < sessions; j++) {
                int time = waitingTimes[i][j];
                if (time < min) min = time;
                if (time > max) max = time;
                sum += time;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("\n--- Results ---");
        System.out.println("Minimum Waiting Time: " + min);
        System.out.println("Maximum Waiting Time: " + max);
        System.out.println("Average Waiting Time: " + average);
    }
}
