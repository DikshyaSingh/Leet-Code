import java.util.Arrays;

public class The_Number_of_the_Smallest_Unoccupied_Chair {



        public int smallestChair(int[][] times, int targetFriend) {
            int[] targetTime = times[targetFriend];
            Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));

            int n = times.length;
            int[] chairTime = new int[n];

            for (int[] time : times) {
                for (int i = 0; i < n; i++) {
                    if (chairTime[i] <= time[0]) {
                        chairTime[i] = time[1];
                        if (Arrays.equals(time, targetTime)) return i;
                        break;
                    }
                }
            }
            return 0;
        }

        public static void main(String[] args) {
            The_Number_of_the_Smallest_Unoccupied_Chair solution = new The_Number_of_the_Smallest_Unoccupied_Chair();

            int[][] times = {
                    {1, 4},
                    {2, 3},
                    {4, 6}
            };

            int targetFriend = 1;
            int result = solution.smallestChair(times, targetFriend);

            System.out.println("The smallest chair for the target friend is: " + result);
        }

}