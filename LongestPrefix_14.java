import java.util.Arrays;

public class LongestPrefix_14 {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
          String[] strs = {"dog","racecar","car"};
        LongestPrefix_14 l = new LongestPrefix_14();
        String s = l.common(strs);
        System.out.println(s);
    }

    public String common(String[] s){
//        String[] strs = {"dog","racecar","car"};
        String[] strs = {"aaa", "aa", "aaa"};
         Arrays.stream(strs).sorted();
         String s1= strs[0];
         String s2= strs[strs.length-1];
         int count = 0;

         while (count<s1.length() && count<s2.length()){
             if (s1.charAt(count) == s2.charAt(count)){
                 count++;
             }else {
                 break;
             }
         }
         return s1.substring(0,count);
    }

}

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

