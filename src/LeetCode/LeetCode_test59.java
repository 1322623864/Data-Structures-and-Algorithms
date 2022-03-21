package LeetCode;
//顺时针旋转螺旋输出
public class LeetCode_test59 {
    public int[][] generateMatrix(int n) {
        int left = 0,right = n-1,top = 0,bottom = n-1;
        int [][] mat = new int[n][n];
        int tag = n*n, num = 1;
        while (num <= tag){
            for(int i = left; i<=right;i++)mat[top][i] = num++;
            top++;
            for(int i = top; i<=bottom;i++)mat[i][right] = num++;
            right--;
            for(int i = right; i>=left;i--)mat[bottom][i] = num++;
            bottom--;
            for(int i = bottom; i>=top;i--)mat[i][left] = num++;
            left++;
        }
        return mat;
    }
}
