class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] animals = s.split(" ");
        if (pattern.length() != animals.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String animal = animals[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(animal)) return false;                
            } else {
                if (map.containsValue(animal)) return false;
                map.put(c, animal);
            }
        }
        return true;
    }
}