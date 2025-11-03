public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        //region numbers
        array[0] = 5;
        array[1] = 78;
        array[2] = 32;
        array[3] = 12;
        array[4] = 7;
        array[5] = 21;
        array[6] = 80;
        array[7] = 94;
        array[8] = 23;
        array[9] = 54;
        //endregion

        int target = 80;
        int result = mirrorSearch(array, target);

        if (result != -1) {
            System.out.println("Target found at Element " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int mirrorSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] == target) {
                return left;
            }
            if (arr[right] == target) {
                return right;
            }

            left++;
            right--;
        }

        return -1;
    }
}
