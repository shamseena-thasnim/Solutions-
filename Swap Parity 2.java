public static String getLargestNumber(String num) {
        int key = 0;
        Map<Integer, StringBuilder> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        map.put(key, new StringBuilder().append(num.charAt(0)));
 
        for (int i = 1; i < num.length(); i++) {
            if ((num.charAt(i) - '0') % 2 == 0) {
                if ((num.charAt(i - 1) - '0') % 2 != 0) {
                    key++;
                }
                map.putIfAbsent(key, new StringBuilder());
                map.get(key).append(num.charAt(i));
            } else {
                if ((num.charAt(i - 1) - '0') % 2 != 1) {
                    key++;
                }
                map.putIfAbsent(key, new StringBuilder());
                map.get(key).append(num.charAt(i));
            }
        }
 
        for (int i = 0; i <= key; i++) {
            map.get(i).chars().boxed()
                    .sorted((a, b) -> b - a)
                    .map(ch -> (char) (int) ch)
                    .forEach(result::append);
        }
 
        System.out.println(result);
        return result.toString();
    }