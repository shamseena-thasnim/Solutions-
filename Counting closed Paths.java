    public static int closedPaths(int number) {
    // Write your code here
    int pathCount = 0;
    int closedPaths[] = new int[] { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };
    String inputAsString = Integer.toString(number);
    for (char digit : inputAsString.toCharArray()) {
    if (Character.isDigit(digit)) {
    int digitValue = Character.getNumericValue(digit);
    pathCount += closedPaths[digitValue];
    }

    }

    return pathCount;
    }