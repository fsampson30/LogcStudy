import java.io.PrintStream;

public class WhileLoop {

    public void repetition() {
        boolean terminate = false;
        int times = 0;
        while (!terminate) {
            switch (times % 2) {
                case 1: {
                    System.out.println("odd");
                    break;
                }
                case 0: {
                    System.out.println("even");
                    break;
                }
            }
            System.out.println("on the loop: " + times);
            if (times == 10) {
                terminate = true;
            }
            times++;
        }
    }
}
