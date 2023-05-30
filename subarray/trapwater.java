public class trapwater {
    public static void main(String[] args) {
        // Your code here
        int arr[] = { 10,8,0,2,9,5,7};
        int n = arr.length;
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            int lb = arr[i];
            // left bound max
            for (int j = 0; j < i; j++) {
                if (arr[j] > lb)
                    lb = arr[j];
            }
            // right bar max
            int rb = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > rb)
                    rb = arr[j];
            }
            int wl;
            if (lb > rb)
                wl = rb;
            else
                wl = lb;
            int tw = wl - arr[i];
            result += tw;
        }
        System.out.println("area of water is stored "+result);

    }
}
