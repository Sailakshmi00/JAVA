package task;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to store Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);

        // Your Roman numeral input
        String romanNumeral = "VL"; // Replace with your input

        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int currentVal = romanValues.get(romanNumeral.charAt(i));
            
            if (i < romanNumeral.length() - 1) {
                int nextVal = romanValues.get(romanNumeral.charAt(i + 1));
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }
}
//it does not guarantee the order of elements based on insertion order. If you need a specific order for your key-value pairs,
//you may want to use a LinkedHashMap or another data structure that preserves order.