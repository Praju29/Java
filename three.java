package Java;

public class three {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String input) {
        
        boolean[] alphabetPresent = new boolean[26];
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alphabetPresent[index] = true;
            }
        }
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }
}
