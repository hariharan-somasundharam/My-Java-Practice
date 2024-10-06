import java.util.*;

class Find_Number_Of_Islands {
    int n, m;
    int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

    public void solve(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        for (int[] d : dir) {
            int newi = i + d[0];
            int newj = j + d[1];
            solve(grid, newi, newj);
        }
    }

    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    solve(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Rows Size : ");
        int n = scanner.nextInt();

        System.out.print("Enter the Columns Size : ");
        int m = scanner.nextInt();

        System.out.println("Enter the Matrix Elements : ");
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        Find_Number_Of_Islands obj = new Find_Number_Of_Islands();
        int ans = obj.numIslands(grid);
        System.out.println(ans);
        scanner.close();
    }
}
