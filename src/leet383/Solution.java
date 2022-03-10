package leet383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] nums=new int[26];
        for (int i = 0; i <ransomNote.length() ; i++) {
            char c=ransomNote.charAt(i);
            nums[c-'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c=magazine.charAt(i);
            nums[c-'a']--;

        }
        for (int num : nums) {
            if (num > 0) {
                return false;
            }
        }


        return true;
    }
}
