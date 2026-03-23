public class ArrayFor {
    public static void main(String[] args){
        int[][] multiples = new int[5][5];
        for (int i = 0; i< multiples.length; i++){
            for (int j = 0; j < multiples[i].length; j++){
                multiples[i][j] = (i+1)*(j+1);
            }
        }
        for (int[] row: multiples){
            for (int num : row){
                System.out.println(num + "\t");
            }
            System.out.println();
        }
    }
}
