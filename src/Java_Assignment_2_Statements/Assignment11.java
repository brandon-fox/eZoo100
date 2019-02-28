package Java_Assignment_2_Statements;

public class Assignment11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Populate the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(arr[i] * j);
            }
        }
    }
}
