public class StringExample1 {
    public static void main(String[] args){
        stringClass s = new stringClass("Hello".toCharArray());
        s = s.concatenate(new stringClass("World".toCharArray()));
        s = s.substring(3,6);
        if (s.equals(new stringClass("loW".toCharArray()))){
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
