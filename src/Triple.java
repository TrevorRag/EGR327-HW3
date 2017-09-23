
public class Triple<E, F, G> {
    private E left;
    private F middle;
    private G right;

    public Triple(){

    }

    public Triple(E left, F middle, G right){
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public F getMiddle() {
        return middle;
    }

    public void setMiddle(F middle) {
        this.middle = middle;
    }

    public G getRight() {
        return right;
    }

    public void setRight(G right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + middle + ", " + right + ')';
    }
}
