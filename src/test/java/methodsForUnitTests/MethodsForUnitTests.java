package methodsForUnitTests;

public class MethodsForUnitTests {

    public double calcGeneralizedHarmonics(int r, int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += 1/Math.pow(i, r);
        }
        return result;
    }

    public String concatStrings(String first, String second) {
        return first.concat(second);
    }

    public String reverseString(String string) {
        StringBuilder reverse = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        return reverse.toString();
    }
}
