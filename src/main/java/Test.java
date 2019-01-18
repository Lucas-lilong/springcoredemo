public class Test {
    public Test() {
        System.out.println("构造方法执行中。。。");
    }
    {
        System.out.println("代码块执行中");
    }
    public static String a = "静态变量。。";
    static {
        System.out.println("static执行中。。。。。");
    }

    public static void staticMethod(){
        System.out.println("静态方法执行中。。。。");
    }
    static class Inner{
        private String name = "小米";
        private int age = 13;
        {
            System.out.println("内部类执行。。。");
        }
        public  static void innerMethod() {
            System.out.println("内部类方法执行中。。。。");
        }
    }

}

class  MainTest{
    public static void main(String[] args) {
      /*  String a = Test.a;
        System.out.println(a);
        Test.staticMethod();*/
        Test test = new Test();
        Test.Inner inner = new Test.Inner();
    }
}
