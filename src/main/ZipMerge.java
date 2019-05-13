package main;

import java.util.Collections;
import java.util.List;

/* ZipMerge class will first sort the list of Zip pairs
  and then loop over to find the overlapping zips to merge the zip pairs
 */

public class ZipMerge {

    Integer numLoop;

    public List<List<Integer>> ZipExtend(List<List<Integer>> listOfZipsIn) {

        //Sorting the zip pairs list
        Collections.sort(listOfZipsIn,((o1, o2) -> (o1.get(0).compareTo(o2.get(0)))));

        //Compare and merge zip list elements
        for(numLoop=0;numLoop<listOfZipsIn.size()-1;) {

            if((listOfZipsIn.get(numLoop).get(1) >= listOfZipsIn.get(numLoop+1).get(0)) &&
                    ((listOfZipsIn.get(numLoop).get(1) >= listOfZipsIn.get(numLoop+1).get(1)))){
                listOfZipsIn.remove(numLoop+1);
            }
            else if ((listOfZipsIn.get(numLoop).get(1) >= listOfZipsIn.get(numLoop+1).get(0)) &&
                    (listOfZipsIn.get(numLoop).get(1) < listOfZipsIn.get(numLoop+1).get(1))){
                listOfZipsIn.get(numLoop).set(1,listOfZipsIn.get(numLoop+1).get(1));
                listOfZipsIn.remove(numLoop+1);
            }
            else if ((listOfZipsIn.get(numLoop).get(1) < listOfZipsIn.get(numLoop+1).get(0)) &&
                    (listOfZipsIn.get(numLoop).get(1) < listOfZipsIn.get(numLoop+1).get(1)) &&
                    ((listOfZipsIn.get(numLoop+1).get(0) - listOfZipsIn.get(numLoop).get(1)) <=1)){
                listOfZipsIn.get(numLoop).set(1,listOfZipsIn.get(numLoop+1).get(1));
                listOfZipsIn.remove(numLoop + 1);
            }
            else {numLoop++;};
        }

        return listOfZipsIn;
    }

}
