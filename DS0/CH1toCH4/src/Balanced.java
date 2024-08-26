public class Balanced {
    public static boolean balanced(int[][] arr){
        int r = 0;
        int l = 0;
        for (int i=0; i< arr.length; i++){
            for (int j=i; j< arr.length; j++) {
                r += arr[i][j];
                System.out.println("The right : " + arr[i][j]);
            }
            for (int j=0; j<i; j++){
                l += arr[i][j];
                System.out.println("The left  :" + arr[i][j]);
            }
        }
        if (r==l){return true;} else{ return false;}
    }

}
