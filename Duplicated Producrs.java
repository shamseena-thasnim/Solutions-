    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
       int count = 0;
        Map<String, Integer> map = new HashMap<>();

        int n = price.size();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = name.get(i) + " " + price.get(i) + " " + weight.get(i);
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }

        for (int i : map.values()) {
            count += i - 1;
        }

        return count;
    }