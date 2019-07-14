package regex;

/**
 * @author yaoyu  2019/1/12 - 18:26
 * A:正则表达式
 * 	* 是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串。其实就是一种规则。有自己特殊的应用。
 * 	* 作用:比如注册邮箱,邮箱有用户名和密码,一般会对其限制长度,这个限制长度的事情就是正则表达式做的
 * B:案例演示
 * 	* 需求：校验qq号码.
 * 		* 1:要求必须是5-15位数字
 * 		* 2:0不能开头
 * 		* 3:必须都是数字
 *
 * 	* a:非正则表达式实现
 * 	* b:正则表达式实现
 */


public class Demo1_Regex {
    public static void main(String[] args) {
        System.out.println(checkQQ("02323423"));
        System.out.println(checkQQ("1"));
        System.out.println(checkQQ("12178738239848934"));
        System.out.println(checkQQ("3244325f349"));
        System.out.println(checkQQ("18384493"));

        System.out.println("----------------------------");
        String regex = "[1-9]\\d{4,14}";
        System.out.println("223423423".matches(regex));
        System.out.println("01221233".matches(regex));
        System.out.println("bac".matches(regex));
    }

    /*
     * 需求：校验qq号码.
     * 1:要求必须是5-15位数字
     * 2:0不能开头
     * 3:必须都是数字
     * 校验qq
     * 1：明确返回值类型boolean
     * 2：明确参数列表String qq
     */





    public static boolean checkQQ(String qq) {
        //如果校验qq不符合要求，就把flag置为false，反之直接返回
        boolean flag = true;

        if (qq.length()>=5 && qq.length()<= 15) {
            if (!qq.startsWith("0")) {
                char[] arr = qq.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char ch = arr[i];
                    if (!(ch >= '0' && ch <= '9')) {
                        flag = false;
                        return flag;
                    }
                }
            } else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
}


