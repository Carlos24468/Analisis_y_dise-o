
package tienda2;
import java.util.*;
import java.io.*;
public class Clientes {
    Scanner sc1=new Scanner(System.in);
    ArrayList<String> clientes= new ArrayList<>();
    HashMap<String, String>clientesh=new HashMap<>();
    File archivoClientes = new File("Clientes.txt");
    
    public Clientes(){
       clientes.add("Ana");
       clientes.add("Juan");
       clientes.add("Pedro");
       for (String cl : clientes){
           clientesh.put(cl.toLowerCase(), cl);
       }
       cargarArchivo();
    }
    // verifica si el cliente esta registrado si no lo esta lo registra
    public void registro(String nombre){
        if(clientesh.containsKey(nombre.toLowerCase())){
            System.out.println("El cliente ya esta registrado.");
        }
        else{
            clientes.add(nombre);
            clientesh.put(nombre.toLowerCase(), nombre);
            guardarArchivo(nombre);
            System.out.println("Cliente registrado con exito.");
            
        }
}
    
    //busca a los clientes 
    public void busquedaI(String nombre){
      if (clientesh.containsKey(nombre.toLowerCase())){
          System.out.println("Cliente: "+nombre+"  esta registrado.");
      }
      else{
          System.out.println("El cliente no existe.");
      }
    }
    
    public void buscarRecursivo(String nombre, int indice) {
    //si llegamos al final de la lista
    if (indice >= clientes.size()) {
        System.out.println("Cliente no encontrado");
        return;
    }

    // Si encontramos al cliente
    if (clientes.get(indice).equalsIgnoreCase(nombre)) {
        System.out.println("Cliente encontrado." + clientes.get(indice));
        return;
    }

    // Llamada recursiva con el siguiente índice
    buscarRecursivo(nombre, indice + 1);
}
    
    /*
    La busqueda recursiba es una forma de buscar un elemento llamandose el mimo metodo
    repetidas veces asta que encuentre el resultadp o llege al final
    Esta forma en lugar de usar while o for se repite a si misma avansando una pocicion mas en la lista
    
    La recuribidad presenta el proceso de busqueda mas elegante y teorica aplicando los conceptos de divide
    y venceras esta no es mas eficiente que los bucles pero demientra que puede resolver el
    mismo problema sin interaciones explicadas 
    */
   
    public void lista(){
        System.out.println("Lista de clientes.");
        clientes.forEach(System.out::println);
        
    }
    //guarda a los clientes en un archivo txt como en la busqueda externa 
    private void guardarArchivo(String nombre){ 
        try (FileWriter fw = new FileWriter(archivoClientes, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nombre);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar cliente en archivo: " + e.getMessage());
        }
    }

    private void cargarArchivo(){
        try(BufferedReader br = new BufferedReader(new FileReader(archivoClientes))){
            String linea;
            while((linea=br.readLine())!=null){
                if(!clientesh.containsKey(linea.toLowerCase())){
                    clientes.add(linea);
                    clientesh.put(linea.toLowerCase(), linea);
                }
            }
        }
        catch(FileNotFoundException e){
            
        }
        catch (IOException e){
            System.out.println("Error al cargar el archivo"+e.getMessage());
        }
    }    
        

    public void busquedaExterna(String nombreBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoClientes))) {
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                if (linea.equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Cliente " + nombreBuscado + " encontrado en archivo.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Cliente " + nombreBuscado + " no existe en el archivo.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo de clientes no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}