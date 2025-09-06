
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
    @Override
    public String toString(){
        return "Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock;
    }
    
}
