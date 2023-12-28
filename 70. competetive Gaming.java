    public static int numPlayers(int k, List<Integer> scores) {
    // Write your code here
    Collections.sort(scores, Collections.reverseOrder());
 
        int count = 0;
        int rank = 1;
 
        // Iterate through the sorted scores to assign ranks and count qualified players
        for (int i = 0; i < scores.size(); i++) {
            // Skip players with a score of 0
            if (scores.get(i) == 0) {
                continue;
            }
 
            // Assign rank to the current player
            if (i > 0 && !scores.get(i).equals(scores.get(i - 1))) {
                rank = i + 1;
            }
 
            // Check if the current player qualifies for leveling up
            if (rank <= k) {
                count++;
            }
        }
 
        return count;
    }
