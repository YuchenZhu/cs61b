public class SLList {
	private static class IntNode {
		int item;
		IntNode next;
		IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}
	// The first item (if it exists) ia at sentinel.next 
	private IntNode sentinel;
	private IntNode last;
	private int size;

    
    // The base case
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	/** Adds an item to the end of the list. 
	public void addLast(int x) {
		size += 1;

		IntNode p = sentinel;
		* Advance p to the end of the list 
		while (p.next != null) {
			p = p.next;
		}
		p.next = new IntNode(x, null);
	}
	*/
	public void addLast(int x) {
		last.next = new IntNode(x, null);
		last = last.next;
		size += 1;
	}

	/** This is time consuming
	* recursive implementation of getsize
    private static int size(IntNode p) {
    	if (p.next == null) {
    		return 1;
    	}
    	return 1 + size(p.next);
    }
	*/

    // overloaded example
    public int size() {
    	return size;
    }


    public static void main(String[] args) {
    	SLList L = new SLList();
    	L.addLast(22);
    	L.addLast(424);
    	L.addLast(1024);
    	System.out.println(L.size());
    	System.out.println(L.getFirst());
    }
}