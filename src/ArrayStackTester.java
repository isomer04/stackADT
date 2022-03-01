
public class ArrayStackTester {
    public static void main(String[] args) {

        try {
            Stack<Integer> numStack = new ArrayStack<>();

            System.out.println("Initial stack contents: " + numStack);

            for (int i = 1; i < 6; i++) {
                numStack.push(i);
            }

            System.out.println("Contents of stack: " + numStack);

            System.out.println(numStack.peek() + " this is peek");
            System.out.println(numStack.isEmpty() + " this is isEMpty");
            System.out.println(numStack.length() + " this is stack length");

            // this line should be a problem
//            numStack.push(6);

        for (int i = 1; i < 7; i++) {
            //System.out.println("Peeking item at top (that's about to be removed): " + numStack.peek());
            //numStack.pop();

            System.out.println("Removing item: " + numStack.pop());
        }

            System.out.println(numStack.length() + " this is stack length");
            System.out.println(numStack.peek());
            System.out.println(numStack.isEmpty() + " this is isEMpty");




        } catch (UnsupportedOperationException e) {
            System.out.println("Exception");
        }

    }
}

