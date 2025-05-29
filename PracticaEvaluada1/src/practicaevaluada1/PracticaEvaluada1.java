/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

import javax.swing.JOptionPane;

/**
 *
 * @author andreyvargassolis
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1.Solicitar salario
        2. Calcuclar el monto que deb pagar a la caja
        3. Imprimir - 
        La empresa deberá abonar a la CCSS el monto de #####.## por concepto de
        SEM y IVM.
        - Para la asociación de la empresa se le asigna un valor 6425,25
        
        
        
        
        - Seguro de Enfermedad y Maternidad (SEM) al 9.25% del salario.
- Invalidez, Vejez y Muerte (IVM) al 5.08% del salario.
Por ejemplo, si el salario de un empleado es de ₡300,000:   
        
₡300,000 x 0.0925 = ₡27,750 (Monto de SEM)
₡300,000 x 0.0508 = ₡15,240 (Monto de IVM)
        
Además del monto con deducciones se le debe de calcular 2.5% para la asociación.
Cree una variable llamada variableMuestra y sume los tres montos ahí
En consecuencia, la empresa deberá pagar a la CCSS un total de ₡42,990.
Resultado esperado para el programa:
        
        
- La empresa deberá abonar a la CCSS el monto de #####.## por concepto de
SEM y IVM.
- Para la asociación de la empresa se le asigna un valor 6425,25
        */
        String lectura;
        double salario;

        lectura = JOptionPane.showInputDialog("Digite su salario mensual: ");
        salario = Double.parseDouble(lectura);
        
        double AbonoSEM = salario * 0.0925;
        double AbonoIVM = salario * 0.0508;
        
        double AbonoCaja = AbonoSEM + AbonoIVM;
        
        //double AbonoAso = salario * 0.025;
        
        double AbonoAso = (salario - AbonoCaja) * 0.025;
        
        double varieblemuestra = AbonoCaja + AbonoAso;

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + AbonoCaja + "por concepto de\n"
                + "SEM y IVM.");
        
        JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor de: " + AbonoAso);
        
        
        
        
          
          
                  
          
          
        
    }
    
}
