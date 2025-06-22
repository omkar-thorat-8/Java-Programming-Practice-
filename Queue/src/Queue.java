import java.util.Optional;

public class Queue {
	String[] queue;
	int head = 0;
	int tail = 0;
	
	public static void main(String[] args) {
		Queue app=new Queue();
		app.insert("One");
		app.insert("Two");
		app.insert("Three");
		Optional<String> value=app.consume();
		System.out.println(value.get());
		app.iterate();
	}
	
	public void insert(String next) {
		int current=0;
		if(head==tail) {
			current=0;
			head=0;
			tail=0;
		}
		else {
			current=tail;
		}
		queue[current]=next;
		tail++;
	}
	
	public void iterate() {
		for(int ctr=head;ctr<tail;ctr++) {
			System.out.println(queue[ctr]);
		}
	}
	
	public Optional<String> consume() {
		Optional<String> value=Optional.ofNullable(queue[head++]);
		return value;
	}
}