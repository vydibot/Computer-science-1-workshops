package Creacion;


import Nodo.Definicion;
import javax.swing.JOptionPane;
public class Enlace_nodos {
 int i,numero,valor;
 String entrada=" ";
 
 Definicion p,q,cab,aux,aux1;
 public String total;
 public String mostrar= "";
 public void captura(){
     cab=null;
     for(i=0;i<=5;i++){
         q=new Definicion();
         if(cab==null){
             q.num=i;
             q.sig=null;
             p=q;
             cab=q;
             total= total + "      " + i;
             
         }
         else{
             q.num=i;
             q.sig=null;
             cab.sig=q;
             cab=q;
             total= total + "       " + i;
             
         }
     }
 }// fin del metodo captura
 
 public void impre(){
     aux=p;
     while(aux.sig!=null){
         mostrar = mostrar + "    "+  aux.num;
         //System.out.println(aux.num);
         aux=aux.sig;
     }
     JOptionPane.showMessageDialog(null,"RESULTADO ENLACES\n" + mostrar ); 
     mostrar="";
 }// fin del metodo impre
 
 public void retiro(){
     
     entrada=JOptionPane.showInputDialog("Digite el numero a retirar");
     valor=Integer.parseInt(entrada);
     aux=p;
     while(aux.sig!=null){
         if(aux.num==valor){
             aux1.sig=aux.sig;
         }
         aux1=aux;
         aux=aux.sig;
     }
     
 }//fin del metodo retiro
 
}// fin de la clase