
package tienda2;
import java.util.*;
public class Clientes {
    Scanner sc1=new Scanner(System.in);
    String cl;
    String clr[]={"Ana", "Juan", "Pedro"};
    String bus;
    String lis;
    String clxr[]=new String[clr.length+1];
    boolean clrr=false;
    public Clientes(String cl){
        this.cl=cl;      
    }
    // verifica si el cliente esta registrado si no lo esta lo registra
    public void registro(String re){
        for (int i=0;i<clr.length;i++){
            
        if(re.equalsIgnoreCase(clr[i])){
                clrr=true;
                break;
            }
        }
            if(clrr){
                System.out.println("El cliente ya esta registrago");
                
            }
            else{
                
                System.out.println("Cliente no registrado\n\ningrese el nombre del cliente a registrar ");
                cl=sc1.nextLine();
                System.out.println("ingrese el DNI del cliente");
                String clxr[]=new String[clr.length+1];
                for(int y=0;y<clr.length;y++){
                    clxr[y]=clr[y];
                }
                clxr[clr.length]=cl;
                clr=clxr;
                System.out.println("cliente registrado con exito");
            }
    
    
}
    
    //busca a los clientes 
    public void busqueda(String bus){
        boolean clb=false;
         for (int i=0;i<clr.length;i++){
            
        if(bus.equalsIgnoreCase(clr[i])){
                clb=true;
                break;
            }
        }
            if(clb){
                System.out.println("El cliente ya esta registrago123");
                
            }
            else{
                
                System.out.println("Cliente no registrado rejistrelo por favor");
            }
        
    }
    //imprime los clientes registrados (aca se ordenara por orden alfabetico )
    public void lista(){
        System.out.println("LISTA DE CLIENTES");
        for(int i=0;i<clr.length;i++ ){
            System.out.println(clr[i]);
            
        }
        
    }
    /*
    aplicar un has donde se buscaran los dni de los clientes 
    agregar dni a los clientes 
    */
}