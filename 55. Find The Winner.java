    public static String winner(List<Integer> andrea, List<Integer> maria, String s) {
    int mariaScore = 0;
    int andreaScore = 0;
 
    // Determine the first move based on the call
    if ("Even".equalsIgnoreCase(s)) {
        // If "Even" is called, flip only the even-indexed cards
        for (int i = 0; i < andrea.size(); i += 2) {
            int andreaCard = andrea.get(i);
            int mariaCard = maria.get(i);
 
            // Calculate scores
            mariaScore += mariaCard - andreaCard;
            andreaScore += andreaCard - mariaCard;
        }
    } else if ("Odd".equalsIgnoreCase(s)) {
        // If "Odd" is called, flip only the odd-indexed cards
        for (int i = 1; i < andrea.size(); i += 2) {
            int andreaCard = andrea.get(i);
            int mariaCard = maria.get(i);
 
            // Calculate scores
            mariaScore += mariaCard - andreaCard;
            andreaScore += andreaCard - mariaCard;
        }
    }
 
    // Determine the winner or declare a tie
    if (mariaScore > andreaScore) {
        return "Maria";
    } else if (andreaScore > mariaScore) {
        return "Andrea";
    } else {
        return "Tie";
    }

}