public class MultiArrays {
    public static void main(String[] args){
        int[][] table = new int[3][4];
        System.out.println(table.length);
        System.out.println(table[0].length);
        System.out.println(table[1][2]);
        String[] names;
        names = new String[3];
        System.out.println(names[0] == null);
        names[0] = "Alice";
        System.out.println(names[0]);
        char[][][] grid = new char[2][][];
        System.out.println(grid[0] == null);
        grid[0] = new char[4][3];
        grid[1] = new char[2][1];
        System.out.println(grid[0][0][0]);
    }
}
