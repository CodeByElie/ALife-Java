public class Main {
    public static void main(String[] args) {
        Lenia c = new Lenia(150,150);
        c.init();
        c.addConvolutionFilter();
        c.draw();
        while(true) {
            c.update();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }   
    }
}