/*
- GenericStackLimitedCapacity를 super class로 하고, extension으로 구현 (반드시)
	용량을 초과하는 경우, array를 2배로 증가시키는 기능만 넣으면 됨.
		(강의 노트에 유사 코드 있음)
	핵심은 어디를 재정의해야 하는가?
- super class의 저장 공간은 visible하게 수정하여야 한다.
*/

public class GenericStack extends GenericStackLimitedCapacity {
	
	private final int INIT_CAPACITY = 2;
	
	
	GenericStack() {
		list = new Object[INIT_CAPACITY];
	}
	
	
	GenericStack(int capacity) {
		list = new Object[capacity];
	}
	
	
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	
	public Object pop() {
		return super.pop();
	}
	
	
	public void push(Object o) {
		int size = list.length;
		
		if ( top < size-1 ) {
			super.push(o);
		} else {
			int arraySize = list.length;
			Object[] copyList = new Object[ arraySize*2 ];
			for (int i = 0; i < arraySize; i = i+1 ) {
				copyList[i] = list[i];
			}
			list = new Object[arraySize*2];
			for (int i = 0; i < arraySize; i = i+1 ) {
				list[i] = copyList[i];
			}
			super.push(o);
		}
	}
	
	
	public String toString() {
		return super.toString();
	}
	
}