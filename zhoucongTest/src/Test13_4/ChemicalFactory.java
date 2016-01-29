package Test13_4;

import java.util.HashMap;
import java.util.Map;

public class ChemicalFactory {

	private static Map<String,ChemicalImpl> chemicals = new HashMap<String,ChemicalImpl>();
	
	class ChemicalImpl implements Chemical{

		private String name;
		private String symbol;
		private Double atomicWeight;
		
		ChemicalImpl(String name,String symbol,Double atomicWeight){
			this.name = name;
			this.symbol = symbol;
			this.atomicWeight = atomicWeight;
		}
		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getSymbol() {
			return symbol;
		}

		@Override
		public Double getAtomicWeight() {
			return atomicWeight;
		}		
	}
	
	static{
		ChemicalFactory factory = new ChemicalFactory();
		chemicals.put("carbon", factory.new ChemicalImpl("Carbon", "C", (double) 12));
	}
	
	public static Chemical getChemical(String name){
		return chemicals.get(name.toLowerCase());
	}
}
