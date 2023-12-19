public static int minimizeBias(List<Integer> ratings) {

// Sort the ratings in ascending order

Collections.sort(ratings);

int totalBiasAmount = 0;

int n = ratings.size();

// Pair adjacent programmers and calculate bias amounts

for (int i = 0; i < n - 1; i += 2) {

int biasAmount = ratings.get(i + 1) - ratings.get(i);

totalBiasAmount += biasAmount;

}

// Handle the case where the number of programmers is odd

if (n % 2 == 1) {

totalBiasAmount += ratings.get(n - 1);

}

return totalBiasAmount;

}