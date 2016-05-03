package Strategy;

public class Test {
	public static void main(String[] args){
		Strategy strategyA = new StrategyA();
		Context context = new Context(strategyA);
		context.execute();
		
		Strategy strategyB = new StrategyB();
		Context context1 = new Context(strategyB);
		context1.execute();
	}
}
