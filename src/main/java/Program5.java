//import static MyArrayList.*;
public class Program5 {

    private static <T> void Print(MyArrayList<T> list){
        System.out.println("Size = " + list.size() + " length = " + list.getLength());
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
    public static void main(String[] args) {

        MyArrayList<Integer> ints = new MyArrayList<Integer>(5);

        try {
            Print(ints);
            System.out.println("adding 5 ints");
            for(int i=0;i<ints.getLength();i++)
                ints.add(new Integer(i));
            Print(ints);
            System.out.println("Removing at 3");
            ints.remove(3);
            Print(ints);
            System.out.println("adding two ints");
            ints.add(new Integer(45));
            ints.add(ints.get(1));
            Print(ints);
            System.out.println("add at position 6");
            ints.add(6, new Integer(100));
            Print(ints);
            System.out.println("deliberate error add at position 12");
            ints.add(12, new Integer(99));
        }
        catch (IndexOutOfBoundsException s){
            System.out.println(s);
        }
    }
}
