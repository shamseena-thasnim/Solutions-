    public static String simpleCipher(String encrypted, int k) {
    // Write your code here  
        StringBuilder builder = new StringBuilder();
        for (char alphabet : encrypted.toCharArray()) {
        if (Character.isLetter(alphabet)) 
            {
            char output = decrypt(alphabet, k);
            builder.append(output);
            } 
        else
            {
            builder.append(encrypted);
            }
        }
        return builder.toString();
        

    }
 
 //method 1   
private static char decrypt(char alphabet, int k) 
{
alphabet = Character.toUpperCase(alphabet);
char decryptedChar = (char) ('A' + ((alphabet - 'A' - k + 26) % 26 + 26) % 26);
return decryptedChar;
}