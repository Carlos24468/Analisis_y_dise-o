
package tienda2;

public class Productos {
    String nombre;
    int stock;
    double precio;
    String codigo;
    public Productos (String nombre,String codigo, int stock, double precio){
        this.nombre=nombre;
        this.codigo=codigo;
        this.stock=stock;
        this.precio=precio;
}
    @Override
    public String toString(){
        return "Producto: " + nombre +" Codigo: "+codigo+" Stock: " +stock+ " Precio: " + precio;
    }
    
}
