package Java_Assignment_2_Statements;

public class Assignment10 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
