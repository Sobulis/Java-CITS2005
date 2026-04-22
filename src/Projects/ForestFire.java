package Projects;
import java.util.Random;

public class ForestFire {
    private char[][] grid;

    public ForestFire(char[][] initialGrid){
        grid = initialGrid;
    }

    public void createForest(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] +"");
            }
            System.out.println();
        }
    }
    public void simulateStep(){
        char[][] newForest = new char[grid.length][grid[0].length];
        Random rand = new Random();
        for (int row = 0; row < grid.length; row ++){
            for (int col = 0; col < grid[row].length; col++){
                char cell = getCell(row,col);

                if (cell == 'T'){
                    if (hasBurningNeighbour(row, col)){
                        newForest[row][col] = 'F';
                    } else {
                        newForest[row][col] = 'T';
                    }
                }

                else if (cell == 'F'){
                    newForest[row][col] = '.';
                }

                else {
                    if (rand.nextDouble() < 0.04){
                        newForest[row][col] = 'T';
                    } else {
                        newForest[row][col] = '.';
                    }
                }

            }
        }
        grid = newForest;
    }
    private char getCell(int row, int col){
        return grid[row][col];
    }

    private boolean hasBurningNeighbour(int row, int col){
        for (int delta_r = -1; delta_r <= 1; delta_r ++){
            for (int delta_c = -1; delta_c <= 1; delta_c ++){
                if (delta_c == 0 && delta_r == 0) continue;

                int neighbour_r = row + delta_r;
                int neighbour_c = col + delta_c;

                if (neighbour_r >= 0 && neighbour_r < grid.length && neighbour_c >=0 && neighbour_c < grid[0].length){
                    if(grid[neighbour_r][neighbour_c] == 'F'){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[][] initialGrid = {
            {'.', 'T', 'T', '.', '.'},
            {'T', 'T', '.', 'F', 'T'},
            {'.', '.', 'T', '.', '.'},
            {'.', 'F', 'T', 'F', '.'},
            {'.', '.', '.', '.', 'T'}
        };
        ForestFire sim = new ForestFire(initialGrid);
        sim.createForest();
        for (int i = 0; i < 15; i++) {
            System.out.println("Before Step " + (i+1));
            sim.createForest();
            System.out.println();
            sim.simulateStep();
        }

    }


}
