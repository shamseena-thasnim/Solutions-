    public static int countFaults(int n, List<String> logs) {
    // Write your code here
        Map<String, Integer> map = new HashMap<>();
        String id, status;
        int count = 0;
 
        for (String log : logs) {
            String[] logParts = log.split(" ");
            id = logParts[0];
            status = logParts[1];
 
            if (!map.containsKey(id) && status.equals("error")) {
                map.put(id, 1);
            } else if (map.containsKey(id) && status.equals("error")) {
                map.put(id, map.get(id) + 1);
            } else if (map.containsKey(id) && status.equals("success")) {
                map.put(id, 0);
            } else {
                continue;
            }
 
            if (map.containsKey(id) && map.get(id) == 3) {
                map.put(id, 0);
                count++;
            }
        }
 
        return count;
    }