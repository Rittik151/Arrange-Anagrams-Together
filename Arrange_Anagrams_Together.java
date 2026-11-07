import java.util.*;

class Arrange_Anagrams_Together {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String word : arr){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}