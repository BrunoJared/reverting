package Application;

import java.util.Arrays;

public class AlphabeticalOrder {
	 public static void main(String[] args)
     {
         String[] arrToSort = {"Volvo", "BMW", "Ford", "Mazda", "Chery", "Hyundai", "Volkswagen", "Chevrolet"};
         Arrays.sort(arrToSort);
         for(int i = 0; i < arrToSort.length; i++)
         {
             System.out.println(arrToSort[i] + " ");
         }
     }
}
