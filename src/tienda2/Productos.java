
package tienda2;

public class Productos {
    String nombre;
    int stock;
    double precio;
    public Productos (String nombre, int stock, double precio){
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
}
    public void mostrar(){
        System.out.println("Nombre: "+nombre+" Precio: "+precio+"Stock"+stock);
    }
    
}
