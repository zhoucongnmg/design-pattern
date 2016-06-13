package Builder;

public class Product {
	private String head;
	private String hand;
	private String body;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getHand() {
		return hand;
	}
	public void setHand(String hand) {
		this.hand = hand;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Product [head=" + head + ", hand=" + hand + ", body=" + body + "]";
	}
	
	
}
