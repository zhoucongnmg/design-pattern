package Template;

public class Tea extends Template{

	@Override
	protected void brew() {
		System.out.println("ещ╡Х");
	}

	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
