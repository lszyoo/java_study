package question;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HotPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[2 * m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        Integer sum = 1;
        for (int i = 0; i < arr.length - 2; i = i + 2) {
            map.put(Integer.valueOf(arr[i + 1]),sum++);
            for (int j = 0; j < arr.length; j = j + 2) {
                if (arr[i + 1] == arr[j] && arr[j + 1] != arr[i]){
                    map.put(Integer.valueOf(arr[j + 1]),sum++);
                }
            }
        }
        int count = 0;
        Set<Integer> set = map.keySet();
        for(Integer key:set){
            if (map.get(key).intValue() == n)
                count++;
        }
        System.out.println(count);
    }
}
