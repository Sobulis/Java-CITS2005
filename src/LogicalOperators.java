public class LogicalOperators {
    public static void main(String[] args){
        boolean mystery = (1<3) || (3>2) && !(3<4);
        if (mystery){
            System.out.println("mystery is true");
        } else {
            System.out.println("mystery is false");
        }
    }
}
//Here && has a higher operator precedence than ||, so it executed first
// (3>2) && !(3<4) becomes False: True && False = False
// (1<3) || False, gives True: True or False = True
