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

    //delete the element
    removeElement(value: T): void {
        if (this.head === null) return;
        if (this.head.value === value) {
            this.head = this.head.next;
            return;
        }

        let temp = this.head;
        while (temp.next !== null && temp.next.value !== value) {
            temp = temp.next;
        }
        if (temp.next !== null) {
            temp.next = temp.next.next;
        }
    }
}

const linkedList = new LinkedList<number>();
linkedList.head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
console.log("Before removal of element:", JSON.stringify(linkedList.head, null, 2));
linkedList.removeElement(3);
console.log("After removal of element:", JSON.stringify(linkedList.head, null, 2));

// Before removal of element: {
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
//   After removal of element: {
//     "value": 1,
//     "next": {
//       "value": 2,
//       "next": {
//         "value": 4,
//         "next": {
//           "value": 5,
//           "next": null
//         }
//       }
//     }
//   }
