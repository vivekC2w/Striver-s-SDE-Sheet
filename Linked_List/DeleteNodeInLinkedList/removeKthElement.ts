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

    //delete the kth element
    deleteKthElement(k: number): void {
        if (this.head === null || k < 1) return;
        if (k === 1) {
            this.head = this.head.next;
            return;
        }
        let temp: ListNode<T> | null = this.head;
        let prev: ListNode<T> | null = null;
        for (let i = 1; temp !== null && i < k; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (prev === null || temp === null) return;
        prev.next = temp.next;
    }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
console.log("Before removal of kth element:", JSON.stringify(linkedList.head, null, 2));
linkedList.deleteKthElement(2);
console.log("After removal of kth element:", JSON.stringify(linkedList.head, null, 2));

// Before removal of kth element: {
//     "value": 1,
//     "next": {
//       "value": 2,
//       "next": {
//         "value": 3,
//         "next": {
//           "value": 4,
//           "next": {
//             "value": 5,
//             "next": null
//           }
//         }
//       }
//     }
//   }
//   After removal of kth element: {
//     "value": 1,
//     "next": {
//       "value": 3,
//       "next": {
//         "value": 4,
//         "next": {
//           "value": 5,
//           "next": null
//         }
//       }
//     }
//   }
