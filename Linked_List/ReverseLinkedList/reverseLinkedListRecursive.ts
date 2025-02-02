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

    reverseRecursive(node: ListNode<T> | null = this.head): ListNode<T> | null {
        if (node === null || node.next === null) {
            this.head = node;
            return node;
        }

        const reversedHead = this.reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return reversedHead;
    }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3)));

console.log("Before reversal:", JSON.stringify(linkedList.head, null, 2));
linkedList.reverseRecursive();
console.log("After reversal:", JSON.stringify(linkedList.head, null, 2));
