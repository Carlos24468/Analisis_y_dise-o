
package tienda2;
import java.util.Scanner;
public class Clientes {
    Scanner sc1=new Scanner(System.in);
    String cl;
    String clr[]={"Ana", "Juan", "Pedro"};
    
    boolean clrr=false;
    public Clientes(String cl){
        this.cl=cl;      
    }
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
                
                System.out.println("Cliente no registrado\ningrese el nombre del cliente a registrar ");
                cl=sc1.nextLine();
                String clxr[]=new String[clr.length+1];
                for(int y=0;y<clr.length;y++){
                    clr[y]=clxr[y];
                }
                clxr[clr.length]=cl;
                clr=clxr;
                System.out.println("cliente registrado con exito");
            }
    
    
}
}