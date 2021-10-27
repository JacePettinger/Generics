public class Hand<T> {
    private T contents;
    private String name;

    public Hand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(T thing) {
        if (contents == null) {
            contents = thing;
        } else {
            System.out.println("The hand is full.");
        }
    }

    public T remove() {
        if (contents == null) {
            System.out.println("The hand is empty.");
            return null;
        } else {
            T thing = contents;
            contents = null;
            return thing;
        }
    }
}