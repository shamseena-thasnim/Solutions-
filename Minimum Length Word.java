    public static int getMinimumMoves(String word) {
    // Write your code here
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        System.out.println("Set = " + set);
        int count = 0;
        for (char i : set) {
            count += (word.chars().filter(ch -> ch == i).count()) / 2;
        }
        return count;
    }