import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+100;

        }
        return arr;
    }

    public static void task() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
            }
        System.out.println(Arrays.toString(arr));
        for (int i = 2; i < 7; i++) {
            System.out.println(arr[i]);

        }
        }
    }
