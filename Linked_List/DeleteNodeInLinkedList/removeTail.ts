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

    removeTail(): void {
        if (this.head === null || this.head.next === null) {
            this.head = null;
            return;
        }
        let temp = this.head;
        while(temp.next && temp.next.next !== null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3)));

linkedList.removeTail();
console.log("After removal of tail:", JSON.stringify(linkedList.head, null, 2));

// After removal of tail: {
//     "value": 1,
//     "next": {
//       "value": 2,
//       "next": null
//     }
//   }
