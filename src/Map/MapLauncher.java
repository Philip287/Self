package Map;

import set.Car;

import java.util.*;

public class MapLauncher {
    public static void main(String[] args) {
       /* Map<String, Integer> numbers = new HashMap<>();
        numbers.put("Toyota",50);
        numbers.put("Audi",51);
        numbers.put("Toyota",52);

        System.out.println(numbers.get("Audi"));*/

        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for (String token: tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if(count == null){
                wordMap.put(word,1);
            }else {
                wordMap.put(word, count+1);
            }
            
        }
        
        convertToSet(wordMap);
        printMap(wordMap);
    }

    private static void convertToSet(Map<String, Integer> wordMap) {

    }

    private static void printMap(Map<String, Integer> wordMap) {
       Map<String, Integer> wordTreeMap = new TreeMap<>(wordMap);
        Set<String> keys = wordTreeMap.keySet();
        for (String key: keys) {
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));

        }
    }
}
