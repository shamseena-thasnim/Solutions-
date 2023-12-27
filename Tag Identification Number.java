    public static int numOfIds(String pool) {
        int count = 0;
        int len = pool.length();

        int count8 = 0;
        int countoth = 0;

        for (int i = 0; i < len; i++) {
            if (pool.charAt(i) == '8') {
                count8++;
            } else {
                countoth++;
            }
        }

        while (count8 != 0 && len >= 11) {
            len -= 11;
            count8--;
            count++;
        }

        return count;

    }