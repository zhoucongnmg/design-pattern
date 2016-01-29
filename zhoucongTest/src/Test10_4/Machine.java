package Test10_4;

import java.util.Set;

public class Machine {

	private String id;
	private TubMediator mediator = new TubMediator();
	
	public Machine(String id,TubMediator mediator){
		this.id = id;
		this.mediator = mediator;
	}
	
	public void addTub(Tub t){
		mediator.set(t, this);
	}
	
	public Set<Tub> getTubs(){
		return mediator.getTubs(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Machine other = (Machine) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
