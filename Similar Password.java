    public static int countMinimumOperations(String password) {
    // Write your code here
     List<Character> temp = new ArrayList<>();
      long dec;
        int sum = 0;
        List<Integer> seq = new ArrayList<>();
 
        int vCount = vowel(password,temp);
        int cCount = (password.length() - vCount);
 
        if (cCount == vCount) {
            System.out.println(0);
        }
 
        if (vCount > cCount) {
             sum = Math.abs((vCount - cCount) / 2);
            System.out.println(sum);
        } else {
            Map<Character, Integer> m1 = new HashMap<>();
            m1.put('b', 1);
            m1.put('d', 1);
            m1.put('f', 1);
            m1.put('h', 1);
            m1.put('j', 1);
            m1.put('n', 1);
            m1.put('p', 1);
            m1.put('t', 1);
            m1.put('v', 1);
            m1.put('c', 2);
            m1.put('g', 2);
            m1.put('k', 2);
            m1.put('m', 2);
            m1.put('q', 2);
            m1.put('s', 2);
            m1.put('w', 2);
            m1.put('l', 3);
            m1.put('r', 3);
            m1.put('x', 3);
            m1.put('y', 4);
            m1.put('z', 5);
 
            dec = Math.abs((cCount - vCount) / 2);
 
            for (int i = 0; i < temp.size(); i++) {
                seq.add((int) m1.get(temp.get(i)));
            }
 
            seq.sort(null);
 
            for (int i = 0; i < dec; i++) {
                sum += seq.get(i);
            }
 
            System.out.println("summ"+sum);
        }
 
        return sum;
    }
    
    
        static int vowel(String word,List<Character> temp) 
        {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                cnt++;
            } else {
                temp.add(word.charAt(i));
            }
        }
        return cnt;
    }