package Lab4;

public class Start {
    public static void main(String[] args) {
        MyExicute executorService = new MyExicute(2);
        executorService.submit(() -> {
            try {

                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("We run it");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Start");
            });
        executorService.submit(() -> {
            try {

                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("tri");
        });
        executorService.shutdown();
    }
}
