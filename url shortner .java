    public static List<List<String>> getStatForRequests(int m, List<String> database, List<String> requests) {
    // Write your code here
List<List<String>> result = new ArrayList<>();
        Map<String, String> shortURLToUserAndActualURL = new HashMap<>();
        Map<String, Integer> userRequestCount = new HashMap<>();
 
        // Preprocess the database to create a map for quick lookups
        for (String row : database) {
            String[] parts = row.split(" ");
            String userID = parts[0];
            String shortURL = parts[1];
            String actualURL = parts[2];
 
            shortURLToUserAndActualURL.put(shortURL, userID + " " + actualURL);
        }
 
        // Process each query
        for (String query : requests) {
            String userAndActualURL = shortURLToUserAndActualURL.get(query);
 
            if (userAndActualURL != null) {
                String[] parts = userAndActualURL.split(" ");
                String userID = parts[0];
                String actualURL = parts[1];
 
                int count = userRequestCount.getOrDefault(userID, 0) + 1;
                userRequestCount.put(userID, count);
 
             List<String> entry = Arrays.asList(actualURL, String.valueOf(count));
                result.add(entry);
            } else {
                // Handle the case where the short URL is not found
                result.add(Arrays.asList("", "0"));
            }
        }
 
        return result;
    }