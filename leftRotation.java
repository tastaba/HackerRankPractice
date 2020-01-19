import java.util.Scanner;

public class leftRotation {  
    public static void main(String[] args) {  
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("Enter the value of d: ");
        int d = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for(int i = 0; i < d; i++){  
            int j, temp;  
            temp = array[0];  
            for(j = 0; j < array.length-1; j++){  
                array[j] = array[j+1];  
            } 
            array[j] = temp;  
        }
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< array.length; i++){  
            System.out.print(array[i] + " ");  
        }  
    }  
}  