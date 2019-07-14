package leecode;

/**
 * @author yaoyu  2019/3/14 - 17:31
 */


public class TowNumSum_linkedList {
    public static void main(String[] args) {
        listNode ln1 = new listNode(2);
        listNode ln2 = new listNode(4);
        listNode ln3 = new listNode(3);

        listNode ln4 = new listNode(5);
        listNode ln5 = new listNode(6);
        listNode ln6 = new listNode(4);

        ln1.next = ln2;
        ln2.next = ln3;
        ln4.next = ln5;
        ln5.next = ln6;

        listNode last = sum(ln1, ln4);
        System.out.println(last.value + "" + last.next.value + "" +last.next.next.value + " " +last.next.next.next.value);
    }
    public static listNode sum(listNode l1, listNode l2) {

        int one = 0;
        int ont2ten = 0;

        int ten = 0;
        int ten2h = 0;

        int h = 0;
        int h2t = 0;

        int i = l1.value + l2.value;
        int j = l1.next.value + l2.next.value;
        int k = l1.next.next.value + l2.next.next.value;

        if (i > 9) {
            one = i - 10;
            ont2ten = 1;
        }else {
            one = i;
        }

        if (j > 9) {
            ten = j - 10 + ont2ten;
            ten2h = 1;
        }else {
            ten = j;
        }

        if (k > 9) {
            h = k - 10 + ten2h;
            h2t = 1;
        }else {
            h = k;
        }

        listNode ln = new listNode(one);
        listNode lnn = new listNode(ten);
        listNode lnnn = new listNode(h);
        listNode lnnnn = new listNode(h2t);

        ln.next = lnn;
        lnn.next = lnnn;
        lnnn.next = lnnnn;

        return ln;
    }
}

class listNode {
    int value;
    listNode next;
    listNode(int x) {
        value = x;
    }
}
