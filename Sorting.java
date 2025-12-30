import java.util.*;
public class Sorting {
    static void bubblesort(int[] a){
       int n=a.length;
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
    }
    static void selectionsort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=0;
            for(int j=1+i;j<n;j++){
                if(a[i]>a[j]){
                    min=j;
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
    }
    static void insertionsort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int k=a[i];
            int j=i-1;
            while(j>=0&&a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(a));
        // bubblesort(a);
        // selectionsort(a);
        // insertionsort(a);

        System.out.println(Arrays.toString(a));

    }
}