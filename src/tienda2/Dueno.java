
package tienda2;

public class Dueno {
    String []du={"ENRIQUE","CARLOS","JOSE"};
    String p;
    boolean encontrado = false;
    public Dueno(String p){
        this.p=p;
    }
    public void propietarios(String d){
        for(int i=0;i<3;i++){
            if(d.equalsIgnoreCase(du[i])){
                encontrado=true;
                break;
            }
        }
            if(encontrado){
                System.out.println("Bienvenido");
                
            }
            else{
                System.out.println("intentelo de nuevo");
            }
        
    
}
}