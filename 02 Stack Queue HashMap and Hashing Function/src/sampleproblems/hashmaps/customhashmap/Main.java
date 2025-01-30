package sampleproblems.hashmaps.customhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        System.out.println("Value for key 'one': " + map.get("one"));
        map.remove("one");
        System.out.println("Value for key 'one' after removal: " + map.get("one"));
    }
}
