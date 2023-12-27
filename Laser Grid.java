    public static int minCost(int rows, int cols, int initR, int initC, int finalR, int finalC, List<Integer> costRows,     List<Integer> costCols) {
        int cost = 0;

        for (int i = Math.min(initR, finalR); i < Math.max(initR, finalR); i++) {
            cost += costRows.get(i);
        }

        for (int i = Math.min(initC, finalC); i < Math.max(initC, finalC); i++) {
            cost += costCols.get(i);
        }

        return cost;
    }