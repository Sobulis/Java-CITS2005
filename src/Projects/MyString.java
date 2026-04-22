package Projects;

import java.util.Arrays;

public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public boolean equals(MyString s) {
        if (length() != s.length())
            return false;
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }

    public MyString substring(int start, int end) {
        char[] newChars = new char[end - start];
        for (int i = start; i < end; i++) {
            newChars[i - start] = chars[i];
        }
        return new MyString(newChars);
    }

    public MyString concatenate(MyString s) {
        char[] newChars = new char[chars.length + s.length()];
        for (int i = 0; i < chars.length; i++)
            newChars[i] = chars[i];
        for (int i = 0; i < s.length(); i++)
            newChars[chars.length + i] = s.charAt(i);
        return new MyString(newChars);
    }
    public boolean startsWith(MyString prefix){
        for (int i = 0; i < prefix.length(); i++){
            if (this.charAt(i) != prefix.charAt(i)){
                return false;
            }
        }
        return true;

    }
    public MyString replace(char oldChar, char newChar){
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            if (this.charAt(i) == oldChar){
                newChars[i] = newChar;
            } else{
                newChars[i] = chars[i];
            }
        }
        return new MyString(newChars);
    }
    public static char[] getChars(String string){
        char[] listChar = new char[string.length()];
        for (int i = 0; i < string.length(); i ++){
            listChar[i] = string.charAt(i);
        }
        return listChar;
    }

    public static boolean TestString(String expected, MyString actual) { // helper method
        return actual.equals(new MyString(expected.toCharArray()));
    }
    // Test
    public static void main(String[] args) {
        char[] arr = getChars("hello");
        System.out.println(Arrays.toString(arr));
        MyString s = new MyString("Hello".toCharArray());
        if (s.startsWith(new MyString("Hel".toCharArray()))) {
            // Hello does start with "Hel"
            System.out.println("S1 success");
        }
        if (!s.startsWith(new MyString(" ".toCharArray()))) {
            // Hello does not start with a space
            System.out.println("S2 success");
        }
        if (!s.startsWith(new MyString("lo".toCharArray()))) {
            // Hello does not start with "lo"
            System.out.println("S3 success");
        }
        MyString r1 = s.replace('e', 'a');
        // basic test
        if (TestString("Hallo", r1)) {
            System.out.println("R1 success");
        }
        MyString r2 = s.replace('l', '!');
        // double occurrence replace
        if (TestString("He!!o", r2)) {
            System.out.println("R2 success");
        }
        MyString r3 = s.replace('a', 'e');
        // 'a' is not in "Hello" so replace shouldn't change anything
        if (r3.equals(s)) {
            System.out.println("R3 success");
        }
    }
}