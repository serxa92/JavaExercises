package SistemaDeGestiondeInventario;
/* Crea un metodo en Java que reciba un Map<String, int[]> representando un inventario de productos.
Las claves del Map son los nombres de los productos.
Los valores son arrays de tamaño 2:

índice 0: cantidad (int)
índice 1: precio unitario (en centavos para evitar usar double, o puedes usar double si prefieres).

🔄 El metodo debe:

Calcular el valor total de cada producto como cantidad * precio_unitario.
Devolver una lista de objetos (o pares) ordenada de mayor a menor según ese valor total.

🧪 Ejemplo de entrada:
Map<String, double[]> inventario = new HashMap<>();
inventario.put("manzanas", new double[]{50, 0.5});
inventario.put("naranjas", new double[]{30, 0.8});
inventario.put("plátanos", new double[]{20, 0.6});
inventario.put("uvas", new double[]{10, 1.2});

✅ Resultado esperado:
[("manzanas", 25.0), ("naranjas", 24.0), ("plátanos", 12.0), ("uvas", 12.0)]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Productos {

    public static void main(String[] args) {

        Map<String, double[]> inventario = new HashMap<>();
        List<ProductoValor> lista = new ArrayList<>();

        inventario.put("manzanas", new double[]{50, 0.5});
        inventario.put("naranjas", new double[]{30, 0.8});
        inventario.put("plátanos", new double[]{20, 0.6});
        inventario.put("uvas", new double[]{10, 1.2});


        for (Map.Entry<String, double[]> entrada : inventario.entrySet()) {
            String nombre = entrada.getKey();
            double cantidad = entrada.getValue()[0];
            double precio = entrada.getValue()[1];
            double valorTotal = precio * cantidad;

            lista.add(new ProductoValor(nombre, valorTotal));
        }

        lista.sort((a, b) -> Double.compare(b.valorTotal, a.valorTotal));

        for (ProductoValor producto : lista) {
            System.out.println("(" + producto.nombre + ", " + producto.valorTotal + ")");
        }


    }//main
}//classProductos

class ProductoValor {

    String nombre;
    Double valorTotal;

    public ProductoValor(String nombre, Double valorTotal) {
        this.nombre = nombre;
        this.valorTotal = valorTotal;
    }

}//class ProductoValor



