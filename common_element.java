import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class common_element {
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : v1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : v2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);  // Reduce frequency count in map
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};

        // Getting the common elements
        ArrayList<Integer> result = common_element(v1, v2);

        // Printing the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
