public class SetEverythingTo {
    public static void setTo(BasicSafeArray array, int value){
        for (int i = 0; i< array.size(); i++){
            array.set(i, value);
        }
    }
    public static void printArray(BasicSafeArray array){
        for (int i = 0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args){
        BasicSafeArray array = new BasicSafeArray(5);
        AppendableSafeArray append_array = new AppendableSafeArray(5);
        DeletableSafeArray delete_array = new DeletableSafeArray(5);
        setTo(array, 1);
        setTo(append_array, 2);
        setTo(delete_array, 3);
        append_array.append(11);
        delete_array.delete(3);
        printArray(array);
        printArray(append_array);
        printArray(delete_array);
    }
}
