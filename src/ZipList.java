import java.util.*;


public class ZipList {

    public static void main(String[] args){

        List<List<Integer>> listOfZipsIn = new ArrayList<>();
        List<List<Integer>> listOfZipsOut = new ArrayList<>();
        Scanner sc;
        Scanner sc1;
        Scanner sc2;
        Integer numZips;
        Integer i;
        Integer j;
        listOfZipsOut.add(new ArrayList<>());

        //Getting size of zip value pairs
        sc = new Scanner(System.in);
        System.out.println("Enter the number of zip pairs to be input: ");
        numZips = sc.nextInt();

        //Getting values
        for(i=0;i<numZips;i++){
            listOfZipsIn.add(new ArrayList<>());

            sc1=new Scanner(System.in);
            System.out.print("Enter "+ (i+1) + " zip code pair's first element :");
            listOfZipsIn.get(i).add(sc1.nextInt());
            sc2=new Scanner(System.in);
            System.out.print("Enter "+ (i+1) + " zip code pair's second element :");
            listOfZipsIn.get(i).add(sc2.nextInt());
        }

        //Sorting the zip pairs list
        Collections.sort(listOfZipsIn,((o1, o2) -> (o1.get(0).compareTo(o2.get(0)))));

        //Compare and merge zip list elements
        for(j=0;j<listOfZipsIn.size()-1;j++){

            if((listOfZipsIn.get(j).get(1) >= listOfZipsIn.get(j+1).get(0)) &&
                    ((listOfZipsIn.get(j).get(1) >= listOfZipsIn.get(j+1).get(1)))){
                listOfZipsIn.remove(j+1);
            }
            else if ((listOfZipsIn.get(j).get(1) >= listOfZipsIn.get(j+1).get(0)) &&
                    (listOfZipsIn.get(j).get(1) < listOfZipsIn.get(j+1).get(1))){
                listOfZipsOut.get(0).add(listOfZipsIn.get(j).get(0));
                listOfZipsOut.get(0).add(listOfZipsIn.get(j+1).get(1));
                listOfZipsIn.set(j,listOfZipsOut.get(0));
                listOfZipsIn.remove(j+1);
            }
            else if ((listOfZipsIn.get(j).get(1) < listOfZipsIn.get(j+1).get(0)) &&
                    (listOfZipsIn.get(j).get(1) < listOfZipsIn.get(j+1).get(1)) &&
                    ((listOfZipsIn.get(j+1).get(0) - listOfZipsIn.get(j).get(1)) <=1)){
                listOfZipsOut.get(0).add(listOfZipsIn.get(j).get(0));
                listOfZipsOut.get(0).add(listOfZipsIn.get(j + 1).get(1));
                listOfZipsIn.set(j, listOfZipsOut.get(0));
                listOfZipsIn.remove(j + 1);
            }
            else continue;
        }

        System.out.println("The zip pairs are :" + listOfZipsIn);
    }
}
