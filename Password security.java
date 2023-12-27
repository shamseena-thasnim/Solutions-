    public static int getMinFlips(String pwd) {
    // Write your code here
    int changesRequired = 0;
 
        for (int i = 0; i < pwd.length(); i+=2) {
            if (i < pwd.length() - 1 && pwd.charAt(i) != pwd.charAt(i + 1)) {
                changesRequired++;
            }
        }
 
        return changesRequired;
    }