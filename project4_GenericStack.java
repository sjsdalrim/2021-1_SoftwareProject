/*
- GenericStackLimitedCapacity�� super class�� �ϰ�, extension���� ���� (�ݵ��)
	�뷮�� �ʰ��ϴ� ���, array�� 2��� ������Ű�� ��ɸ� ������ ��.
		(���� ��Ʈ�� ���� �ڵ� ����)
	�ٽ��� ��� �������ؾ� �ϴ°�?
- super class�� ���� ������ visible�ϰ� �����Ͽ��� �Ѵ�.
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