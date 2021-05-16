/*
- (2)�� �ڵ带 �����Ͽ� type-safe �� ������ �����ϴ� ParaStack ���� �� ����
	��) ParaStack<String> s; // String ���� �����ϴ� Stack
- Object �迭�� ����ϰ�, Casting�� �ؼ� type-safe�� ����.
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
