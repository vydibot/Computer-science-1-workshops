package Listadinamica;
import Creacion.Enlace_nodos;
import javax.swing.JOptionPane;

public class Lista_dinamica {
    public static void main(String[] args) {
        int op1;
        Enlace_nodos obj = new Enlace_nodos();

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("****** DIGITE OPCIÓN ****\n"   
                + "1. Capturar (crear lista aleatoria)\n" 
                + "2. Imprimir lista\n"
                + "3. Retirar nodo\n"
                + "4. Agregar varios nodos al final\n"
                + "5. Salir"));

            switch (op1) {
                case 1:
                    obj.captura();
                    JOptionPane.showMessageDialog(null,"**** LISTA CREADA *****");
                    break;
                case 2:
                    obj.impre();
                    break;
                case 3:
                    obj.retiro();
                    JOptionPane.showMessageDialog(null,"**** NODO RETIRADO *****");
                    obj.impre();
                    break;
                case 4:
                    int agregados = obj.adicionarNodosFinal();
                    JOptionPane.showMessageDialog(null, "**** SE AGREGARON " + agregados + " NODOS AL FINAL *****");
                    obj.impre();
    break;
                case 5:
                    System.exit(0);
            }
        } while (op1 < 6);
    }
}