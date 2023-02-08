import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        String input = "Hello there this is java";
        input = input.toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        char letter;
        for(int i=0;i<input.length();i++){
            letter = input.charAt(i);

            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+1);
            }
            else{
                charCount.put(letter, 1);
            }
        }

        System.out.println("Total letters including space: "+ charCount.size());

        for(Character c : charCount.keySet()){
            int x = charCount.get(c);
            System.out.println("Letter: "+ c + " Count: "+ x);
        }
    }
}