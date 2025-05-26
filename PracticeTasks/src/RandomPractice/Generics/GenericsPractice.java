package RandomPractice.Generics;

public class GenericsPractice<T, V> {
    private String string = "";

    public String getString() {
        return string;
    }

    public void addToString(T t, V v) {
        if (this.string.equals("")) {
            this.string = this.string + t.toString() + v.toString();
        } else {
            this.string = this.string + "\n" + t.toString() + v.toString();
        }
    }
}
