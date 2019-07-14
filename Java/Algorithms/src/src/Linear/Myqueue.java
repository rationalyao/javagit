package src.Linear;

/**
 * @author yaoyu  2019/1/15 - 10:51
 */


public class Myqueue {
    int[] elements;

    public Myqueue() {
        elements = new int[0];
    }

    //入队
    public void add(int element) {
        int length = elements.length;
        int[] newArr = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[length] = element;
        elements = newArr;
    }

    //出队
    public int poll() {
        int length = elements.length;
        int[] newArr = new int[length-1];
        int element = elements[0];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        elements = newArr;
        return element;
    }

    //判断是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
