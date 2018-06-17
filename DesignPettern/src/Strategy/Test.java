package Strategy;

public class Test {
    public static void main(String[] args) {
        test(new StrategyA());
        test(new StrategyB());
    }

    public static void test(Strategy strategy) {
        Context context = new Context(strategy);
        context.execute();
    }
}
