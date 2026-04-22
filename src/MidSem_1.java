import java.lang.reflect.Array;
import java.util.ArrayList;

class BoolExpr{
    public void describe() {System.out.println("unknown");}
    public boolean evaluate() {return false;}
}

class BoolVal extends BoolExpr{
    boolean val;
    public BoolVal(boolean val) {
        this.val = val;
    }

    @Override
    public void describe() {
        System.out.println(val);
    }
    @Override
    public boolean evaluate(){
        return val;
    }
}
class BoolNot extends BoolExpr{
    public BoolExpr expr;
    public BoolNot(BoolExpr expr){
        this.expr = expr;
    }
    @Override
    public void describe(){
        System.out.print("!(");
        expr.describe();
        System.out.print(")");
    }
    @Override
    public boolean evaluate(){
        return !expr.evaluate();
    }
}
class BoolAnd extends BoolExpr{
    public BoolExpr expr1;
    public BoolExpr expr2;

    public BoolAnd(BoolExpr expr1, BoolExpr expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    @Override
    public void describe(){
        System.out.print("(");
        expr1.describe();
        System.out.print(" && ");
        expr2.describe();
        System.out.print(")");
    }
    @Override
    public boolean evaluate(){
        return expr1.evaluate() && expr2.evaluate();
    }
}
public class MidSem_1 {
    public static boolean isValid(int x, int y){
        if (x < 3) return false;
        if (y > 12) return true;
        if (x < y) {
            return 2 * x < y;
        }
        return 2 * y < x;
    }
    public static int smallCalc(){
        int x = 8;
        int i = 1;
        int result = 0;
        while (i < x) {
            result += i;
            i *= 2;
        }
        return result;
    }
    public static void rotate(int[] arr){
        int first = arr[0];
        for (int i = 0; i < arr.length -1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
    public static int[] rotated(int[] arr){
        int[] y_arr = new int[arr.length];
        int first = y_arr[0];
        for (int i = 0; i < y_arr.length - 1; i ++){
            y_arr[i] = y_arr[i+1];
        }
        y_arr[y_arr.length-1] = first;
        return y_arr;
    }

    public static void main(String[] args){
        System.out.println(isValid(2,12)); //False
        System.out.println(isValid(5,15)); //True
        System.out.println(isValid(6,10)); //False
        System.out.println(isValid(6,13)); //True
        System.out.println(isValid(10,5)); //False
        System.out.println(smallCalc());
        BoolExpr expr = new BoolAnd(new BoolVal(true), new BoolVal(false));
        expr = new BoolNot(expr);
        expr = new BoolAnd(new BoolVal(true), expr);
        expr.describe();
        System.out.println();
        System.out.println("= " + expr.evaluate());


    }
}
