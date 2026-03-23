public class Sudoku {

    // Size of the Sudoku grid
    static int N = 9;

    // Solves the Sudoku using backtracking
    static boolean solveSudoku(int grid[][], int row, int col) {

        // If we have reached the last cell, return true
        if (row == N - 1 && col == N)
            return true;

        // If the column value becomes 9, move to the next row
        if (col == N) {
            row++;
            col = 0;
        }

        // Skip the filled cells
        if (grid[row][col] != 0)
            return solveSudoku(grid, row, col + 1);

        // Try placing numbers 1-9 in the current cell
        for (int num = 1; num <= 9; num++) {

            // Check if placing this number is safe
            if (isSafe(grid, row, col, num)) {

                // Place the number in the cell
                grid[row][col] = num;

                // Recur to solve the rest of the grid
                if (solveSudoku(grid, row, col + 1))
                    return true;

                // Backtrack if placing the number doesn't lead to a solution
                grid[row][col] = 0;
            }
        }

        // Trigger backtracking
        return false;
    }

    // Print the Sudoku grid
    static void print(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    // Check if it's safe to place a number in the cell
    static boolean isSafe(int[][] grid, int row, int col, int num) {

        // Check the row
        for (int x = 0; x < N; x++)
            if (grid[row][x] == num)
                return false;

        // Check the column
        for (int x = 0; x < N; x++)
            if (grid[x][col] == num)
                return false;

        // Check the 3x3 sub-grid
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;

        // It's safe to place the number
        return true;
    }

    // Main method
    public static void main(String[] args) {
        int[][] grid = {
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solveSudoku(grid, 0, 0))
            print(grid);
        else
            System.out.println("No Solution exists");
    }
}
