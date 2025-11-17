
package tienda2;
import java.util.*;
public class Mochila {
    public class SeleccionOptima {
    private ArrayList<Productos> productos;
    private double mejorValor;
    private ArrayList<Productos> mejorSeleccion;

    public SeleccionOptima(ArrayList<Productos> productos) {
        this.productos = productos;
        this.mejorValor = 0;
        this.mejorSeleccion = new ArrayList<>();
    }

    public void buscarSeleccionOptima(double presupuesto) {
        backtrack(0, presupuesto, 0, new ArrayList<>());
        if (mejorSeleccion.isEmpty()) {
            System.out.println("No hay selección valida dentro del presupuesto..");
        } else {
            System.out.println("\nMejor selección encontrada:");
            mejorSeleccion.forEach(System.out::println);
            System.out.println("Valor total: " + mejorValor);
        }
    }

    private void backtrack(int i, double presupuestoRestante, double valorActual, ArrayList<Productos> seleccionActual) {
        if (i == productos.size() || presupuestoRestante <= 0) {
            if (valorActual > mejorValor) {
                mejorValor = valorActual;
                mejorSeleccion = new ArrayList<>(seleccionActual);
            }
            return;
        }

        Productos actual = productos.get(i);

        if (actual.precio <= presupuestoRestante) {
            seleccionActual.add(actual);
            backtrack(i + 1, presupuestoRestante - actual.precio, valorActual + actual.precio, seleccionActual);
            seleccionActual.remove(seleccionActual.size() - 1);
        }

        backtrack(i + 1, presupuestoRestante, valorActual, seleccionActual);
    }
}
}
