class MinHeap {

    public static void heapfy(int[] arr, int n, int i) {
        int largest = i;
        int leftidx = 2*i + 1;
        int rightidx = 2*i + 2;
        if (leftidx < n && arr[leftidx] > arr[largest]) {
            largest = leftidx;
        }
        if (rightidx < n && arr[rightidx] > arr[largest]) {
            largest = rightidx;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapfy(arr, n, largest);
        }

    }

    public static void displayheap(int[] arr, int n){
        System.out.println("Array construction of maxheap : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    

    public static void buildheap(int[] arr, int n) {
        int startindx = (n / 2) - 1;
        for (int i = startindx;  i>= 0; i--) {
            heapfy(arr, n, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;
        buildheap(arr, n);
        displayheap(arr, n);
    }
}