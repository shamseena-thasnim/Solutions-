    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
        int ans = 0;
        int n = wallHeights.size();
        int maxbe = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = wallPositions.get(i + 1) - wallPositions.get(i) - 1;
            int b = wallHeights.get(i + 1) + diff;
            int f = wallHeights.get(i) + 1;

            if (diff == 0) {
                continue;
            } else {
                for (int j = 0; j < diff; j++) {
                    maxbe = Math.min(f, b);
                    f++;
                    b--;
                    if (ans < maxbe) {
                        ans = maxbe;
                    }
                }
            }
        }

        return ans;
    }