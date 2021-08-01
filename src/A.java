public class A {

    void FirstMethod(int x) {
        for (int i = 0; i < x; i++) {
            SecondMethod(x, i);
        }
    }

    void SecondMethod(int x, y) {
        System.out.println(x * y - x - y);
    }
}