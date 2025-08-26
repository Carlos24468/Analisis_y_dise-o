
package tienda2;
import java.util.Scanner;
public class Tienda2 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String d;
        String c;
        int m;
        System.out.println("Ingrese el nombre de alguno de los propirtarios: ");
        d=sc.nextLine();
        Dueno pr =new Dueno(d);
        if(pr.propietarios(d)){  
        
        sc.nextLine();
        System.out.println("**********MENU**********\n(1)Clientes\n(2)Productos\n(3)Almacen\n************************");
        m=sc.nextInt();
        if(m==1){
            sc.nextLine();
        System.out.println("ingresar nombre del cliente:");
        c=sc.nextLine();
        
        Clientes cl1=new Clientes(c);
        cl1.registro(c);
        }
    }
    }
}
