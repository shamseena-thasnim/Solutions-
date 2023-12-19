int count = 0;

int n = input_str.length();

int[] prefixSum = new int[n + 1];

for (int i = 1; i <= n; i++) {

prefixSum[i] = prefixSum[i - 1] + getMappedValue(input_str.charAt(i - 1));

}

for (int i = 0; i < n; i++) {

for (int j = i + 1; j <= n; j++) {

int substringSum = prefixSum[j] - prefixSum[i];

int substringLength = j - i;

if (substringLength > 0 && substringSum % substringLength == 0) {

count++;

}