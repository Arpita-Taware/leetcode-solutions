class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int lo=0, hi = (row*col)-1;
        while (lo<=hi){
            int mid=lo+ (hi-lo) /2;
            int midRow= mid/col;
            int midCol= mid%col;

            if(matrix[midRow][midCol]==target){
                return true;
            }
            else if(matrix[midRow][midCol]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
