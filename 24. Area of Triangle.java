    public static int getTriangleArea(List<Integer> x, List<Integer> y) {
        int area =0;
    int n = x.size();
    int x1[]=new int[x.size()];
    for (int i = 0; i <x.size(); i++) {
        x1[i]=x.get(i);
    }
    int y1[]=new int[y.size()];
    for (int i = 0; i <y.size(); i++) {
        y1[i]=y.get(i);
    }
    for (int i = 0; i < n; i++) {
        int j = (i+1)%n;
        long term = (long) x1[i] * y1[j] - (long) x1[j] * y1[i];
        area +=term;
    }
    return Math.abs(area)/2;
    }