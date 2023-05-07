
package modelo;

import java.util.ArrayList;
import modelo.invitado;
import vista.Inout;

public class ProcesoBoda {
    
    Inout ob = new Inout();
    ArrayList<invitado> lista_Total = new ArrayList<invitado>();
    ArrayList<invitado> lista1 = new ArrayList<invitado>();
    ArrayList<invitado> lista2 = new ArrayList<invitado>();
    public void llenarinvitado() {
        int con = 0;
        String nombre = "";
        String dir = "";
        String fam = "";
        String reg = "";
        String Paren = "";
        double tel = 0, recor = 0, comi = 0;
        int r = 0;
    

        do {
            invitado persona=new invitado();
            nombre = ob.PedirInvitado("ingrese el nombre del invitado:");
            while(compnombre(nombre)){
                ob.mostrar(""+compnombre(nombre));
                nombre=ob.PedirInvitado("//ERROR//\nDigite un nombre diferente");
            }
            persona.setNombreinvi(nombre);
            Paren = ob.PedirInvitado("ingrese el parentesco del invitado");
            persona.setParentesco(Paren);
            fam = ob.PedirInvitado("ingrese el apellido de la familia");
            persona.setFamilia(fam);
            dir = ob.PedirInvitado("ingrese la direccion del invitado");
            persona.setDireccion(dir);
            reg = ob.PedirInvitado("ingrese el regalo que va a llevar");
            while(comp(reg)){
                ob.mostrar(""+comp(reg));
                reg=ob.PedirInvitado("//ERROR//\nDigite un regalo diferente");
            }
            persona.setRegalo(reg);
            comi=ob.pedirdouble("ingrese el dinero para comida");
            while(validardatos(0,comi)==false){
             ob.mostrar("error, digite un numero positivo");
            comi=ob.pedirdouble("ingrese el dinero para comida");}
            persona.setComida(comi);
            recor=ob.pedirdouble("ingrese el dinero para recordatorios");
            while(validardatos(0,recor)==false){
            ob.mostrar("error, digite un numero positivo");
             recor=ob.pedirdouble("ingrese el dinero para recordatorios");}
            persona.setRecordatorio(recor);
            tel=ob.pedirdouble("ingrese su numero de telefono");
            while(validardatos(0,tel)==false){
            ob.mostrar("error, digite un telefono positivo");
             tel=ob.pedirdouble("ingrese su numero de telefono");
             
            }
            persona.setTelefono(tel);
            lista_Total.add(persona);
            con = ob.pedirentero("digite\n1.Para ir\n2.Para no ir");
            if(con==1)
            lista1.add(persona);
            else
                lista2.add(persona);
           
            r = ob.pedirentero("digite 1 para agregar a un invitado, otro para finalizar");

        } while (r == 1);

    }
    
     public void mostrar_todos_los_invitados() {
         ob.mostrar("Datos de todos los invitados");
       
        for (int i = 0; i < lista_Total.size(); i++) {
            ob.mostrar("Invitado "+(i+1));
            ob.mostrar("los datos son:\n" + lista_Total.get(i).getNombreinvi() +"\n"+ lista_Total.get(i).getParentesco() +"\n"+lista_Total.get(i).getFamilia()+"\n"+lista_Total.get(i).getDireccion()+"\n"+lista_Total.get(i).getRegalo()+"\n"+lista_Total.get(i).getTelefono());
             
        }

    }

    public void mostrar_los_que_van(){
        double acum=0;
        double acum1=0;
        ob.mostrar("Datos de los invitados que asisten: ");
    for (int i = 0; i < lista1.size(); i++) {
            ob.mostrar("Invitado "+(i+1));
             ob.mostrar("los datos son:\n" + lista1.get(i).getNombreinvi() +"\n"+ lista1.get(i).getParentesco() +"\n"+lista1.get(i).getFamilia()+"\n"+lista1.get(i).getDireccion()+"\n"+lista1.get(i).getRegalo()+"\n"+lista1.get(i).getTelefono());
            acum=acum+lista1.get(i).getComida();
            acum1=acum1+lista1.get(i).getRecordatorio();
            
       }
          ob.mostrar("el dinero invertido en comida es: "+acum);      
          ob.mostrar("el dinero invertido en recordatorios es: "+acum1);
    }
    public void mostrar_los_que_no_van(){
        ob.mostrar("Datos de los invitados que no asisten: ");
    for (int i = 0; i < lista2.size(); i++) {
            ob.mostrar("Invitado "+(i+1));
            ob.mostrar("los datos son:\n" + lista2.get(i).getNombreinvi() +"\n"+ lista2.get(i).getRegalo());
    }
}
    public void mostrar_regalos_de_los_que_no_van(){
        ob.mostrar("Regalos de los que no asisten");
        for (int i = 0; i < lista2.size(); i++) {
            ob.mostrar(lista2.get(i).getRegalo());

    }

}
   
  public boolean comp(String reg){

        int a = 0;
        for (int i = 0; i < lista_Total.size(); i++) {
            if (reg.equalsIgnoreCase(lista_Total.get(i).getRegalo())) {
                ob.mostrar(reg + " == " + lista_Total.get(i).getRegalo());
                a = 1;
            }
        }
        if (a == 1) {
            return true;
        } else {
            return false;
        }

    } 
public boolean compnombre(String nombre){

        int a = 0;
        for (int i = 0; i < lista_Total.size(); i++) {
            if (nombre.equalsIgnoreCase(lista_Total.get(i).getNombreinvi())) {
                ob.mostrar(nombre+ " == " + lista_Total.get(i).getNombreinvi());
                a = 1;
            }
        }
        if (a == 1) {
            return true;
        } else {
            return false;
        }

    }    
public boolean validardatos(double d1,double d2){
        return d1<d2;
}
}