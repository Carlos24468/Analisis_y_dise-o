
package tienda2;

public class Productos {
    String nombre;
    int stock;
    double precio;
    int codigo;
    public Productos (String nombre,int codigo, int stock, double precio){
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
}
    @Override
    public String toString(){
        return "Producto: " + nombre +"Codigo: "+codigo+ " | Precio: " + precio + " | Stock: " + stock;
    }
    
}
