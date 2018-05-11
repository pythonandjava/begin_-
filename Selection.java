package main;

public class Selection extends Sort {

    public static void sort(Comparable[] a) {
        final int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (less(a[j], a[min]))
                    min = j;
            exchange(a, min, i);
        }
    }

}