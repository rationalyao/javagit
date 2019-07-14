package regex;

/**
 * @author yaoyu  2019/1/16 - 10:01
 * . 任何字符（与行结束符可能匹配也可能不匹配）
 * \d 数字：[0-9]
 * \D 非数字： [^0-9]
 * \s 空白字符：[ \t\n\x0B\f\r]
 * \S 非空白字符：[^\s]
 * \w 单词字符：[a-zA-Z_0-9]
 * \W 非单词字符：[^\w]
 */


public class Demo3_Regex {
    public static void main(String[] args) {
        Demo1();
        System.out.println("----------");
        Demo2();
        System.out.println("----------");
        String regex = "\\D";
        System.out.println("0".matches(regex));
        System.out.println("9".matches(regex));
        System.out.println("a".matches(regex));

    }

    private static void Demo2() {
        //反斜线\代表转义字符，需要表示\d，则需要\\d
        String regex = "\\d";
        System.out.println("9".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("10".matches(regex));
    }

    private static void Demo1() {
        //. 代表任意单个字符
        String regex = ".";
        System.out.println("a".matches(regex));
        System.out.println("ab".matches(regex));
        String regex2 = "..";
        System.out.println("ab".matches(regex2));
    }
}
