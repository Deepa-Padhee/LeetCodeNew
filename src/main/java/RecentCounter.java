import java.util.LinkedList;

public class RecentCounter {
    LinkedList<Integer> list;
    public RecentCounter() {
        this.list = new LinkedList<Integer>();
    }

    public int ping(int t) {
        this.list.add(t);
        while (this.list.getFirst()<t-3000){
            this.list.removeFirst();
        }
        return this.list.size();
    }

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        obj.ping(1);
        obj.ping(100);
        obj.ping(3001);
        obj.ping(3002);
    }

}
