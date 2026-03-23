public class SubString {
    public static void main(String[] args){
        String s = "CITS2005";
        String cits = s.substring(0,4);
        String code = s.substring(4);
        System.out.println(s);
        System.out.println(cits + "---"+ code);
    }
}
