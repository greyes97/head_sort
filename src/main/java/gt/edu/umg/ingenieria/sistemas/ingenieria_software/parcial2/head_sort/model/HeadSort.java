package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.head_sort.model;

public class HeadSort {
    public void sort(int[] arg){
        int n = arg.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arg, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arg[0];
            arg[0] = arg[i];
            arg[i] = temp;
            heapify(arg, i, 0);
        }
    }
    void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

}
