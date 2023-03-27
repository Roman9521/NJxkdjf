package leetCode;

public class Task_733_Flood_Fill {
    public static void main(String[] args) {
        System.out.println(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }
    static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    static void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (sc < 0 || sr < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor)
            return;
        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, oldColor, newColor);
        fill(image, sr - 1, sc, oldColor, newColor);
        fill(image, sr, sc + 1, oldColor, newColor);
        fill(image, sr, sc - 1, oldColor, newColor);
    }
}
