    public static List<String> getRegistrationStatus(List<String> passwords, int k) {
    // Write your code here
    
        List<String> result = new ArrayList<>();
        Map<String, Integer> passwordCount = new HashMap<>();
 
        for (String password : passwords) {
            if (passwordCount.containsKey(password)) {
                passwordCount.put(password, passwordCount.get(password) + 1);
            } else {
                passwordCount.put(password, 1);
            }
 
            if (passwordCount.get(password) <= k) {
                result.add("ACCEPT");
            } else {
                result.add("REJECT");
            }
        }
 
        return result;