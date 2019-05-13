package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* The ZipList class will take input and call
function ZipMerge to publish the concise list of zip pairs
 */
public class ZipList {

    public static void main(String[] args) {

        List<List<Integer>> listOfZipsIn = new ArrayList<>();
        List<List<Integer>> listOfZipsOut;
        Scanner sc;
        Scanner sc1;
        Scanner sc2;
        Integer numZips;
        Integer numInput;

        //Getting size of zip value pairs
        sc = new Scanner(System.in);
        System.out.println("Enter the number of zip pairs to be input: ");
        numZips = sc.nextInt();

        //Getting values from user
        for(numInput=0;numInput<numZips;numInput++) {
            listOfZipsIn.add(new ArrayList<>());

            sc1=new Scanner(System.in);
            System.out.print("Enter "+ (numInput+1) + " zip code pair's first element :");
            listOfZipsIn.get(numInput).add(sc1.nextInt());
            sc2=new Scanner(System.in);
            System.out.print("Enter "+ (numInput+1) + " zip code pair's second element :");
            listOfZipsIn.get(numInput).add(sc2.nextInt());
        }


        /* Calling ZipMerge method with list of Zips as input and get the merge
        list of zips as output
         */

        ZipMerge zipMerge = new ZipMerge();
        listOfZipsOut=  zipMerge.ZipExtend(listOfZipsIn);

        //Printing the final result
        System.out.println("The zip pairs are :" + listOfZipsOut);
    }
}
