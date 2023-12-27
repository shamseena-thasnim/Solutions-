    public static int getUniqueCharacter(String s) {
        
        Map<Character, Integer> characterCount = new HashMap<Character, Integer>();

        for (char character : s.toCharArray()) {

        characterCount.put(character, characterCount.getOrDefault(character, 0) + 1);

        }

        for (int i = 0; i < s.length(); i++) {

        if (characterCount.get(s.charAt(i)) == 1) {

        return i + 1;

        }

        }

        return -1;
    }