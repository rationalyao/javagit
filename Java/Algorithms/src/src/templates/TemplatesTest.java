package src.templates;

/**
 * @author yaoyu  2019/1/9 - 19:02
 */


public class TemplatesTest {

    //模板一：mian——psvm
    public static void main(String[] args) {

        //模板二：输出语句——sout
        System.out.println("My name is Yaoyu");
        //变形：soutp/soutm/soutv/ xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
    }
    
    
}
