package Interpreter;

public class Test {
	public static void main(String[] args){
		Variable a = new Variable();    
		Variable b = new Variable();    
		Constant c = new Constant(2); 
		
		Context con = new Context();
		con.addValue(a , 5);    
		con.addValue(b , 7); 
		Expression ex = new Add(new Sub(a,c),new Add(a,b));
		System.out.println(ex.interpret(con));
	}
}
