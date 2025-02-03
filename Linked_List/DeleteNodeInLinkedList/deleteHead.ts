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

    removedHead(node: ListNode<T> | null = this.head): ListNode<T> | null {
        if (node === null) {
            return null;
        }

        const removedHead = node;
        this.head = node.next;
        return removedHead;
    }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3)));

linkedList.removedHead();
console.log("After removal:", JSON.stringify(linkedList.head, null, 2));

// After removal: {
//   "value": 2,
//   "next": {
//     "value": 3,
//     "next": null
//   }
// }
