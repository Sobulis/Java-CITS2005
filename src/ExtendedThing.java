public class ExtendedThing extends Thing{
    public void print() {
        System.out.println(x);
        System.out.println(y);
        //System.out.println(z); Cannot do, as z is private
    }
    public static void main(String[] args){
        ExtendedThing t = new ExtendedThing();
        t.print();
    }
}
