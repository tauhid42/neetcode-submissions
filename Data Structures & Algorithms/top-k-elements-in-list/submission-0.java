

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Store unique numbers
        Integer[] keys = map.keySet().toArray(new Integer[0]);

        // Sort by frequency
        Arrays.sort(keys, (a, b) -> map.get(b) - map.get(a));

        // Return top k numbers
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = keys[i];
        }

        return result;
    }
}

