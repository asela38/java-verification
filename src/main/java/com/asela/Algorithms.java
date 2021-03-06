package com.asela;

public class Algorithms {

    public static void main(String[] args) {
        System.out.println(smallFunction3(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println(smallFunction3(new int[] { 1, 2, 5, 6, 2, 7 }));
        System.out.println(smallFunction3(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println(smallFunction3(new int[] { -41, -21, -3, -42, -5, -6 }));
        System.out.println(smallFunction3(new int[] { 71, 2, 3, 64, 5, 66 }));
        System.out.println(smallFunction3(new int[] { 771, 2, 773, 84, 5, 6 }));
        System.out.println("---");
        System.out.println(averageOfLargestAndSecondLargest(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println(averageOfLargestAndSecondLargest(new int[] { 1, 2, 5, 6, 2, 7 }));
        System.out.println(averageOfLargestAndSecondLargest(new int[] { 1, 2, 3, 4, 5, 6 }));
        System.out.println(averageOfLargestAndSecondLargest(new int[] { -41, -21, -3, -42, -5, -6 }));
        System.out.println(averageOfLargestAndSecondLargest(new int[] { 71, 2, 3, 64, 5, 66 }));
        System.out.println(averageOfLargestAndSecondLargest(new int[] { 771, 2, 773, 84, 5, 6 }));

        // System.out.println(getAverageOfTopTwo(new float[] {10,20,30}));
    }

    private static double averageOfLargestAndSecondLargest(int[] list) {

        assert list != null;
        assert list.length > 1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : list) {
            if (i > secondLargest) {
                secondLargest = i;
                if (secondLargest > largest) {
                    int temp = largest;
                    largest = secondLargest;
                    secondLargest = temp;
                }
            }
        }

        // assert largest + secondLargest < Double.MAX_VALUE;
        double average = (0.0D + largest + secondLargest) / 2;

        return average;
    }

    private static double smallFunction3(int[] list) {

        int sum = list[0] + list[1];

        for (int i = 2; i < list.length; i++) {
            System.out.print(sum + " : ");

            System.out.println(sum + " : ");
        }

        double average = (0.0D + sum) / 2;

        return average;
    }

    public static float getAverageOfTopTwo(float[] numbers) {

        float top1 = 0;
        float top2 = 0;

        for (float number : numbers) {
            if (number > top2) {
                if (number > top1) {
                    top1 = number;
                } else {
                    top2 = number;
                }
            }
        }

        return (top1 + top2) / 2;
    }
}
