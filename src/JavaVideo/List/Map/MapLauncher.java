package JavaVideo.List.Map;

import java.util.*;

public class MapLauncher {
    public static void main(String[] args) {
       /* JavaVideo.List.Map<String, Integer> numbers = new HashMap<>();
        numbers.put("Toyota",50);
        numbers.put("Audi",51);
        numbers.put("Toyota",52);

        System.out.println(numbers.get("Audi"));*/

        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] tokens = string.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, count + 1);
            }

        }

        Set<WordWrapper> wordWrappers = convertToSet(wordMap);
       // wordWrappers.add(new WordWrapper("asd",245)); // т.к. wordWrappers unmodifiableSet будет бросать ошибку при выполнении
        //printMap(wordMap);
       //printSet(wordWrappers);
    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers) {
        for (WordWrapper wordWrapper:wordWrappers) {
            System.out.println(wordWrapper);
        }

    }

    private static Set<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        wordMap.remove("a"); //удаляет из коллекции все "а"
        wordMap.remove("the", 9); // удаляет из коллекции все "the" с value - 9
        wordMap.replace("the", 0); // заменяет   с value "the" на 0

        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        //   Set<JavaVideo.List.Map.Entry<String, Integer>> entries = wordMap.entrySet();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            wordSet.add(new WordWrapper(e.getKey(), e.getValue()));
        }
       // return new TreeSet<>(wordSet);
        return Collections.unmodifiableSet(wordSet);
    }

   /* private static void printMap(JavaVideo.List.Map<String, Integer> wordMap) {
        JavaVideo.List.Map<String, Integer> wordTreeMap = new TreeMap<>(wordMap);
        Set<String> keys = wordTreeMap.keySet();
        for (String key : keys) {
            System.out.printf("%-10s%-10s \n", key, wordMap.get(key));

        }
    }*/
}
