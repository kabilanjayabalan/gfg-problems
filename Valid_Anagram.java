class Solution {
    public boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        int freq[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i:c1){
            freq[i-'a']++;
        }
        for(int i:c2){
            freq[i-'a']--;
        }
        for(int i:freq){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters. 
*/