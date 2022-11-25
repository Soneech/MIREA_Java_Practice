package practice21_22.task1;

public class Complex {
    int real;
    int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public void description() {
        System.out.println("real: " + real + "; " + "image: " + image);
    }
}
