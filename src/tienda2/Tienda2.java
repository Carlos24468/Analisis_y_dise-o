
package tienda2;
import java.util.Scanner;
public class Tienda2 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String d;
        String c;
        System.out.println("Ingrese el nombre de alguno de los propirtarios: ");
        d=sc.nextLine();
        Dueno pr =new Dueno(d);
        pr.propietarios(d);
        sc.nextLine();
        System.out.println("ingresar nombre del cliente:");
        c=sc.nextLine();
        
        Clientes cl1=new Clientes(c);
        cl1.registro(c);
        
    }
    
}
