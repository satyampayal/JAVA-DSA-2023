package dsaTest;
public class Q2 {
    static boolean checkPrime(int x) {

        int flag = 0;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 7, 91, 11 };

        int size = arr.length;

        int arr2[] = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            int x = arr[i];
            if (checkPrime(x) == true) {
                arr2[j] = x;
                j++;
            }
        }
        while(j<size){
            arr2[j]=-1;
            j++;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
