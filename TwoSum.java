import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a = 0; a < numbers.length; a++) {
            if (map.containsKey(target - numbers[a])) {
                result[1] = a;
                result[0] = map.get(target - numbers[a]);
                return result;
            }
            map.put(numbers[a], a);
        }
        return result;
    }
}

