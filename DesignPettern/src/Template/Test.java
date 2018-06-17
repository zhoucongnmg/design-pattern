package Template;

public class Test {
	public static void main(String[] args){
		test(new Tea());
		test(new Coffee());
	}

	public static void test(Template template){
		template.prepareBeverageTemplate();
	}
}
