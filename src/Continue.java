public class Continue {
    public static void main(String[] args){
        for (int i =1; i<=20; i++){
            if (i%2==0){
                continue; //Checks if the number is even and then skips
            }
            System.out.println(i);
        }
    }
}
