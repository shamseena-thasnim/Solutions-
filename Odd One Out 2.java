    public static String findOdd(List<String> series) {
      final List<List<Integer>> distances = new ArrayList<>();
        String oddOneOut = "";

        for (String s : series) {
            List<Integer> dist = new ArrayList<>();
            for (int i = 0; i < s.length() - 1; i++) {
                dist.add((int) s.charAt(i + 1) - (int) s.charAt(i));

            }

            distances.add(dist);

        }

        for (int i = 0; i < distances.size(); i++) 
        {
          final Integer i2 = new Integer(i);
            if (distances.stream().filter(dist -> dist.equals(distances.get(i2))).count() == 1) {
                oddOneOut = series.get(i);
                break;

            }
        }
        return oddOneOut;
    }