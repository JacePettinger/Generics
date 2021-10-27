public class Main {

    public static void main(String[] args) {


// construct stack from char array
        Character[] letters = {'C', 'A', 'T'};
        Stack<Character> stackChar = new Stack<>(letters);
        stackChar.push('R');
        stackChar.showStack();
        char ch = stackChar.pop();
        System.out.println(ch);
        stackChar.push('R');
        stackChar.swap(1, 2); // Swap values at indexes 1 and 2
        stackChar.swap(-1, 2); // Invalid swap, indexes cannot be negative
        stackChar.showStack();
        stackChar.pop();
        stackChar.pop();
        stackChar.pop();
        stackChar.pop();
        stackChar.showStack();

        // construct stack from String array
        String[] words = {"Cat", "Dog", "Horse"};
        Stack<String> stackString = new Stack<>(words);
        stackString.push("Mouse");
        stackString.showStack();
        String word = stackString.pop();
        System.out.println(word);
        stackString.push("Cat");
        stackString.swap(1, 2); // Swap values at indexes 1 and 2
        stackString.swap(-1, 2); // Invalid swap, indexes cannot be negative
        stackString.showStack();
        stackString.pop();
        stackString.pop();
        stackString.pop();
        stackString.pop();
        stackString.showStack();

        // construct stack from Integer array
        Integer[] numbers = {1, 2, 3};
        Stack<Integer> stackInteger = new Stack<>(numbers);
        stackInteger.push(4);
        stackInteger.showStack();
        Integer num = stackInteger.pop();
        System.out.println(num);
        stackInteger.push(2);
        stackInteger.swap(1, 2); // Swap values at indexes 1 and 2
        stackInteger.swap(-1, 2); // Invalid swap, indexes cannot be negative
        stackInteger.showStack();
        stackInteger.pop();
        stackInteger.pop();
        stackInteger.pop();
        stackInteger.pop();
        stackInteger.showStack();

       /*
        Candy almondJoy = new AlmondJoy();
        Candy skittles = new Skittles();
        Hand<Candy> leftHand = new Hand<>("left");
        Hand<Candy> rightHand = new Hand<>("right");
        debugAdd(almondJoy, leftHand);
        debugAdd(skittles, rightHand);
        Candy candy1 = leftHand.remove();
        Candy candy2 = rightHand.remove();
        candy1.eat();
        candy2.eat();
    }
    public static <T>void debugAdd(T item, Hand<T> hand) {
        System.out.println("Adding " + item.getClass().getSimpleName() + " to the "
                + hand.getName().toLowerCase() + " hand.");
        hand.add(item);
    }
        */
    }
}