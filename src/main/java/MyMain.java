import java.util.Arrays;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int numOdds = 0;
        for (int[] i:mat){
            for (int j = 0; j < i.length; j++){
                if(i[j] % 2 == 1 || i[j] % 2 == -1){
                    numOdds ++;
                }
            }
        }
        return numOdds;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int max = Integer.MIN_VALUE;
        for (int[]i: mat){
            for (int j : i){
                if (j > max){
                    max = j;
                }
            }
        }
        return max;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        // YOUR CODE HERE
        for (int[] i :  mat){
            int firstNum = i[0];
            for (int j = 0; j < i.length; j++){
                if (j != i.length - 1){
                    i[j] = i[j + 1];
                }
                else{
                    i[j] = firstNum;
                }
            }
        }
        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for(int i = 0; i < arraySize; i ++){
            for (int j = 0; j < arraySize; j ++){
                mat[i][j] = i + j;
            }
        }
        // YOUR CODE HERE
        return mat;
    }










    // Methods for the homework:
    private static double calcMean(double[] arr){
        if(arr.length == 0){
            return 0;
        }

        double sum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        return sum/arr.length;
    }
    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        // YOUR CODE HERE
        double[] meanList = new double[mat.length];
        for(int i = 0; i < mat.length; i ++){
            meanList[i] = calcMean(mat[i]);
        }
        return calcMean(meanList);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        // YOUR CODE HERE
        /*if(mat.length % 2 == 1 && mat[0].length %2 == 1){
            int midRow = mat.length/2;
            int midCol = mat[0].length / 2;
            return mat[midRow][midCol];
        }
        else{
            int botRow = mat.length / 2 - 1;
            int topRow = mat.length / 2;
            return ((mat[botRow][mat[botRow].length - 1]) + (mat[topRow][0])) / 2;
        }*/
        int counter = 0;
        double[] matList = new double[mat.length * mat[0].length];
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                matList[counter] = mat[i][j];
                counter ++;


            }
        }
        if(matList.length % 2 == 1){
            return matList[matList.length / 2];
        }
        else{
            return (matList[matList.length/2 - 1] + matList[matList.length/2]) / 2;
        }
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static int countNumInMat(double[] mat, double targ){
        int numTarg = 0;
        for(double j:mat){
                if (j == targ){
                    numTarg ++;
                }
            }
        return numTarg;
    }
    public static double mode(double[][] mat) {
        int bestIndex = 0;
        int maxCount = 0;
        int counter = 0;

        double[] matList = new double[mat.length * mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matList[counter] = mat[i][j];
                counter++;


            }
        }
        for (int i = 0; i < matList.length; i ++){
            int temp = countNumInMat(matList, i);
            if(temp > maxCount){
                bestIndex = i;
                maxCount = temp;
            }
        }
        return bestIndex;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
