
package tienda2;
import java.util.*;
public class Tienda2 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String d;
        String c;
        String cl;
        String produc;
        int cdcl;
        int cdpro;        
        int m;
        int mc;
        int mal;
        boolean SALIR=false;
        
        System.out.println("Ingrese el nombre de alguno de los propirtarios: ");
        d=sc.nextLine();
        Dueno pr =new Dueno(d);
        //confirma si es el dueño si es asi le da la bienbenida si no le pide que lo intente otra ves 
        if(pr.propietarios(d)){ 
            //se crea un solo objeto cliente
        Almacen al1 = new Almacen(20);
        Clientes cl1=new Clientes("");
        sc.nextLine();
        //menu general
        while(!SALIR){
        System.out.println("**********MENU**********\n(1)Clientes\n(2)Productos\n(3)Almacen\n(4)SALIR\n************************");
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
            sc.nextLine();
            //aplicar lo de procutos
            System.out.println("***** Agregar Productos *****");
            System.out.println("Ingrese el nombre del producto");
                String nompro=sc.nextLine();
                System.out.println("ingrese el codigo del producto");
                int codpro=sc.nextInt();
                System.out.println("Ingrese el Stock del producto");
                int stockpro=sc.nextInt();
               
                  System.out.println("Ingrese el precio del producto");
                double prepro=sc.nextDouble();
                Productos proal = new Productos(nompro,codpro,stockpro,prepro);
                al1.agrepro(proal);
        }
        if(m==3){
            //apliacr lo echo en el almacen
            System.out.println("**********MENU**********\nLista de producto\n************************");
            
            
            sc.nextLine();
            
            
                System.out.println("\"**********MENU**********\n(1)Lista de productos\n(2)Lista de productos ordenados por precio\n(3)Lista de productos ordenados por nombre\n************************");
                int ldpo=sc.nextInt();
                if(ldpo==1){
                    System.out.println("Lista de productos");
                    al1.listapro();
                }
                if(ldpo==2){
                    System.out.println("Lista de productos ordenados por precio");
                    al1.ordenPrecio();
                    al1.listapro();
                }
                if(ldpo==3){
                    System.out.println("Lista de productos ordenados por nombre");
                    al1.ordennombre();
                    al1.listapro();
                }
            
        }
        if(m==4){
            System.out.println("SALIENDO TENGA UN BUEN DIA....");
          
            SALIR=true;
            
        }
    }
        
    }
}
}
    