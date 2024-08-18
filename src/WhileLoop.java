public class WhileLoop {

    public void repetition(){
        boolean terminate = false;
        int times = 0;
        while (!terminate){
            System.out.println("on the loop: " + times);
            if (times == 10){
                terminate = true;
            }
            times ++;
        }
    }
}
