import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TripleTest {
    @Test
    public void constructorTest(){
        //Given
        Triple<String, Integer, ArrayList<Integer>> triple = new Triple<>("Goodbye", 13, new ArrayList<>(4));
        LinkedList<String> linkedList = new LinkedList<>();
        Triple<String,List<String>, Triple<String, Integer, ArrayList<Integer>>> tripleTriple = new Triple<>();

        //When
        triple.getRight().add(75);

        //Then
        System.out.println(triple);


        //When
        tripleTriple.setRight(triple);
        tripleTriple.setMiddle(linkedList);
        tripleTriple.setLeft("Hello");

        //Then
        System.out.println(tripleTriple);
    }

}
