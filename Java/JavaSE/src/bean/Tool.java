package bean;

/**
 * @author yaoyu  2019/3/1 - 15:57
 */


public class Tool<Q> {
    private Q q;

    public Q getQ() {
        return q;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "q=" + q +
                '}';
    }

    public void setQ(Q q) {
        this.q= q;
    }

    public void show(Q q) {              //方法泛型需要与类的泛型一致
        System.out.println(q);
    }

    public<T> void showw(T t) {          //方法泛型最好是与类的泛型一致，如果不一样需要在方法上声明泛型
        System.out.println(t);
    }

    public static<W> void print(W w){       //静态方法必须声明自己的泛型
        System.out.println(w + "静态方法必须声明自己的泛型");
    }
}
