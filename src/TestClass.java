public class TestClass {
    public static void main(String[] args) {
        Context context = new Context();
        Expression test = context.evaluate("5-7+7");
        System.out.println(test.interpret());
    }
}
