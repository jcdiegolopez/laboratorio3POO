import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Esta clase representa el sistema de invetario de ventas de un emprendimiento.
 */
class Emprendimiento{

    public static void main(String[] args){
        ArrayList<Producto> inventario = null;
        Scanner scanner = new Scanner(System.in);
        try {
            inventario = loadData();
        } catch (Exception e) {
            System.out.println("No se pudo cargar la informacion del inventario "+ e.getMessage());
        }
        if(inventario!=null){
            boolean running = true;
            int opt;
            while(running){
                System.out.println("1. Productos disponibles por categoria con disponibilidad");
                System.out.println("2. Bucar producto por id");
                System.out.println("3. Listar productos por categoria");
                System.out.println("4. Ventas y comision");
                System.out.println("5. Salir");
                System.out.println("Elija lo que desea hacer: ");
                opt = scanner.nextInt();

                switch (opt) {
                    case 1:
                        int totB = 0;
                        int totS = 0;
                        int totP = 0;
                        for(Producto producto: inventario){
                            if(producto instanceof Bebida){
                                totB += producto.getCantD();
                            }else if(producto instanceof Snack){
                                totS =+ producto.getCantD();
                            }else if(producto instanceof Postre){
                                totP =+ producto.getCantD();
                            }
                        }
                        System.out.println("Bebidas - "+totB);
                        System.out.println("Snacks - "+totS);
                        System.out.println("Postres - "+totP);
                        break;
                    case 2:
                        System.out.println("Ingrese el id de su producto: ");
                        int id = scanner.nextInt();
                        Producto actual = null;
                        for(Producto producto: inventario){
                            if(producto.getId() == id){
                                actual = producto;
                            }
                        
                        }
                        if(actual!= null){
                            System.out.println(actual);
                        }else{
                            System.out.println("No se ha encontrado un producto con este id");
                        }
                        break;
                    case 3:
                        System.out.println("1. Bebida");
                        System.out.println("2. Snack");
                        System.out.println("3. Postre");
                        System.out.println("Elija la categoria: ");
                        int se = scanner.nextInt();
                        switch (se) {
                            case 1:
                                for(Producto producto: inventario){
                                    if(producto instanceof Bebida){
                                        System.out.println(producto.getNombre());
                                    }
                                }
                                break;
                            case 2:
                                for(Producto producto: inventario){
                                    if(producto instanceof Snack){
                                        System.out.println(producto.getNombre());
                                    }
                                }
                                break;
                            case 3:
                                for(Producto producto: inventario){
                                    if(producto instanceof Postre){
                                        System.out.println(producto.getNombre());
                                    }
                                }
                                break;
                            default:
                                System.out.println("No es una opcion valida");
                                break;
                        }
                        
                        break;
                    case 4:
                        float ventasTotales = 0;
                        float ventasPostres = 0;
                        double comision = 0;
                        for(Producto producto: inventario){
                            ventasTotales += producto.getPrecio()*producto.getCantV();
                        }
                        System.out.println("Las ventas totales son: Q"+ventasTotales);
                        for(Producto producto: inventario){
                            if(producto instanceof Postre){
                            ventasPostres += producto.getPrecio()*producto.getCantV();
                        } 
                        }
                        comision = ventasPostres *0.2;
                        System.out.println("La comision sobre la categoria postre son: Q"+comision);
                        break;
                    case 5:
                        running = false;
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("No es una opcion valida");
                        break;
                }
            }
        }
    }


        /**
     * Carga los datos de los jugadores desde archivos CSV.
     *
     * @return Una lista de jugadores cargada desde los archivos CSV.
     * @throws Exception Si ocurre un error al cargar los datos.
     */

    public static ArrayList<Producto> loadData() throws Exception{
        try{
            ArrayList<Producto> temp = new ArrayList<Producto>();  
            Scanner scanner = new Scanner(new File("bebidas.csv"));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] valores = linea.split("\\|");
                temp.add(new Bebida(Integer.parseInt(valores[0]),valores[1],Integer.parseInt(valores[2]),Integer.parseInt(valores[3]),Boolean.parseBoolean(valores[4]),Float.parseFloat(valores[5]),Integer.parseInt(valores[6]),valores[7])); 
            }
            scanner = new Scanner(new File("snacks.csv"));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] valores = linea.split("\\|");
                temp.add(new Snack(Integer.parseInt(valores[0]),valores[1],Integer.parseInt(valores[2]),Integer.parseInt(valores[3]),Boolean.parseBoolean(valores[4]),Float.parseFloat(valores[5]),Integer.parseInt(valores[6]),valores[7],valores[8])); 
            }
            scanner = new Scanner(new File("postres.csv"));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] valores = linea.split("\\|");
                temp.add(new Postre(Integer.parseInt(valores[0]),valores[1],Integer.parseInt(valores[2]),Integer.parseInt(valores[3]),Boolean.parseBoolean(valores[4]),Float.parseFloat(valores[5]),Integer.parseInt(valores[6]),valores[7])); 
            }
            return temp;
        }catch(Exception e){
            throw new Exception(e);
        }

    }

}