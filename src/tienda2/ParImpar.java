
package tienda2;

public class ParImpar {
      public boolean esPar(int n) {
        if (n == 0) return true;
        return esImpar(n - 1);
    }

    public boolean esImpar(int n) {
        if (n == 0) return false;
        return esPar(n - 1);
    }
    
    /*
    aqui implemente la recursibidad indirecta 
    cree un modulo donde calcula si el si el stock de un producto es par o impar 
    usando 2 funciones que se llaman mutuamente  aplicando asi ka recurividad indirecta 
    */
}
