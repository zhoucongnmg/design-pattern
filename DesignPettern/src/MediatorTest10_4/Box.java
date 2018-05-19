package MediatorTest10_4;

import java.util.Set;

public class Box {

    private String id;
    private BoxBallMediator mediator = new BoxBallMediator();

    public Box(String id, BoxBallMediator mediator) {
        this.id = id;
        this.mediator = mediator;
    }

    public void addBall(Ball t) {
        mediator.set(t, this);
    }

    public Set<Ball> getBalls() {
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
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Box other = (Box) obj;
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
