
package tienda2;

public class Dueno {
    String []du={"ENRIQUE","CARLOS","JOSE"};
    String p;
    boolean encontrado = false;
    public Dueno(String p){
        this.p=p;
    }
    
        public boolean propietarios(String d){
        for(int i=0;i<du.length;i++){
            if(d.equalsIgnoreCase(du[i])){
                System.out.println("Bienvenido");
                return true;
            }
        }
        System.out.println("Intentelo de nuevo ");
        return false;
        
    
}
}