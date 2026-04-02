public class BasicSafeArray {
    protected int size;
    protected int[] array;

    public BasicSafeArray(int size){
        this.size = size;
        this.array = new int[size];
    }
    public int size(){
        //todo
        return 0;
    }
    protected boolean isValidIndex(int index){
        //todo
        return true;
    }
    public int get(int index){
        //todo
        return 0;
    }
    public void set(int index, int value){
        //todo
    }
}
