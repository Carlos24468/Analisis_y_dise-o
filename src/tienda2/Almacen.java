
package tienda2;
import java.util.*;
public class Almacen {
    ArrayList<Productos>lista=new ArrayList<Productos>();
    HashMap<String,Productos> productoshs= new HashMap<>();
    // agregar un producto
    public void agrepro(Productos p){
        if(productoshs.containsKey(p.codigo)){
            System.out.println("El codigo de este producto ya existe.");
        }
        else{
            lista.add(p);
            productoshs.put(p.codigo, p);
            System.out.println("Producto agregado con exito.");
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
        System.out.println("LISTA DE PRODUCTOS:");
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
    //dividir y vencer
    public void shellSortporprecio(){
        
    int n = lista.size();
        int esp = n / 2;

        while (esp > 0) {
            for (int i = esp; i < n; i++) {
                Productos temp = lista.get(i);
                int j = i;
                while (j >= esp && lista.get(j - esp).precio > temp.precio) {
                    lista.set(j, lista.get(j - esp));
                    j -= esp;
                }
                lista.set(j, temp);
            }
            esp /= 2;
        }

        System.out.println("Productos ordenados con Shell Sort");
    }

    
    public void quickSortpornombre() {
        if (lista.size() > 1) {
            quickSortRecursivo(0, lista.size() - 1);
            System.out.println("Productos ordenados con Quick Sort");
        } else {
            System.out.println("No hay suficientes productos ");
        }
    }

    private void quickSortRecursivo(int bajo, int alto) {
        if (bajo < alto) {
            int pi = particionar(bajo, alto);
            quickSortRecursivo(bajo, pi - 1);
            quickSortRecursivo(pi + 1, alto);
        }
    }

    private int particionar(int bajo, int alto) {
        String pivote = lista.get(alto).nombre.toLowerCase();
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) {
            if (lista.get(j).nombre.toLowerCase().compareTo(pivote) < 0) {
                i++;
                Collections.swap(lista, i, j);
            }
        }
        Collections.swap(lista, i + 1, alto);
        return i + 1;
    }

    // busqueda lineal 
    public void busquedaLinealPorNombre(String nombreBuscado) {
        boolean encontrado = false;
        for (Productos p : lista) {
            if (p.nombre.equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Producto encontrado: " + p);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado con búsqueda lineal.");
        }
    }

    // busqueda binaria
    public void busquedaBinariaPorNombre(String nombreBuscado) {
        lista.sort(Comparator.comparing(p -> p.nombre.toLowerCase())); // requisito: lista ordenada
        int izquierda = 0;
        int derecha = lista.size() - 1;
        boolean encontrado = false;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            String nombreMedio = lista.get(medio).nombre.toLowerCase();

            if (nombreMedio.equals(nombreBuscado.toLowerCase())) {
                System.out.println("Producto encontrado" + lista.get(medio));
                encontrado = true;
                break;
            } else if (nombreMedio.compareTo(nombreBuscado.toLowerCase()) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado con binaria.");
        }
    }
}
