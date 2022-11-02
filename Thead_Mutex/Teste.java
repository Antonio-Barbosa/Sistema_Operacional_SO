public class Teste {
    public static void main(String[] args) {
        System.out.println("Todos devem usar o banheiro!");
        System.out.println("");

        String lista[] = { "Marcelo", "Joao", "Gabriel", "Emerton", "Dionisio" };
        for (String i : lista) {
            System.out.println(i);
        }
        System.out.println("");

        Banheiro banheiro = new Banheiro();
        UsarBanheiro ocupado = new UsarBanheiro("Ocupado", banheiro, 500, lista);
        UsarBanheiro vazio = new UsarBanheiro("Vazio", banheiro, 1000, lista);

        
        try {
            vazio.join();
            ocupado.join();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
