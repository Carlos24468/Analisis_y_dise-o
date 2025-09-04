
package tienda2;

public class Almacen {
    Productos [] producto;
    int cont;
    public Almacen(int cap){
        producto=new Productos[cap]; 
        cont=0;
    }
    // agregar un producto
    public void agrepro(Productos p){
        if(cont<producto.length){
            producto[cont]=p;
            cont++;
            System.out.println("Procucto agregado");
        }
        else{
            System.out.println("Capacidad maxima alcansada");
        }
        
    }
    public void listapro(){
        if(cont==0){
            System.out.println("No hay productos registrados");
            return;
        }
        System.out.println("LISTA DE PRODUCTOS");
        for(int i=0;i<cont;i++){
            System.out.println(producto[i]);
        }
    }
    //odena los productos segun el precio
    public void ordenPrecio(){
        for (int i=1;i<cont;i++){
            Productos actual =producto[i];
            int j=i-1;
            while(j>=0 && producto[j].precio>actual.precio){
                producto[j+1]=producto[j];
                j--;
            }
            producto[j+1]=actual;
        }
        System.out.println("Productos hordenados por precio");
    }
    //ordana los nombres segun que tan grande sea el nombre  
    public void ordennombre(){
        for(int i=1;i<cont;i++){
            Productos actual = producto[i];
            int j = i-1;
            //>0 -> alfabeticamente mallor que el segundo
            while(j>=0 && producto[j].nombre.compareToIgnoreCase(actual.nombre)>0){
                producto[j+1]=producto[j];
                j--;
                
            }
            producto[j+1]=actual;
        }
        System.out.println("producto ordenado por orden alfabetico");
    }
}
