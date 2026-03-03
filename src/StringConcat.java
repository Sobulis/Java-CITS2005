public class StringConcat {
    public static void main (String[] args){
        int a = 10;
        int b = 20;
        String s1 = a+b+"";
        String s2 = ""+a+b;
        System.out.println(s1); //Prints out 30
        System.out.print(s2); //Prints out 1020
    }
}
