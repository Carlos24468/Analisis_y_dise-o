
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
            System.out.println("wasaaaaaaaaa");
            System.out.println("doble wasaaaaaaaaaaaaaaaaaaaaaaa");
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