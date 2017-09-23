import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;

public class MyUnimprovedArrayList<E>{

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ARRAYLIST = {};


    private Object[] arrayList;

    private int size;


    public MyUnimprovedArrayList(){
        this.arrayList = EMPTY_ARRAYLIST;
    }

    public MyUnimprovedArrayList(int initialCapacity){
        if(initialCapacity>0) {
            this.arrayList = new Object[initialCapacity];
        }else if(initialCapacity == 0){
            this.arrayList = EMPTY_ARRAYLIST;
        }else{
            this.arrayList = new Object[DEFAULT_CAPACITY];
        }
    }

    private void grow(){
        arrayList = Arrays.copyOf(arrayList, arrayList.length * 2);
    }

    private void ensureCapacity(int minCapacity){
        if(minCapacity - arrayList.length > 0)
            grow();
    }

    E arrayList(int index){
        return (E) arrayList[index];
    }

    public void add(E obj){
        ensureCapacity(size() + 1);
        arrayList[size++] = obj;
    }

    public E get(int index) throws MyArrayIndexOutOfBoundsException{
        try{
            rangeCheck(index);
            return arrayList(index);
        }catch (IndexOutOfBoundsException e) {
            throw new MyArrayIndexOutOfBoundsException("Invalid Input", e);
        }
    }


    public E remove(int index) throws MyArrayIndexOutOfBoundsException{
        try{
            rangeCheck(index);
            E oldValue = arrayList(index);
            int numMoved = size - index - 1;
            if(numMoved > 0){
                System.arraycopy(arrayList, index+1, arrayList,index, numMoved);
            }
            arrayList[--size] = null;
            return oldValue;
        }catch (IndexOutOfBoundsException e) {
            throw new MyArrayIndexOutOfBoundsException("Invalid Input", e);
        }
    }

    public int size(){
        return this.size;
    }

    private void rangeCheck(int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + size());
        }
    }


    @Override
    public String toString(){
        return Arrays.toString(arrayList);
    }
}
