    public static List<Integer> hasVowels(List<String> strArr, List<String> query) { 
         //this soln worked on my compiler, but not here
  
      List<Integer> result = new ArrayList<>();
    int[] vowelCounts = new int[strArr.size()];
 
    for (int i = 0; i < strArr.size(); i++) {
        String str = strArr.get(i);
        int count = isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1)) ? 1 : 0;
        vowelCounts[i] = count;
    }
 
    for (String q : query) {
        String[] indices = q.split("-");
        int l = Integer.parseInt(indices[0]) - 1;
        int r = Integer.parseInt(indices[1]) - 1;
 
        int count = 0;
        for (int i = l; i <= r; i++) {
            count += vowelCounts[i];
        }
 
        result.add(count);
    }
 
    return result;
 
}
private static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
 
private static boolean isVowel(char ch)
 {
    return vowels.contains(ch);      
 }