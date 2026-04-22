class MyClass {
    private int x;
    private int y;
    public MyClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "MyClass("+ x + "," + y + ")";
    }
}
public class toString {
    public static void main(String[] args){
        MyClass mc = new MyClass(5,10);
        System.out.println(mc);
        System.out.println("mc.toString() = "+mc);
    }

}
