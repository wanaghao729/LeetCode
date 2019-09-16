package src.getoffer;
//: object/Test.java

/**
 * Dispalys a string and today's date
 * @author 王浩
 * @author xuexi
 * @version 1.8
 */
public class Test {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
