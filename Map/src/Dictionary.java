import java.util.*;

public class Dictionary {

    private static Map<Character, Map<String, String>> dictionary = new HashMap<Character, Map<String, String>>();

    static {
        // For A
        Map<String, String> aWords = new HashMap<String, String>();
        aWords.put("Apple", "It is a fruit.");
        aWords.put("Animal", "It is a living thing.");
        aWords.put("Ant", "It is a small insect.");
        aWords.put("Arrow", "It is used for pointing or shooting.");
        dictionary.put('A', aWords);

        // For B
        Map<String, String> bWords = new HashMap<String, String>();
        bWords.put("Ball", "It is used in games.");
        bWords.put("Bat", "It is a flying mammal or sports equipment.");
        bWords.put("Book", "It contains written information.");
        bWords.put("Bottle", "It holds liquids.");
        dictionary.put('B', bWords);
    }

    public boolean equals(String word) {
        char firstChar = Character.toUpperCase(word.charAt(0));
        if (dictionary.containsKey(firstChar)) {
            return dictionary.get(firstChar).containsKey(word);
        }
        return false;
    }

    public List<String> startsWith(String prefix) {
        char firstChar = Character.toUpperCase(prefix.charAt(0));
        List<String> results = new ArrayList<>();
        if (dictionary.containsKey(firstChar)) {
            for (String word : dictionary.get(firstChar).keySet()) {
                if (word.startsWith(prefix)) {
                    results.add(word);
                }
            }
        }
        return results;
    }
}
