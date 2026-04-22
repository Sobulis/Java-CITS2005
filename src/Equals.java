public class Equals {
    public static boolean allEqual(Object[] objects){
        if (objects.length == 0){
            return true;
        }
        Object first = objects[0];
        for (int i = 1; i < objects.length; i++){
            if (!first.equals(objects[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        StringPair[] pairs = new StringPair[3];
        pairs[0] = new StringPair("Hello", "World");
        pairs[1] = new StringPair("Hello", "World");
        pairs[2] = new StringPair("Hello", "World");
        System.out.println(allEqual(pairs));
    }
}

class StringPair {
    String first, second;
    public StringPair(String first, String second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public boolean equals(Object other) {
// Make sure that other is a StringPair
        if (other instanceof StringPair) {
            StringPair otherPair = (StringPair) other; // Cast to StringPair
// Use String .equals() to compare the two Strings
            return first.equals(otherPair.first) && second.equals(otherPair.second);
        }
        return false;
    }
}

