/*
- (2)의 코드를 참조하여 type-safe 한 동작을 지원하는 ParaStack 구현 및 실험
	예) ParaStack<String> s; // String 만을 지원하는 Stack
- Object 배열을 사용하고, Casting을 해서 type-safe를 구현.
*/

public class ParaStack extends GenericStack {
	
	private final int INIT_CAPACITY = 2;
	
	
	ParaStack() {
		list = new Object[INIT_CAPACITY];
	}
	
	
	ParaStack(int capacity) {
		list = new Object[capacity];
	}
	
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	
	public Object pop() {
		return super.pop();
	}
	
	
	public void push(Object o) {
		if ( o instanceof String ) {
			super.push(o);
		} else {
			String token;
			token = "" + o;
			super.push(token);
		}
	}
	
	
	public String toString() {
		return super.toString();
	}
	
}
