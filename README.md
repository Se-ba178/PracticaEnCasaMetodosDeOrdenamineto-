#    *Metodos de ordenamiento Practica prueba practica*

Los metodos de ordenamineto son algoritmos diseñados para organizar los elementos de una  lista y o arreglo en un orden especifico .Son  las bases de la eficiencia  en computacion , ya que facilitan enormemente las operaciones de busqueda 

En este caso veremos tres de los ejemplos de metodos de ordenamiento 


# *Insertion sort*
Funciona de manera similar a como organizar una baraja de cartas en las manos .Toma un elemento y lo inserta en la posicion correcta comparandolo con los que ya estan ordenados a su izquierda osea al principio de la lista.
## *Cuando se ocupa?*
             Este metodo de ordenamiento se ocupa para un conjunto de elementos o datos 
             ya esta casi ordenado o cuando manejas una pequeña muy pequeña de datos
## *Eficiencia*
             Es muy eficiente en terminos de memoria  tiene 
             espacio    O(1) y tiene un rendimiento de O(n) en su mejor caso.


## 🚀 *Implementación de Insertion Sort en Java*


```java
public static void insertionSort(int[] arreglo) {
    int tam = arreglo.length; // Guarda el tamaño del arreglo

    for (int i = 1; i < tam; i++) { // El elemento en posición 0 ya se considera ordenado
        int clave = arreglo[i];    // Guarda el elemento actual
        int j = i - 1;             // Se usa para comparar hacia la izquierda

        // Mueve los números hacia la derecha si son mayores que la clave
        while (j >= 0 && arreglo[j] > clave) {
            arreglo[j + 1] = arreglo[j]; // Desplaza el elemento
            j--;                         // Retrocede a la izquierda
        }
        arreglo[j + 1] = clave; // Inserta el valor en su posición correcta
    }
}
```


# *Selection Sort*

Busca el elementomas pequeño de la lista y lo intercambia con el primero.Luego bsuca el siguiente mas pequeño y lo pone en la segunda posicion y asi sucesivamente.

### *Cuando ocuparlo ?*
    Si la lista es pequeña de 20 - 30 elementos es rapida 
    Si la lista esta ya casi lista por ejemplo cuando solo tiene que acomodar dos numeros 
    Si vas recibiendo numeros de uno en uno y quieres mantener la lista ordenada mientras llegan.

## *Eficiencia*
    No es muy eficiente para listas grandes , ya q su complejidad 
    siempre es O(n^2) sin importar si la lista ya esta ordenada 

## 🚀 *Implementación de Selection sort  en Java*

```java

public static void selectionSort(int[] arreglo) {

    int tam = arreglo.length;   // tamaño del arreglo

    for (int i = 0; i < tam; i++) {    // recorre todo el arreglo
        int posicionMin = i;          // asumimos que i es el menor

        for (int j = i + 1; j < tam; j++) {     // busca el menor
            if (arreglo[j] < arreglo[posicionMin]) {  //En esta linea se ve si es acendete o descendente
                posicionMin = j;      // actualiza posición del menor
            }
        }

        int aux = arreglo[i];       // guarda valor actual
        arreglo[i] = arreglo[posicionMin]; // pone el menor en i
        arreglo[posicionMin] = aux ; // intercambia
    }
}
```












# *BurbujaAvanzado*

Optimiza añade una bandera booleana para detectar si hubo intercambios en una pasada .Si no hubo cambios , significa que la lista ya esta lista y el algoritmp se detiene .

## *Cuando ocuparlo ?*
    Es la forma mas sencilla de verificar si una lista ya esta lista . Si lanzas una pasada de butbuja y la bandera de intercambio no se activa puedes asegurar que la lista esta perfecta.
## *Eficiencia*
    En el mejor de los casos (lista ya ordenada) termina en O(n).En el peor ,sigue siendo O(n^2).

## 🚀 *Implementación de Burbuja avanzado  en Java*

```java

public static void burbujaAvanzado(int[] arreglo){
    int tam = arreglo.lenght;
    boolean y ;
    for(int i = 0; i < tam; i++){
        y = false;
        for(int j = 0; j < tam ; j++){
            if(arreglo[j] < arreglo[j + 1]){   //Esta linea determina si es ascendete o descendete 
                int aux = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = aux;
                y = true;

            } 
            if(! y)
             break

        }
    }

}

```


## 📊 Comparativa de Algoritmos de Ordenamiento

| Algoritmo | Complejidad (Peor Caso) | Complejidad (Mejor Caso) | Ventaja Principal | ¿Cuándo usarlo? |
| :--- | :--- | :--- | :--- | :--- |
| **Insertion Sort** | $O(n^2)$ | $O(n)$ | Extremadamente rápido para listas casi ordenadas. | Listas pequeñas o en tiempo real. |
| **Selection Sort** | $O(n^2)$ | $O(n^2)$ | Realiza el mínimo de intercambios de memoria. | Cuando el swap es costoso. |
| **Bubble Sort (Opt)**| $O(n^2)$ | $O(n)$ | Fácil de implementar y detecta orden previo. | Uso académico o listas mínimas. |



## 💻 *Metodo para imprimir cada metodo de Ordenamiento*

Esto debe ir siempre al final de una clase para asi poder imprimir los metodos de ordenamiento de una manera mas profesional en  la clase Principal `App` pero siempre fuera  `como si fuera un metodo mas de  la clase`

```java
public static void imprimir(int[] arreglo) {
        for(Int y : arreglo)
        System.out.println(arreglo.getNombre() + arreglo.getApellido() + ..................)
    }
```

de ahi solo lo llamamos a la clase main con el nombre de la clase y el mostar con el tipo de dato 

## *NombreDeLaClase.metodo();*

Ejemplo llamado al Main   `App` :

```java
System.out.println("Arreglo")
BurbujaAvanzado.imprimir(miArreglo);
```



### 🥴  Busqueda Binaria

*La búsqueda binaria es un algoritmo que se utiliza para encontrar un elemento en una lista ordenada de forma eficiente. Funciona dividiendo la lista en dos partes repetidamente y comparando el valor buscado con el elemento central, eliminando la mitad donde no puede estar.*

*Se utiliza para mejorar la velocidad de búsqueda en grandes conjuntos de datos, reduciendo el número de comparaciones necesarias.*

*Su complejidad es O(log n), lo que la hace mucho más rápida que la búsqueda lineal.*


```java
public Brand binarySearchByValidYears(Brand[] arreglo, int validYears, boolean isAscending) {

    // 1. Ordenar el arreglo
    MetodoDeOrdenamiento(arreglo);

    int bajo = 0;
    int alto = arreglo.length - 1;

    // 2. Búsqueda binaria
    while (bajo <= alto) {

        int centro = (bajo + alto) / 2;
        int valorCentro = arreglo[centro].getTotalValidYears();

        // 3. Si lo encuentra
        if (valorCentro == validYears) {
            return arreglo[centro];
        }

        // 4. Decidir dirección
        if (valorCentro < validYears) {
            bajo = centro + 1;
        } else {
            alto = centro - 1;
        }
    }

    // 5. No encontrado
    return null;
}

```

