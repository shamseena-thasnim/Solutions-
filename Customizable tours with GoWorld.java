    public static int findMinimumCost(int treeNodes, List<Integer> treeFrom, List<Integer> treeTo, List<Integer> treeWeight, int start, int end) {

        long sum = 0;
        for (int i = 0; i < treeWeight.size(); i++) {
            sum += treeWeight.get(i);
        }
    System.out.println(sum);
       return (int)sum;
    }