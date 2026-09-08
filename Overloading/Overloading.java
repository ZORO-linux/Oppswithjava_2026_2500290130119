public class Overloading {

    void sum() {
        System.out.println("Addition");
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        // Creating object for non-static method
        Overloading obj = new Overloading();

        // Calling sum()
        obj.sum();

        // Calling static sum()
        Overloading.sum(10, 20);
    }
}