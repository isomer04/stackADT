public class ArrayStack<T> implements Stack<T> {

    private T[]  stack;
    private int count;

    public ArrayStack() {
        int DEFAULT_SIZE = 5;
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    public ArrayStack(int newSize){
        stack = (T[]) new Object[newSize];
    }




    @Override
    public void push(T item) throws UnsupportedOperationException {
        if(count < stack.length){
            stack[count] = item;
            count++;

        } else {
            // if goes wrong
            // throw an exception
            System.out.println("cannot add " + item);

            throw new UnsupportedOperationException();

        }


    }




    @Override
    public T pop() {

//
        try{
            int topIndex = count -1;
            count--;
            return stack[topIndex];
        } catch ( IndexOutOfBoundsException e) {
            System.out.println("Stack is empty now. It cannot be removed anymore");
            return null;
        }
    }

    @Override
    public int length(){
        return count;
    }

    @Override
    public T peek() {



        try{
            int topIndex = count -1;
            return stack[topIndex];
        } catch ( IndexOutOfBoundsException e) {
            System.out.println("Stack is empty now. So, there is no top item");
            return null;
        }




    }

    @Override
    public boolean isEmpty() {

        return count <= 0;
    }


    @Override
    public String toString() {

        String output ="";

        for(int i=0; i< stack.length; i++){
            output += stack[i] + " ";

        }
        return output;

    }

}
