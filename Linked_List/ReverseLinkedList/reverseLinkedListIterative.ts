class ListNode<T> {
  value: T;
  next: ListNode<T> | null;

  constructor(value: T, next: ListNode<T> | null = null) {
    this.value = value;
    this.next = next;
  }
}

class LinkedList<T> {
  head: ListNode<T> | null = null;

  reverse(): void {
    let prev: ListNode<T> | null = null;
    let current: ListNode<T> | null = this.head;
    let next: ListNode<T> | null = null;

    while (current !== null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    this.head = prev;
  }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3)));

console.log("Before reversal:", JSON.stringify(linkedList.head, null, 2));
linkedList.reverse();
console.log("After reversal:", JSON.stringify(linkedList.head, null, 2));
