    public static int minMoves(long h, long w, long h1, long w1) {
      int count = 0;

        while (h > h1) {
            h = (long) Math.ceil((double) h / 2);
            count++;
        }

        while (w > w1) {
            w = (long) Math.ceil((double) w / 2);
            count++;
        }

        return count;
    }
    
        static String ltrim(String str) {
        return str.replaceAll("^\\s+", "");
    }

    static String rtrim(String str) {
        return str.replaceAll("\\s+$", "");
    }