package regex;

/**
 * @author yaoyu  2019/1/16 - 10:28
 * Greedy 数量词
 * X? X，一次或一次也没有
 * X* X，零次或多次
 * X+ X，一次或多次
 * X{n} X，恰好 n 次
 * X{n,} X，至少 n 次
 * X{n,m} X，至少 n 次，但是不超过 m 次
 */


public class Demo4_Regex {
    public static void main(String[] args) {
        Demo1();
        System.out.println("-------------");
        Demo2();
        System.out.println("-------------");
        Demo3();
        System.out.println("-------------");
        Demo4();
        System.out.println("-------------");
        Demo5();
        System.out.println("-------------");
        Demo6();
    }

    private static void Demo6() {
        String regex = "[abc]{1,3}";
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
        System.out.println("acc".matches(regex));
        System.out.println("acccccc".matches(regex));
    }

    private static void Demo5() {
        String regex = "[abc]{3,}";
        System.out.println("aaa".matches(regex));
        System.out.println("aa".matches(regex));
    }

    private static void Demo4() {
        String regex = "[abc]{5}";
        System.out.println("baccc".matches(regex));
        System.out.println("bacc".matches(regex));
    }

    private static void Demo3() {
        String regex = "[abc]+";
        System.out.println("".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("acccccccc".matches(regex));
    }

    private static void Demo2() {
        String regex = "[abc]*";
        System.out.println("".matches(regex));
        System.out.println("abc".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("1".matches(regex));
    }

    private static void Demo1() {
        //[xxx]?  xxx 一次或一次也没有
        String regex = "[abc]?";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("c".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("".matches(regex));
    }
}
