class Solution {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char chr = t.charAt(i);

            if (map.get(chr) != null) {

                if (map.get(chr) == 1) {
                    map.remove(chr);
                } else {
                    map.put(chr, map.get(chr) - 1);
                }

            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}