package org.binary.search;

public class BSearch {
    public int arr[] = {3, 4, 5, 6, 7, 8, 9};
    public int result = 7;

    public void showMessage() {
        int lLimit = 0; // 0
        int hLimit = arr.length; // 6
        binarySearch(arr, lLimit, hLimit, result);
    }

    public void binarySearch(int[] arr, int lLimit, int hLimit, int result) {
        int mid = (lLimit + hLimit) / 2; // 3 // 5
        if (result == arr[mid]) {
            System.out.println(
                    "index is " + mid + " and value is - " + arr[mid]);
        } else {
            if (result > arr[mid]) {
                moveRight(arr, mid + 1, hLimit, result);
            } else if (result < arr[mid]) {
                moveLeft(arr, mid - 1, lLimit, result);
            } else {
                System.out.println("Item Not found");
            }
        }

    }

    private void moveRight(int[] arr, int mid, int hLimit, int result) {
        binarySearch(arr, mid, hLimit, result);
    }

    private void moveLeft(int[] arr, int mid, int lLimit, int result) {
        binarySearch(arr, mid, lLimit, result);
    }
}
