    public static int degreeOfArray(List<Integer> arr) {
    int ans = 0;
    int degree = 0;
    Map<Integer, Integer> debut = new HashMap<>();
    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < arr.size(); ++i) {
      final int num = arr.get(i);
      debut.putIfAbsent(num, i);
      if (count.merge(num, 1, Integer::sum) > degree) {
        degree = count.get(num);
        ans = i - debut.get(num) + 1;
      } else if (count.get(num) == degree) {
        ans = Math.min(ans, i - debut.get(num) + 1);
      }
    }

    return ans;
    }