public class UsarBanheiro extends Thread {
    Banheiro banheiro;
    Thread t;
    private int tempo;
    String nomeUsu[];

    public UsarBanheiro(String nome, Banheiro banheiro, int tempo, String nomeUsu[]) {
        this.banheiro = banheiro;
        this.tempo = tempo;
        this.nomeUsu = nomeUsu;
        t = new Thread(this,nome);
        t.start();

    }

    public void run() {
        if (t.getName().equalsIgnoreCase("Ocupado")) {
            for (int i = 0; i < nomeUsu.length; i++) {
                banheiro.vazio(true);
                System.out.println("Banheiro vazio, pode usar!");
                System.out.println(nomeUsu[i] + " está entrando!");
              
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            banheiro.vazio(false);

        } else {
            for (int i = 0; i < nomeUsu.length; i++) {
                banheiro.ocupado(true);
                System.out.println("Banheiro ocupado, " + nomeUsu[i] + " está usando!");
                System.out.println("-------------------");
                try {
                    Thread.sleep(tempo);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            banheiro.ocupado(false);
        }
       
    }
    
    
}
