public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue1(ListNode head) {
        int result = 0;
        String num = "";
        while (head!=null){
            num = num + head.val;
            head = head.next;
        }
        result = Integer.parseInt(num,2);
        return result;
    }

    public static int getDecimalValue(ListNode head) {
    int result = 0;
        while (head!=null){
        result=result*2+head.val;
        head = head.next;
    }
        return result;
}



    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(0,listNode);
       /* ListNode listNode2 = new ListNode(0,listNode1);
        ListNode listNode3 = new ListNode(1,listNode2);
        ListNode listNode4 = new ListNode(0,listNode3);
        ListNode listNode5 = new ListNode(0,listNode4);
        ListNode listNode6 = new ListNode(1,listNode5);
        ListNode listNode7 = new ListNode(1,listNode6);
        ListNode listNode8 = new ListNode(1,listNode7);
        ListNode listNode9 = new ListNode(0,listNode8);
        ListNode listNode10 = new ListNode(0,listNode9);
        ListNode listNode11 = new ListNode(0,listNode10);
        ListNode listNode12 = new ListNode(0,listNode11);
        ListNode listNode13 = new ListNode(0,listNode12);
        ListNode listNode14 = new ListNode(0,listNode13);*/
        System.out.println(getDecimalValue(listNode1));
    }

}
