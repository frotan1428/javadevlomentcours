package JAVA_LESSON_TOTURAIL;

public class day1906 {


    public static void main(String[] args) {
        int x[][] = {{2, 1}, {1, 7, 1}};
        System.out.println(m(x));

    }

    public static int m(int[][] m) {
        int result = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result += m[i][j];
            }

        }
        return result;
    }

}