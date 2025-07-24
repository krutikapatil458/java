interface Stack<T> {
    boolean push(T element);
    T pop();
    T top();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack<Integer> {
    private final int maxSize;
    private int top;
    private Integer[] stack;

    public IntegerStack(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        stack = new Integer[maxSize];
    }

    public boolean push(Integer element) {
        if (!overflow()) {
            stack[++top] = element;
            return true;
        }
        return false;
    }

    public Integer pop() {
        if (!underflow()) {
            return stack[top--];
        }
        return null;
    }

    public Integer top() {
        if (!underflow()) {
            return stack[top];
        }
        return null;
    }

    public boolean overflow() {
        return top == maxSize - 1;
    }

    public boolean underflow() {
        return top == -1;
    }

    public void display() {
        if (!underflow()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class StringStack implements Stack<String> {
    private final int size;
    private int top;
    private String[] stack;

    public StringStack(int size) {
        this.size = size;
        top = -1;
        stack = new String[size];
    }

    public boolean push(String element) {
        if (!overflow()) {
            stack[++top] = element;
            return true;
        }
        return false;
    }

    public String pop() {
        if (!underflow()) {
            return stack[top--];
        }
        return null;
    }

    public String top() {
        if (!underflow()) {
            return stack[top];
        }
        return null;
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }

    public void display() {
        if (!underflow()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        IntegerStack intStack = new IntegerStack(5);
        intStack.push(10);
        intStack.push(120);
        intStack.push(160);
        intStack.push(300);
        intStack.push(20);
        System.out.println("Popped = " + intStack.pop());
        intStack.display();

        StringStack strStack = new StringStack(5);
        strStack.push("Apple");
        strStack.push("Mango");
        strStack.push("Pineapple");
        strStack.push("Strawberry");
        strStack.push("Pear");
        strStack.display();
        System.out.println("Popped = " + strStack.pop());
        strStack.display();
    }
}
