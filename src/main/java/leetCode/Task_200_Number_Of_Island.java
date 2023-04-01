package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Task_200_Number_Of_Island {
    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'1','1','1','1','0'},
                                    {'1','1','0','1','0'},
                                    {'1','1','0','0','0'},
                                    {'0','0','0','0','0'}}));
    }

//    public static int numIslands(char[][] grid) {
//        if (grid.length == 0) {
//            return 0;
//        }
//        List<Integer> q = new ArrayList<>();
//        int qBegin = 0;
//        int answer = 0;
//        for (int c = 0; c < grid.length; c++) {
//            for (int v = 0; v < grid[c].length; v++) {
//                if (grid[v[v] == '1') {
//                    answer++;
//                    q.add(c);
//                    q.add(v);
//                    while (qBegin < q.size()) {
//                        int i = q[qBegin];
//                        qBegin++;
//                        int j = q[qBegin];
//                        qBegin++;
//                        for (int di = -1; di <= 1; di++) {
//                            for (int dj = -1; dj <= 1; dj++) {
//                                if (di * di + dj * dj == 1) {
//                                    int ni = i + di;
//                                    int nj = j + dj;
//                                    if (0 <= ni && ni < grid.length &&
//                                        0 <= nj && nj < grid[ni].length &&
//                                        grid[ni][nj] == '1') {
//                                        grid[ni][nj] = '0';
//                                        q.add(ni);
//                                        q.add(nj);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static int numIslands (char[][] grid) {

        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    fill(grid, i, j);
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void fill(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0';
        fill(grid, i + 1, j);
        fill(grid, i - 1, j);
        fill(grid, i, j + 1);
        fill(grid, i, j - 1);
    }
}
