class TimeMap {
    private Map<String, List<int[]>> map;
    private Map<String, List<String>> vals;
    public TimeMap() {
        map = new HashMap<>();
        vals = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new int[]{timestamp});
        vals.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<int[]> times = map.get(key);
        List<String> values = vals.get(key);

        // Binary search for floor timestamp
        int left = 0, right = times.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (times.get(mid)[0] <= timestamp) {
                result = values.get(mid); // valid candidate, try for larger
                left = mid + 1;           // search right for closer floor
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
