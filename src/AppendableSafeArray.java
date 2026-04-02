public class AppendableSafeArray  extends BasicSafeArray{
    AppendableSafeArray(int size){
        super(size);
    }
    public void append(int value){
        int newSize = size + 1;
        int[] newArray = new int[newSize];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        newArray[size]= value;
        size = newSize;
        array = newArray;
    }
    public static void main(String[] args){
        //todo
    }
}
