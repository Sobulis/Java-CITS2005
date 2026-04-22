package Projects;


public class WordTools {
    public static boolean isWord (String string){
        if (string == null || string.isEmpty()) return false;
        for (int i = 0; i < string.length(); i ++){
            if (!Character.isLetter(string.charAt(i))) return false;
        }
        return true;
    }
    public static boolean isLowerCaseWord(String string){
        if (string == null || string.isEmpty()) return false;
        for (int i = 0; i < string.length(); i++){
            if (!Character.isLowerCase(string.charAt(i))) return false;
        }
        return true;
    }
    public static boolean isUpperCaseWord(String string){
        if (string == null || string.isEmpty()) return false;
        for (int i = 0; i < string.length(); i++){
            if (!Character.isUpperCase(string.charAt(i))) return false;
        }
        return true;
    }
    public static boolean isSarcasmCaseWord(String string){
        if (string == null || string.isEmpty()) return false;
        if (isWord(string)){
            for (int i = 0; i < string.length()-1; i ++){
                if (Character.isLowerCase(string.charAt(i)) && Character.isLowerCase(string.charAt(i+1))) return false;
                else if (Character.isUpperCase(string.charAt(i)) && Character.isUpperCase(string.charAt(i+1))) return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(isWord("Hello")); // true
        System.out.println(isWord("Hello!")); // false
        System.out.println(isWord("H ello")); // false
        System.out.println(isLowerCaseWord("hello")); // true
        System.out.println(isLowerCaseWord("hI")); // false
        System.out.println(isUpperCaseWord("TEST")); // true
        System.out.println(isUpperCaseWord("TEST ")); // false
        System.out.println(isUpperCaseWord("tEST")); // false
        System.out.println(isSarcasmCaseWord("tEsT")); // true
        System.out.println(isSarcasmCaseWord("TeSt")); // true
        System.out.println(isSarcasmCaseWord("test")); // false
        System.out.println(isSarcasmCaseWord("TeST")); // false
        System.out.println(isSarcasmCaseWord("HeLlO!")); //false
    }
}
