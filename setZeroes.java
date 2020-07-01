class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] seen = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            boolean visited = false;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    seen[j] = true;
                    visited = true;
                }
            }
            if (visited) {
                Arrays.fill(matrix[i], 0);
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (seen[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}