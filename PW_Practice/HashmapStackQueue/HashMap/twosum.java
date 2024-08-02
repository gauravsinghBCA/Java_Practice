package HashMap;
import java.util.*;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number to fine sum");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                break;
            } else if (map.containsKey(target - arr[i])) {
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                break;
            }

        }
        System.out.println("two sum is: " + result[0] + "," + result[1]);
        sc.close();
    }
}
