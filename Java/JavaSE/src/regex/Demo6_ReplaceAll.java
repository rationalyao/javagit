package regex;

/**
 * @author yaoyu  2019/1/16 - 18:42
 *  A:正则表达式的替换功能
 * 	* String类的功能：public String replaceAll(String regex,String replacement)
 *  B:案例演示
 * 	* 正则表达式的替换功能
 */


public class Demo6_ReplaceAll {
    public static void main(String[] args) {
        String s = "wo1a3745674i2h265ei3442352ma";
        String regex = "\\d";          //  \\d代表的是任意数字

        String s2 = s.replaceAll(regex,"");
        System.out.println(s2);
    }
}
