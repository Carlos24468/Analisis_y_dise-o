
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
    //agregar productos :echo
    //poner una lista de los productos si no hay productos le dira que no hay productos registrados
    //usar el mettodo burbuja para ordenar nombres 
    //ordenar por precios
}
