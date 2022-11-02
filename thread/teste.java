public class teste {
    
    public static void main(String[] args) {
        System.out.println("A corrida começou!");
        MinhaThread thread = new MinhaThread("Corredor 1", 1000);
        MinhaThread thread2 = new MinhaThread("Corredor 2", 1000);
        MinhaThread thread3 = new MinhaThread("Corredor 3", 1000);

        // thread3.setPriority(Thread.MAX_PRIORITY);
        // thread2.setPriority(Thread.MIN_PRIORITY);
        // thread.setPriority(Thread.MIN_PRIORITY);

        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("A corrida acabou!");
    }
}
