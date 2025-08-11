//Write a Java Program that to Create a Single-Dimensional String array and try to sort that array in Descending Order alphabetically ?
import java.util.Arrays;
class SD{
    public static void main(String[] args) {
        String arr[]={"Geetu","Ramya","Renu","Manisha"};
        Arrays.sort(arr);
        String temp=arr[0];
        for (int i = arr.length-1; i >0; i--) {
            System.out.print(arr[i]+" ");
            arr[arr.length-1]=temp;
        }
        System.out.print(arr[arr.length-1]);
    }
}