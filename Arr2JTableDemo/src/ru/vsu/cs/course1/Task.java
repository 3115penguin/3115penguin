package ru.vsu.cs.course1;


public class Task {

    public static void solution(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                int targetElement = arr2[i][j];
                int count = 0;



                for (int k = 0; k < arr2[i].length; k++) {
                    if (arr2[i][k] == targetElement) {
                        count++;
                    }
                }

                for (int k = 0; k < arr2.length; k++) {
                    if (arr2[k][j] == targetElement) {
                        count++;
                    }
                }

                count -= 1;
                arr2[i][j] = count;
            }
        }
    }

}
