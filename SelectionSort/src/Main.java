// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[]arr = {4,53,3,5,2,7,6,4,6};
        selectionSort(arr);

        for(int x:arr){
            System.out.println(x);
        }

    }
    public static void selectionSort(int[]arr){
        for(int i = 0;i< arr.length -1;i++){
            int min = 0;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            //swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}