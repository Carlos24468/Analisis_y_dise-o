
package tienda2;
import java.util.Scanner;
public class Tienda2 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String d;
        String c;
        int m;
        int mc;
        System.out.println("Ingrese el nombre de alguno de los propirtarios: ");
        d=sc.nextLine();
        Dueno pr =new Dueno(d);
        //confirma si es el dueño si es asi le da la bienbenida si no le pide que lo intente otra ves 
        if(pr.propietarios(d)){ 
            //se crea un solo objeto cliente 
        Clientes cl1=new Clientes("");
        sc.nextLine();
        //menu general
        System.out.println("**********MENU**********\n(1)Clientes\n(2)Productos\n(3)Almacen\n************************");
        m=sc.nextInt();
        if(m==1){
            
            sc.nextLine();
            //Menu de los clientes
            System.out.println("**********MENU**********\n(1)Agregar clientes\n(2)Buscar clientes\n(3)Lista de clientes\n************************");
            mc=sc.nextInt();
            sc.nextLine();
            if(mc==1){
            System.out.println("ingresar nombre del cliente: ");
            c=sc.nextLine();
            
        
        cl1.registro(c);
        }
        
        if(mc==2){
            
        }
        //imprime a los clientes registrados
        if(mc==3){
        cl1.lista();
        }
    }
    }
}
}