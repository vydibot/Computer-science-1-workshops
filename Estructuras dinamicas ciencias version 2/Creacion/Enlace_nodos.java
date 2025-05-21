package Creacion;

import Nodo.Definicion;
import java.util.Random;
import javax.swing.JOptionPane;

public class Enlace_nodos {
    int i, numero, valor;
    String entrada = " ";
    Definicion p, q, cab, aux, aux1;
    public String total = "";
    public String mostrar = "";
    int ultimoValor = 0;

    Random aleatorio = new Random();

    public void captura() {
        p = null;
        cab = null;
        total = "";

        int cantidad = aleatorio.nextInt(10) + 1; // número aleatorio entre 1 y 10

        for (i = 0; i < cantidad; i++) {
            q = new Definicion();
            q.num = ultimoValor++;
            q.sig = null;

            if (p == null) {
                p = q;
                cab = q;
            } else {
                cab.sig = q;
                cab = q;
            }
            total += " " + q.num;
        }
    }

    public void impre() {
        aux = p;
        mostrar = "";
        while (aux != null) {
            mostrar += " " + aux.num;
            aux = aux.sig;
        }
        JOptionPane.showMessageDialog(null, "RESULTADO ENLACES\n" + mostrar);
    }

    public void retiro() {
        entrada = JOptionPane.showInputDialog("Digite el número a retirar");
        valor = Integer.parseInt(entrada);

        if (p == null) return;

        // Eliminar el primer nodo
        if (p.num == valor) {
            if (p == cab) {
                p = null;
                cab = null;
            } else {
                p = p.sig;
            }
            return;
        }

        aux = p;
        aux1 = null;
        while (aux != null && aux.num != valor) {
            aux1 = aux;
            aux = aux.sig;
        }

        if (aux != null) {
            aux1.sig = aux.sig;
            if (aux == cab) {
                cab = aux1;
            }
        }
    }

    public int adicionarNodosFinal() {
    int cantidad = aleatorio.nextInt(10) + 1; // número aleatorio entre 1 y 10

    for (int j = 0; j < cantidad; j++) {
        q = new Definicion();
        q.num = ultimoValor++;
        q.sig = null;

        if (p == null) {
            p = q;
            cab = q;
        } else {
            cab.sig = q;
            cab = q;
        }
    }

    return cantidad;
        }
}
