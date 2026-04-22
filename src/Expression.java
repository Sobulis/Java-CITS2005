public class Expression {
    public void describe(){
        System.out.println("unknown");
    }
    public int evaluate(){
        return 0;
    }
    public static void main(String[] args){
        Expression expr = new Multiply(new Value(2), new Value(3));
        expr.describe();
        System.out.println(" = "+ expr.evaluate());

        expr = new Add(new Value(2), new Value(3));
        expr.describe();
        System.out.println(" = " + expr.evaluate());

        expr = new Add(new Multiply(new Value(2), new Value(3)), new Value(4));
        expr.describe();
        System.out.println(" = " + expr.evaluate());

        expr = new Value(1);
        for (int i = 2; i <= 10; i++)
            expr = new Add(expr, new Value(i));
        expr.describe();
        System.out.println(" = sum of 1 to 10 = " + expr.evaluate());

    }
}
class Value extends Expression{
    private int value;
    public Value(int value) {
        this.value = value;
    }
    public void describe(){
        System.out.print(value);
    }
    public int evaluate(){
        return value;
    }
}

class Add extends Expression {
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public void describe(){
        System.out.print("(");
        left.describe();
        System.out.print(" + ");
        right.describe();
        System.out.print(")");
    }
    public int evaluate(){
        return left.evaluate()+right.evaluate();
    }
}

class Multiply extends Expression{
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public void describe(){
        System.out.print("(");
        left.describe();
        System.out.print(" * ");
        right.describe();
        System.out.print(")");
    }
    public int evaluate(){
        return left.evaluate()+right.evaluate();
    }
}


