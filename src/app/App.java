package app;

public class App {

    public static void main(String[] args) {
        MetodosBusqueda metodos = new MetodosBusqueda();
        int[] arreglo = {5, 12, 8, 21, 1, 9};
        int valor = 21;

        int resultado = metodos.busquedaLineal(arreglo, valor);

        if (resultado != -1) {
            System.out.println("-*Valor encontrado en el índice: " + resultado);
        } else {
            System.out.println("-*Valor no encontrado.");
        }
    }
}
