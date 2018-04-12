package linkedlist;

import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")

public class SinglyLinkedList<E> {

	private ListNode<E> head;
	private int nodeCount;

	public SinglyLinkedList() {
		head = null;
		nodeCount = 0;
	}

	public int size() {
		return nodeCount;
	}

	public boolean isEmpty() {
		return nodeCount == 0;
	}

	public ListNode<E> getHead() {
		return head;
	}

	public void setHead(ListNode<E> head) {
		this.head = head;
	}

	public void addFirst(E value) {
		this.head = new ListNode<E>(value, this.head);
		nodeCount++;
	}

	public void addLast(E value) {
		if (!this.isEmpty()) {
			ListNode<E> tmp = this.head;
			while (tmp.hasNext()) {
				tmp = tmp.getNext();
			}
			tmp.setReference(new ListNode<E>(value));
		} else {
			this.addFirst(value);
		}
		nodeCount++;
	}

	public void add(int index, E value) {
		if (index < 0 || index > nodeCount) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			addFirst(value);
		} else if (!this.isEmpty()) {
			ListNode<E> tmp = this.head;
			for (int i = 0; i < index - 1; i++) {
				tmp = tmp.getNext();
			}
			tmp.setReference(new ListNode<E>(value, tmp.getNext()));
		}
		nodeCount++;
	}
	
	public E removeFirst() {
		if(head==null) {
			throw new NoSuchElementException();
		}
		E tmp = head.getValue();
		head = head.getNext();
		nodeCount--;
		return tmp;
	}
	
	public E removeLast() {
		if(head == null) {
			throw new NoSuchElementException();
		}
		ListNode<E> tmpNode = head;
		for(int i = 0; i < nodeCount - 1; i++) {
			tmpNode = tmpNode.getNext();
		}
		E tmp = tmpNode.getNext().getValue();
		tmpNode.setReference(null);
		nodeCount--;
		return tmp;
	}

}
