
package control;

import vista.Inout;
import modelo.ProcesoBoda;

public class Boda {

   
    public static void main(String[] args) {
       Inout ob=new Inout();
       ProcesoBoda ob1= new ProcesoBoda();
       int op=0;
       
       do {
        op=ob.pedirentero("Ingrese\n1. Para leer los invitados\n2. Para Mostar todos los invitados\n3. Para mostrar los que invitados que asisten\n4. Para mostrar los invitados que no van a asisitir\n5. Para Mostrar regalor de los invitados que no van a asistir\n6.Salir");
       switch(op){
           case 1:ob1.llenarinvitado();break;
           case 2:ob1.mostrar_todos_los_invitados();break;
           case 3:ob1.mostrar_los_que_van();break;
           case 4:ob1.mostrar_los_que_no_van();break;
           case 5:ob1.mostrar_regalos_de_los_que_no_van();break;
           
       }
       
    }while(op!=6);
    ob.mostrar("Gracias por usar el software para la boda de jose y maria");
}
}