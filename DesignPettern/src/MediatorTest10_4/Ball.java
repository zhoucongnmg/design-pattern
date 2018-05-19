package MediatorTest10_4;

public class Ball {

	private String id;
	private BoxBallMediator mediator = null;
	
	public Ball(String id, BoxBallMediator mediator){
		this.id = id;
		this.mediator = mediator;
	}
	
	public Box getLocation(){
		return mediator.getMachine(this);
	}
	
	public void setLocation(Box m){
		mediator.set(this, m);
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ball other = (Ball) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
