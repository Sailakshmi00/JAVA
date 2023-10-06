package task;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        input = input.toLowerCase();
        
        
        boolean[] alphabetArray = new boolean[26];
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            
            if ('a' <= ch && ch <= 'z') {
                
                alphabetArray[ch - 'a'] = true;
            }
        }
        
        
        boolean isPangram = true;
        for (boolean letter : alphabetArray) {
            if (!letter) {
                isPangram = false;
                break;
            }
        }
        
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}