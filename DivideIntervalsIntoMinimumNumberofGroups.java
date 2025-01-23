import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivideIntervalsIntoMinimumNumberofGroups {
    public static void main(String[] args) {
        int[][] intervals =
        {
                {1, 3},
                {2, 5},
                {4, 6},
                {7, 8} };

        System.out.println("Maximum concurrent intervals: " + maxConcurrentIntervals(intervals));
    }

    public static int maxConcurrentIntervals(int[][] intervals) {
        List<int[]> events = new ArrayList<>();

        // Create events for each start and end of the interval
        for (int[] interval : intervals) {
            events.add(new int[] { interval[0], 1 });  // Start event
            events.add(new int[] { interval[1] + 1, -1 }); // End event
        }

        // Sort the events: first by time, then by type (start event before end event)
        Collections.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // Sort by type (1 before -1)
            } else {
                return Integer.compare(a[0], b[0]); // Sort by time
            }
        });
        int concurrentIntervals = 0;
        int maxConcurrentIntervals = 0;

        // Sweep through the events
        for (int[] event : events) {
            concurrentIntervals += event[1]; // Track currently active intervals
            maxConcurrentIntervals = Math.max(maxConcurrentIntervals, concurrentIntervals); // Update max
        }

        return maxConcurrentIntervals;
    }
}
