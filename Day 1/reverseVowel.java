// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

public class reverseVowel {

    public static String reveString(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        char chars[] = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }

        }
        return new String(chars);
    }

    public static Boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        // String str = "hello";
        String str = "RUSHi";

        System.out.println(reveString(str));

    }
}