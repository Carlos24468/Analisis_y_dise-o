
package tienda2;
import java.util.*;
public class Almacen {
    ArrayList<Productos>lista=new ArrayList<Productos>();
    HashMap<String,Productos> productoshs= new HashMap<>();
    // agregar un producto
    public void agrepro(Productos p){
        if(productoshs.containsKey(p.codigo)){
            System.out.println("El codigo de este producto ya existe");
        }
        else{
            lista.add(p);
            productoshs.put(p.codigo, p);
            System.out.println("Producto agregado con exito");
        }
     
        
    }
    public void buscarxcod(String codigo){
         Productos p1 = productoshs.get(codigo);
         if(p1!=null){
             System.out.println("Producto encontrado: "+p1);  
         }
         else{
             System.out.println("El codigo del producto no existe: "+codigo);
         }
     }   
    public void listapro(){
        if(lista.isEmpty()){
            System.out.println("No hay productos registrados.");
            
        }
        else{
        System.out.println("LISTA DE PRODUCTOS.");
        lista.forEach(System.out::println);
        }
    }
    //ordenacion por insercion 
    //odena los productos segun el precio
    public void ordenPrecio(){
        lista.sort(Comparator.comparingDouble(p->p.precio));
    }
    //ordenacion por insercion 
    //ordana los nombres segun que tan grande sea el nombre  
    public void ordennombre(){
        lista.sort(Comparator.comparing(p->p.nombre.toLowerCase()));
        
    }
    
}
