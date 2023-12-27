    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
   List<Integer> result = new ArrayList<>();
 
        for (String q : query) {
            int count = 0;
 
            for (String name : names) {
                if (isCompletePrefix(name, q)) {
                    count++;
                }
            }
 
            result.add(count);
        }
 
        return result;
    }
 
    public static boolean isCompletePrefix(String name, String query) {
        // Check if the length of the query is less than the length of the name
        // and if the name starts with the query
        return query.length() < name.length() && name.startsWith(query);
    
    }