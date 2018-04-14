package linkedlist;

public class ListNode<E> {

	private E value;
	private ListNode<E> reference;
	
	public ListNode(E value) {
		this.value = value;
		this.reference = null;
	}
	
	public ListNode(E value, ListNode<E> next) {
		this.value = value;
		this.reference = next;
	}
	
	public E getValue() {
		return this.value;
	}
	
	public ListNode<E> getNext() {
		return this.reference;
	}
	
	public void setValue(E value) {
		this.value = value;
	}
	
	public void setReference(ListNode<E> reference) {
		this.reference = reference;
	}
	
	public boolean hasNext() {
		return this.reference != null;
	}
	
	public String toString() {
		return value.toString();
	}
	
}
