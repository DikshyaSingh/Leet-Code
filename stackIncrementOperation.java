public class stackIncrementOperation {

        // Array to store stack elements
        private int[] stackArray;
        // Index of the top element in the stack
        private int topIndex;

        public stackIncrementOperation(int maxSize) {
            stackArray = new int[maxSize];
            topIndex = -1;
        }

        public void push(int x) {
            if (topIndex < stackArray.length - 1) {
                stackArray[++topIndex] = x;
            }
        }

        public int pop() {
            if (topIndex >= 0) {
                return stackArray[topIndex--];
            }
            return -1; // Return -1 if the stack is empty
        }

        public void increment(int k, int val) {
            int limit = Math.min(k, topIndex + 1);
            for (int i = 0; i < limit; i++) {
                stackArray[i] += val;
            }
        }

    public static void main(String[] args) {
        // Create a stack with a maximum size of 5
        stackIncrementOperation stack = new stackIncrementOperation(5);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pop: " + stack.pop());  // Should return 3

        // Push more elements
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // Increment bottom 2 elements by 100
        stack.increment(2, 100);

        // Pop elements and print them
        System.out.println("Pop: " + stack.pop());  // Should return 6
        System.out.println("Pop: " + stack.pop());  // Should return 105 (5 + 100)
        System.out.println("Pop: " + stack.pop());  // Should return 104 (4 + 100)
        System.out.println("Pop: " + stack.pop());  // Should return 1
    }
}
