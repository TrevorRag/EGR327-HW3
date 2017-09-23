import org.junit.Test;

public class UnimprovedArrayListTest {


    @Test
    public void constructorTest() {
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);
        MyUnimprovedArrayList<Integer> intArray = new MyUnimprovedArrayList<>();

        //Then
        System.out.println(stringArray);
        System.out.println(intArray);
        stringArray.add("Trevor");
    }


    @Test
    public void addTest(){
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);

        //When
        stringArray.add("Trevor");
        stringArray.add("Tyler");
        stringArray.add("Trenton");

        //Then
        System.out.println(stringArray);

        //When
        stringArray.add("Tevin");

        //Then
        System.out.println(stringArray);

    }

    @Test
    public void removeTest()throws MyArrayIndexOutOfBoundsException{
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);
        stringArray.add("Trevor");
        stringArray.add("Tyler");
        stringArray.add("Trenton");

        //When
        stringArray.remove(2);

        //Then
        System.out.println(stringArray);

        //When
        stringArray.remove(0);

        //Then
        System.out.println(stringArray);
    }

    @Test(expected = MyArrayIndexOutOfBoundsException.class)
    public void badRemoveTest()throws MyArrayIndexOutOfBoundsException{
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);
        stringArray.add("Trevor");
        stringArray.add("Tyler");
        stringArray.add("Trenton");

        //When
        stringArray.remove(4);
        stringArray.remove(0);

    }

    @Test
    public void getTest()throws MyArrayIndexOutOfBoundsException{
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);
        stringArray.add("Trevor");
        stringArray.add("Tyler");
        stringArray.add("Trenton");

        //When
        System.out.println(stringArray.get(0));
        System.out.println(stringArray.get(1));
        System.out.println(stringArray.get(2));
    }

    @Test(expected = MyArrayIndexOutOfBoundsException.class)
    public void badGetTest()throws MyArrayIndexOutOfBoundsException{
        //Given
        MyUnimprovedArrayList<String> stringArray = new MyUnimprovedArrayList<>(3);
        stringArray.add("Trevor");
        stringArray.add("Tyler");
        stringArray.add("Trenton");

        //When
        stringArray.get(4);
        stringArray.get(0);

    }
}
