import java.util.Arrays;

public class MyArrayList<T> {

    private int length=0;
    private T[] globalArray;
    private int size=0;

    /*NOTE: Creates the array if type T (hint: the mother of all objects in Java)
      throws IllegalArgumentException and the initialSize that caused it if less than 0*/
    public MyArrayList(int initialSize){
        this.length=initialSize;
        if (initialSize>0){
            globalArray = (T[]) new Object[initialSize];
        }
        else {
            throw new IllegalArgumentException("Array size cannot be zero or less than zero.");
        }
    }

    /*NOTE: Calls MyArrayList(int initialSize) with default size of 10*/
    public MyArrayList(){
        globalArray = (T[]) new Object[10];
    }

    /*NOTE: The current size of the array*/
    public int size(){
        return size;
    }

    /*NOTE: No elements in the array*/
    public boolean isEmpty(){
        boolean isEmpty = false;
        if (globalArray.length == 0){
            isEmpty = true;
        }
        return isEmpty;
    }

    /*NOTE: Add element of type E to position index
    must check for the availability of position index by calling
    private void rangeCheckForAdd(int index)
    should on every attempt to add try to “grow” the array by one
    note that if an element is added to a non-end position, all elements to the right of the new element are shifted right by one*/
    public void add(int index, T element){
        rangeCheckForAdd(index);
        if(index==size){
            grow(size);
            globalArray[index] = element;
        }
        else {
            grow(size);
            for(int i=size;i>index;i--) {
                globalArray[i]=globalArray[i-1];
            }
            globalArray[index]=element;
        }
        size++;
    }

    /*NOTE: The index exceeds the size or is less than 0 throw IndexOutOfBoundsException*/
    private void rangeCheckForAdd(int index) {
        if ((index > size) || (index < 0)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    /*NOTE: Forms and return the error message on out of bounds
    Index: # Size: #*/
    private String outOfBoundsMsg(int index) {
        String outOfBoundsMsg= "INDEX : "+index+" Size : "+size;
        return outOfBoundsMsg;
    }

    /*NOTE: When asked to grow the array, if minCap is larger than the current length, increase the size by 1.5 times
    the current size plus 1,if that size isn’t larger than minCap, increase the size to minC*/
    public void grow(int minCap){
        if (minCap > length-1){
            length = (int) ((length*1.5) + 1);
            globalArray = Arrays.copyOf(globalArray,length);
        }
        else if(size<minCap){
            size = minCap;
        }
    }

    /*NOTE: Should on every attempt to add try to “grow” the array by one return true if successful*/
    public boolean add(T e){
        grow(size);
        globalArray[size] = e;
        size++;
        return true;
    }

    /*NOTE: Ensure the position exists by calling private void rangeCheck(int index)
    return the element at index by calling elementData*/
    public T get(int index){
        rangeCheck(index);
        T element=elementData(index);
        return element;
    }

    /*NOTE: If index exceeds size throw IndexOutOfBoundsException*/
    private void rangeCheck(int index){
        if(index>size-1) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    /*NOTE: Access the element in the array at position index and return it*/
    private T elementData(int index){
        return globalArray[index];
    }

    /*NOTE: Check the index is in range
    set aside the current value at position index
    assign the new element at index
    return the old element*/
    public T set(int index, T element){
        if(index<length-1) {
            T latest=get(index);
            globalArray[index] = element;
            return latest;
        }
        else {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    /*NOTE: Check the index is in range
    set aside the current value at position index
    determine the number of elements to move
    if > 0 then arraycopy the remaining elements to the right of the removed
    set the last element position to null
    decrease size by 1
    return the set aside element*/
    public T remove(int index){
        if(index<size) {
            T latestArray=globalArray[index];
            for(int i=index;i<size-1;i++) {
                globalArray[i] = globalArray[i+1];
            }
            globalArray[size-1]=null;
            size--;
            return latestArray;
        }
        else {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}


