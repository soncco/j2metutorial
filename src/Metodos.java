import com.sun.perseus.model.SimpleCanvasManager;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class Metodos {
  /**
   * Separa una cadena de acuerdo a un separador y lo convierte en un vector
   * @param cadena
   * @param separador
   * @return 
   */
  public static Vector split(String cadena, String separador){
    Vector items = new Vector();
    int pos = 0;
    pos = cadena.indexOf(separador);
    while(pos >= 0){
      items.addElement(cadena.substring(0,pos).trim());
      cadena = cadena.substring(pos + separador.length());
      pos = cadena.indexOf(separador);
    }
    items.addElement(cadena);
    return items;
  }
  
  /**
   * Obtiene el elemento mayor de una cadena de enteros.
   * @param numeros
   * @return 
   */
  public static String elementoMayor(String numeros) {
    // Obtengo el arreglo de números.
    Vector arreglo = split(numeros, " ");
    
    // Asigno el mayor al primer elemento de la lista.
    int mayor = Integer.parseInt(arreglo.elementAt(0).toString());
    
    // Recorro para comparar el mayor.
    for(int i = 0; i < arreglo.size(); i++) {
      int elementoActual = Integer.parseInt(arreglo.elementAt(i).toString());
      
      if(elementoActual > mayor)
        mayor = elementoActual;      
    }
    // Devuelvo el elemento mayor.
    return Integer.toString(mayor);
  }
  
  /**
   * Bubble Sort.
   * @param arr
   * @return 
   */
  public static Vector bubbleSort(Vector arr) {
    boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < arr.size() - j; i++) {
      int e1 = Integer.parseInt(arr.elementAt(i).toString());
      int e2 = Integer.parseInt(arr.elementAt(i+1).toString());
      if (e1 > e2) {
        tmp = e1;
        arr.setElementAt(arr.elementAt(i + 1), i);
        arr.setElementAt(new Integer(tmp), i + 1);
        swapped = true;
      }
      }
    }

    return arr;
  }
  
  /**
   * Ordenar numeros en una cadena.
   * @param numeros
   * @return 
   */
  public static String ordenar(String numeros) {
    // Obtengo el arreglo de números.
    Vector arreglo = split(numeros, " ");
    Vector ordenado = bubbleSort(arreglo);
    String arregloOrdenado = "";

    // Recorro para comparar el mayor.
    for(int i = 0; i < ordenado.size(); i++) {
      arregloOrdenado += ordenado.elementAt(i) + " ";
    }

    // Arreglo ordenado como String.
    return arregloOrdenado;
  }
  
}
