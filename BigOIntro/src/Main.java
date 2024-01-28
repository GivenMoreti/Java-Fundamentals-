// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        long start = System.nanoTime();
        int mySum = addUp(1000);      //first method call
        System.out.println(mySum);
        long end = System.nanoTime();
        long elasped = end - start;
        System.out.println(elasped + " ns");
        //second method

        long startTwo = System.nanoTime();
        int mySumTwo = addTwo(1000);      //first method call
        System.out.println(mySumTwo);
        long endTwo = System.nanoTime();
        long elaspedTwo = endTwo - startTwo;
        System.out.println(elaspedTwo + " ns");

        //linear search
        int[]array = {2,3,54,5,9};
        int index= linearSearch(array,5);

        if(index != -1){
            System.out.println("the element is found at index " + index);
        }else{
            System.out.println("not found");
        }

    }

    private static int linearSearch(int[] array, int element) {

        for(int i = 0; i< array.length;i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int addUp(int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+= i;
        }
        return sum;
    }
    public static int addTwo(int n){

        return n * (n+1)/2;
    }
    //first algo linear search

}