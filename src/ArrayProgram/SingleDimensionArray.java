package com.data_structure;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }

    }

    // insertion
    public void insert(int location, int valueToBeInserted) {
        if (location < 0 || location >= arr.length) {
            System.out.println("invalid index");
            return;
        }

        if (arr[location] == Integer.MAX_VALUE) {
            arr[location] = valueToBeInserted;
            System.out.println("successfully inserted : " + valueToBeInserted);
        } else {
            System.out.println("this cell is already occupied");
        }
    }

    // traversing the array
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists...");
        }
    }

    // Search in Array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("successfully found value at index : " + i);

            }
        }
    }

    // Delete element from the array
    public void deletedValue(int valueToBeDeleted) {
        try {
            arr[valueToBeDeleted] = Integer.MIN_VALUE;
            System.out.println("The value has deleted successfully...");
        } catch (Exception e) {
            System.out.println("Provided value is not in the given array range");
        }
    }
}
