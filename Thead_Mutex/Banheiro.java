
public class Banheiro {

    boolean ocupado;    

    synchronized void ocupado(boolean estaOcupado) {

        if (!estaOcupado) {
            ocupado = true;
            notify();
            return;
        }
        ocupado = true;
        notify();
        try {
            while (ocupado) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void vazio(boolean estaOcupado) {
        
        if (!estaOcupado) {
            ocupado = false;
            notify();
            return;
        }
        ocupado = false;
        notify();

        try {
            while (!ocupado) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
