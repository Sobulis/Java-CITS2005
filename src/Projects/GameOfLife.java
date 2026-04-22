package Projects;

public class GameOfLife {
    private boolean[][] grid;

    public GameOfLife(boolean[][] initialGrid) {
        grid = initialGrid;
    }

    public void printGrid() {
        for (int line = 0; line< grid.length; line ++){
            for (int column = 0; column< grid[line].length; column ++){
                System.out.print(grid[line][column]? "O":".");
            }
            System.out.println();
        }
    }

    public void simulateStep() {
        boolean[][] next = new boolean[grid.length][grid[0].length];

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {

                int neighbours = getNeighbours(r, c);

                // Apply Game of Life rules
                if (grid[r][c]) {
                    next[r][c] = (neighbours == 2 || neighbours == 3);
                } else {
                    next[r][c] = (neighbours == 3);
                }
            }
        }

        grid = next;
    }

    private int getNeighbours(int r, int c) {
        int neighbours = 0;

        // Count neighbours directly here
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {

                if (dr == 0 && dc == 0) continue; // skip itself

                int nr = r + dr;
                int nc = c + dc;

                // bounds check
                if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc]) {

                    neighbours++;
                }
            }
        }
        return neighbours;
    }


    public static void main(String[] args) {
        boolean[][] initialGrid = new boolean[10][10];
        initialGrid[4][5] = true;
        initialGrid[4][6] = true;
        initialGrid[5][4] = true;
        initialGrid[5][5] = true;
        initialGrid[6][5] = true;
        GameOfLife game = new GameOfLife(initialGrid);
        for (int i = 0; i < 15; i++) {
            System.out.println("Before Step " + (i+1));
            game.printGrid();
            System.out.println();
            game.simulateStep();
        }
    }
}
