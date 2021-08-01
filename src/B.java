import A;

public class B {

    void FirstMethod(int x) {
        for (int i = 0; i < x; i++) {
            SecondMethod(x, i);
        }
    }

    int ThirdMethod(int a) {
        A x = new A();
        return x.SecondMethod(a, 2 * a);
    }
}