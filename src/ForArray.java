public class ForArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <nums.length; i++){
            nums[i] *=5;
        }
        for (int i = 0; i< nums.length; i++){
            System.out.println("nums["+i+"]="+nums[i]);
        }
    }
}
