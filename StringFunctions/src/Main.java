public class Main {
	
    public static void main(String[] args) {
    	
    	
        String str = "Hello, World!";
        String str2 = "   Java Programming   ";
        String str3 = "HELLO, WORLD!";
        
        // 1. Length of the string
        
        System.out.println("Length: " + str.length());
        System.out.println();
        
        // 2. Convert to uppercase
        
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println();
        
        // 3. Convert to lowercase
        
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println();
        
        // 4. Trim leading and trailing spaces
        
        System.out.println("Trimmed: '" + str2.trim() + "'");
        System.out.println();
        
        // 5. Substring
        
        System.out.println("Substring (7 to 12): " + str.substring(7, 12));
        System.out.println();
        
        // 6. Character at index
        
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println();
        
        // 7. Replace characters
        
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println();
        
        // 8. Check if string contains another string
        
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println();
        
        // 9. Check if string starts with a specific prefix
        
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println();
        
        // 10. Check if string ends with a specific suffix
        
        System.out.println("Ends with '!': " + str.endsWith("!"));
        System.out.println();
        
        // 11. Check if two strings are equal
        
        System.out.println("Equals 'HELLO, WORLD!': " + str.equals(str3));
        System.out.println();
        
        // 12. Check if two strings are equal (ignore case)
        
        System.out.println("EqualsIgnoreCase 'HELLO, WORLD!': " + str.equalsIgnoreCase(str3));
        System.out.println();
        
        // 13. Split string
        
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': " + String.join(" | ", parts));
        System.out.println();
        
        // 14. Convert string to a character array
        
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // 15. Find index of a character or substring
        
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println();
        
        // 16. Check if string is empty
        
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());
        System.out.println();
        
        // 17. Join strings
        
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined string: " + joined);
        System.out.println();
        
        // 18. Concatenate strings
        
        System.out.println("Concatenate: " + str.concat(" How are you?"));
        System.out.println();
        
        // 19. Check if a string matches a regex
        
        System.out.println("Matches regex '[A-Za-z, ]+': " + str.matches("[A-Za-z, ]+"));
        System.out.println();
        
        // 20. Replace all occurrences using regex
        
        System.out.println("Replace vowels with '*': " + str.replaceAll("[AEIOUaeiou]", "*"));
        System.out.println();
        
        // 21. Compare strings lexicographically
        
        System.out.println("Compare 'Hello' with 'World': " + "Hello".compareTo("World"));
        System.out.println();
        
        // 22. Value of a primitive or object as a string
        
        int number = 42;
        System.out.println("Value of number: " + String.valueOf(number));
    }
}
