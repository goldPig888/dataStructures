public class Balanced {
    public static boolean balanced(int[][] arr){
        int right = 0;
        int left = 0;

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                if (j>i){
                    right+=arr[i][j];
                }else if (j<i){
                    left+=arr[i][j];
                }
            }
        }
        if (right == left) return true;
        return false;

    }
}
