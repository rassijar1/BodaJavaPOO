/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JOptionPane;

public class Inout {
    public String PedirInvitado (String m){
        return JOptionPane.showInputDialog(m);
    
}
    public void mostrar (String m){
    JOptionPane.showMessageDialog(null, m);
}

public double PedirTel (String m){
    String d=JOptionPane.showInputDialog(m);
    return Double.parseDouble(d);
}
 public int pedirentero (String m){
     String e= JOptionPane.showInputDialog(m);
     return Integer.parseInt(e);
 }   
public int mostrarentero(int n){
    JOptionPane.showInputDialog(n);
        return 0;
}
public double pedirdouble(String n){
 return  Double.parseDouble(JOptionPane.showInputDialog(n));
}
}