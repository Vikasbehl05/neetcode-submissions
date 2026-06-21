class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> smap = new HashMap<>();
        // HashMap<Character, Integer> tmap = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     smap.put(c, smap.getOrDefault(c, 0) + 1);
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     char c = t.charAt(i);
        //     tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        // }

        // boolean isIdentical = smap.equals(tmap);

        // return isIdentical;
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i =0;i < s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c !=  0)
            {
                return false;
            }
        }

        return true;


    }
}
