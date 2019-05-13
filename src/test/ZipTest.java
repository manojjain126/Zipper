package test;

import main.ZipMerge;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/* ZipTest will pass list of zips to ZipMerge and checks for the
 expected result with actual result
 */

public class ZipTest {

    @Test
    public void shouldMergeZips(){

        ZipMerge zipMerge = new ZipMerge();

        List<List<Integer>> listOfZipsTest = new ArrayList<>();
        List<List<Integer>> listOfZipsTestResult = new ArrayList<>();

        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(0).add(0,49679);
        listOfZipsTest.get(0).add(1,52015);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(1).add(0,49800);
        listOfZipsTest.get(1).add(1,50000);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(2).add(0,51500);
        listOfZipsTest.get(2).add(1,53479);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(3).add(0,45012);
        listOfZipsTest.get(3).add(1,46937);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(4).add(0,54012);
        listOfZipsTest.get(4).add(1,59607);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(5).add(0,45500);
        listOfZipsTest.get(5).add(1,45590);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(6).add(0,45999);
        listOfZipsTest.get(6).add(1,47900);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(7).add(0,44000);
        listOfZipsTest.get(7).add(1,45000);
        listOfZipsTest.add(new ArrayList<>());
        listOfZipsTest.get(8).add(0,43012);
        listOfZipsTest.get(8).add(1,45950);


        listOfZipsTestResult.add(new ArrayList<>());
        listOfZipsTestResult.get(0).add(0,43012);
        listOfZipsTestResult.get(0).add(1,47900);
        listOfZipsTestResult.add(new ArrayList<>());
        listOfZipsTestResult.get(1).add(0,49679);
        listOfZipsTestResult.get(1).add(1,53479);
        listOfZipsTestResult.add(new ArrayList<>());
        listOfZipsTestResult.get(2).add(0,54012);
        listOfZipsTestResult.get(2).add(1,59607);

        assertEquals(zipMerge.ZipExtend(listOfZipsTest),listOfZipsTestResult);

    }

}
