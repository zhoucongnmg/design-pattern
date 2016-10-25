package Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	Map<Variable,Integer> map = new HashMap<Variable,Integer>();
	
	public void addValue(Variable v,Integer i){
		map.put(v,i);
	}
	
	public int getValue(Variable v){
		return map.get(v);
	}
}
