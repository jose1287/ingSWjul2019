
package proyecto;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a,act;
        System.out.println("Ingrese año de nacimiento");
        a = x.nextInt();
        System.out.println("Ingrese año actual");
        act=x.nextInt();
        int edad=act-a;
 System.out.println("La persona tiene "+edad+ " años");        
        
    }
    
}
