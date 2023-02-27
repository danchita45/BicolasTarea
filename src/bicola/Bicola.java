package bicola;

public class Bicola<T> {

    T bc[];
    int atras;
    int atras1 = -1;
    int frente = -1;
    int frente1 = 0;

    public Bicola(T[] arr) {
        bc = arr;
        atras1 = bc.length;
        frente1 = bc.length - 1;
    }

    //factorD =-1
    //factorI=1
    //a2 limite derecho
    //a1 limite izquierdo
    //a1 principio cola, a2 fin cola
    public int inserta(int a, int lim, T dato, int factor) {
        if (a + factor == lim) {
            System.out.println("Bicola llena");
            return a;
        } else {
            a = a + factor;
            bc[a] = dato;
            System.out.println("Dato insertado");
        }
        return a;
    }

    public void insertader(int lim, Auto auto) {
        if (lim == bc.length - 1) {
            System.out.println("La cola esta llena");
        } else {
            lim++;
            bc[lim] = (T) auto;
            if (atras == 0 && frente == -1) {
                frente = 0;
            }
        }
    }

    public void insertaizq(int lim, Libro libro) {
        if (frente == 0) {
            System.out.println("La cola esta llena");
        } else {
            if (frente > 0) {
                frente--;
                bc[frente] = (T) libro;
            } else if (frente == -1) {
                frente++;
                bc[frente] = (T) libro;
            } else if (frente == 0 && lim == -1) {
                lim = 0;
            }
        }
    }

    /**
     * @param a
     * @param lim
     * @param factor
     * @return
     */
    public Object[] Elimina(int a, int lim, int factor) {
        Object r[] = new Object[2];
        if (lim - factor == a) {
            System.out.println("Cola vacia");
            r[1] = null;
        } else {
            r[1] = bc[lim];
            for (int i = lim; i != a; i += factor) {
                bc[i] = bc[i + factor];
            }
            a = a - factor;
        }
        r[0] = (Integer) a;
        return r;
    }

    //getters y setters
    public T[] getBc() {
        return bc;
    }

    public void setBc(T[] bc) {
        this.bc = bc;
    }

    public int getAtras() {
        return atras;
    }

    public void setAtras(int atras) {
        this.atras = atras;
    }

    public int getAtras1() {
        return atras1;
    }

    public void setAtras1(int atras1) {
        this.atras1 = atras1;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFrente1() {
        return frente1;
    }

    public void setFrente1(int frente1) {
        this.frente1 = frente1;
    }
}
