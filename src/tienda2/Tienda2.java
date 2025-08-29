
package tienda2;
import java.util.Scanner;
public class Tienda2 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String d;
        String c;
        String cl;
        int m;
        int mc;
        boolean SALIR=false;
        boolean SALIR1=false;
        boolean SALIR2=false;
        boolean SALIR3=false;
        System.out.println("Ingrese el nombre de alguno de los propirtarios: ");
        d=sc.nextLine();
        Dueno pr =new Dueno(d);
        //confirma si es el dueño si es asi le da la bienbenida si no le pide que lo intente otra ves 
        if(pr.propietarios(d)){ 
            //se crea un solo objeto cliente 
        Clientes cl1=new Clientes("");
        sc.nextLine();
        //menu general
        while(!SALIR){
        System.out.println("**********MENU**********\n(1)Clientes\n(2)Productos\n(3)Almacen\n(4)SALIR************************");
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
            sc.nextLine();
            System.out.println("ingresar nombre del cliente: ");
            cl=sc.nextLine();
            cl1.busqueda(cl);
            
        }
        //imprime a los clientes registrados
        if(mc==3){
        cl1.lista();
        }
    }
        if(m==2){
            //aplicar lo de procutos
        }
        if(m==3){
            //apliacr lo echo en el almacen
        }
        if(m==4){
            System.out.println("SALIENDO TENGA UN BUEN DIA");
            SALIR=true;
            
        }
    }
        
    }
}
}
    