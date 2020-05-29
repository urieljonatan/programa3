/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * @28/5/20
 */
package codigo3;
import javax.swing.*;
/**
 *
 * @author Uriel Solano
 */
public class Codigo3 {
    public static void restador(String numero){ //Inicio del metodo
        String numero1="";//Asignando el valor de la cadena llamada numero1
        String numero2="";//Asignando el valor de la cadena llamada numero2
        int separador=0;//Asignar el valor de la variable separador
        for(int i=0;i<=numero.length()-1;i++){//Inicio del for
            if(numero.charAt(i)!=' '){ //Inicio del if
                numero1=(numero1+numero.charAt(i));//Asignar a numero1 su valor sumado por el valor de la posicion indicada
            }else{ //Inicio del else
                separador=i;
                break; //Saltar a la siguiente linea de codigo
            }//Fin del else
        }//Fin del for
        for(int j=separador+1;j<=numero.length()-1;j++){//Inicio del for
            if(numero.charAt(j)!=' '){//Inicio del if
                numero2+=(numero.charAt(j));
            }else{ //Inicio del else
                separador=j;
                break;//Saltar a la siguiente linea de codigo
        }//Fin del else
    }//Fin del for
    System.out.println("Entrada "+numero1+" "+numero2);//Imprimir Entrada mas el valor de numero1 mas un espacio mas el valor de numero2
    System.out.println("Salida "+(Integer.parseInt(numero1)-Integer.parseInt(numero2)));//Imprimir salida mas la diferencia entre numero1 y numero2
} //Fin del metodo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Inicio del main
        // TODO code application logic here
        String numeroEntrada=JOptionPane.showInputDialog(null,"Ingresa numeros separados por un espacio");//Solicitando dos numeros
        restador(numeroEntrada);//Mandar a llamar el metodo
    } //Fin del main
    
} //Fin de la clase
