package regex;

/**
 * @author yaoyu  2019/1/16 - 8:43
 * [abc] a、b 或 c（简单类）
 * [^abc] 任何字符，除了 a、b 或 c（否定）
 * [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围）
 * [a-d[m-p]] a 到 d 或 m 到 p：[a-dm-p]（并集）
 * [a-z&&[def]] d、e 或 f（交集）
 * [a-z&&[^bc]] a 到 z，除了 b 和 c：[ad-z]（减去）
 * [a-z&&[^m-p]] a 到 z，而非 m 到 p：[a-lq-z]（减去）
 */


public class Demo2_Regex {
    public static void main(String[] args) {
        Demo1();
        System.out.println("------------------");
        Demo2();
        System.out.println("------------------");
        Demo3();
        System.out.println("------------------");
        Demo4();
        System.out.println("------------------");
        Demo5();
        System.out.println("------------------");
        Demo6();
        System.out.println("------------------");
        Demo7();
    }


    private static void Demo1() {
        //[]代表单个字符
        String regex = "[abc]";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("%".matches(regex));
    }

    private static void Demo2() {
        //任何单个字符，除了"a","b","c"
        String regex = "[^abc]";
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("2".matches(regex));
        System.out.println("%".matches(regex));
        System.out.println("10".matches(regex));      //"10"为两个字符
    }

    private static void Demo3() {
        //单个字符，a-z A-Z包含头尾
        String regex = "[a-zA-Z]";
        System.out.println("a".matches(regex));
        System.out.println("A".matches(regex));
        System.out.println("h".matches(regex));
        System.out.println("H".matches(regex));
        System.out.println("z".matches(regex));
        System.out.println("Z".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("%".matches(regex));
    }

    private static void Demo4() {
        String regex = "[a-z[m-p]]";
        System.out.println("a".matches(regex));
        System.out.println("m".matches(regex));
        System.out.println("n".matches(regex));
    }

    private static void Demo5() {
        String regex = "[a-z&&[def]]";
        System.out.println("a".matches(regex));
        System.out.println("d".matches(regex));
        System.out.println("f".matches(regex));
    }

    private static void Demo6() {
        String regex = "[a-z&&[^b-c]]";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("1".matches(regex));
    }

    private static void Demo7() {
        String regex = "[a-z&&[^m-p]]";
        System.out.println("a".matches(regex));
        System.out.println("m".matches(regex));
        System.out.println("p".matches(regex));
        System.out.println("z".matches(regex));
    }
}