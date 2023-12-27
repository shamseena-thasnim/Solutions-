    public static int getMaxDeletions(String s) {
        int len = s.length();
        int x = 0, y = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'U') {
                x++;
            } else if (s.charAt(i) == 'D') {
                x--;
            } else if (s.charAt(i) == 'R') {
                y++;
            } else if (s.charAt(i) == 'L') {
                y--;
            }
        }

        int diff = Math.abs(x) + Math.abs(y);

        return len - diff;
    }