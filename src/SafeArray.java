public class SafeArray {
    private int size;
    private int[] array;

    public SafeArray(int size){
        this.size = size;
        this.array = new int[size];
    }
    private boolean isValidIndex(int index){
        return index >= 0 && index < size;
    }
    public int get(int index){
        if (isValidIndex(index)){
            return array[index];
        }
        System.out.println("Invalid Index "+ index);
        return 0;
    }
    public void set(int index, int value){
        if (isValidIndex(index)){
            array[index] = value;
        } else {
            System.out.println("Invalid index "+index);
        }
    }
    public void copyInto(SafeArray other){
        if (other.size != size){
            System.out.println("Arrays are not the same size");
            return;
        }
        for (int i = 0; i < size; i++){
            other.array[i] = array[i];
        }
    }
    public SafeArray append(int value){
        SafeArray newArray = new SafeArray(size + 1);
        for (int i = 0; i< size; i++){
            newArray.array[i] = array[i];
        }
        newArray.array[size] = value;
        return newArray;
    }
    public void append(SafeArray other){
        int newSize = size + other.size;
        int[] newArray = new int[newSize];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        for (int i = 0; i < other.size; i++){
            newArray[size + 1] = other.array[i];
        }
        array = newArray;
        size = newSize;
    }
    public SafeArray(SafeArray other){
        this.size = other.size;
        this.array = new int[size];
        for (int i = 0; i< size; i++){
            array[i] = other.array[i];
        }
    }

    public static void main(String[] args) {
        SafeArray arr1 = new SafeArray(3);
        SafeArray arr2 = new SafeArray(3);
        arr1.set(0,1);
        arr1.set(1,2);
        arr1.set(2,3);
        arr2.set(0,10);
        arr2.set(1,20);
        arr2.set(2,30);
        System.out.println(arr1.get(0)+" "+arr2.get(1)+ " "+arr2.get(2));
        arr1.copyInto(arr2);
        System.out.println(arr2.get(0)+ " "+arr2.get(1)+ " "+arr2.get(2));

    }
}




