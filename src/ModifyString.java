public class ModifyString {
    public static void main(String[] args){
        String s = "Hello";
        char[] chars = s.toCharArray();
        chars[0] = 'h';
        s = new String(chars);
        System.out.println(s);

    }
}
