    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
      ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(a);
        merge.addAll(b);
        Collections.sort(merge);
        return merge;
    }