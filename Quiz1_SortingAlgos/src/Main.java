class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 4;
        numbers[1] = 89;
        numbers[2] = 32;
        numbers[3] = -8;
        numbers[4] = 1;
        numbers[5] = 90;
        numbers[6] = 230;
        numbers[7] = 12;
        numbers[8] = 56;
        numbers[9] = 34;

        bubbleSort(numbers);
        //selectionSort(numbers);
        printArray(numbers);
    }

    //Modify the BubbleSort and SelectionSort to sort arrays in descending order
    public static void bubbleSort(int[] arr) {
        for (int n = arr.length - 1; n > 0; n--) {
            for (int i = 0; i < n; i++) {
                if (arr[i] < arr[i+1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /*Modify the Selection Sort to look for the smallest value first and put it at
    the end instead of looking for the largest and putting it in the beginning.*/
    public static void selectionSort(int[] arr) {
        for (int n = arr.length - 1; n > 0; n--) {
            int smallest = 0;
            for (int i = 1; i <= n; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }
            if (smallest != n) {
                int temp = arr[smallest];
                arr[smallest] = arr[n];
                arr[n] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} 