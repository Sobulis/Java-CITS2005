public class StringLength {
    public static void main(String[] args){
        for (int i =0; i < args[0].length(); i++){
            System.out.println("The "+i+"th character is "+ args[0].charAt(i));
        }
    }
}
