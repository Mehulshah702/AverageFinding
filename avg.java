class avg {
  
    static double average(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        return (double)sum / n;
    }

    public static void main (String[] args)
    {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
         
        System.out.println("Average" + " - " + average(arr, n));
        System.out.println("Average" + " - " + average(arr, n));
    }
}
