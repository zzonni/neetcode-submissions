class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[n+1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        // traverse each bucket, check if its not empty and contains
        // exact amount of number = k, then return, else check other next bucket
        // until reach k

        int kIndex = 0; // track index in res, kIndex < k
        for (int i = buckets.length - 1; i > 0 && kIndex < k; i--) {
            if (buckets[i].size() == 0) continue;
            for (int num : buckets[i]) {
                res[kIndex] = num;
                kIndex++;
            }
        }
        return res;
    }
}
