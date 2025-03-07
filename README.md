Escribe un programa que solicite al usuario un número entero positivo n y genere un patrón numérico en forma de triángulo. El patrón debe seguir una secuencia donde cada línea comienza con el número de línea y aumenta hasta n, y luego disminuye hasta el número de línea nuevamente.
**Ejemplo de salida para n = 5:**

Para realizar el anterior ejercicio hice los siguienntes pasos
Pedi al usuario un número 
primero toca verificar que el numero sea positivo. En llegado caso no sea asi se mostrara un mensaje de error indicando que asi no es, luego
si el numero es positivo, hay si se genera el patrón, donde se genera un bucle para las filas del triángulo y se imprime números ascendentes desde el número de la fila hasta el numero pedido.
Luego imprime los números descendentes de vuelta hasta el número de la fila, ya para no que siga el mismo patrón y para finalizar se imprime cada fila con un salto de línea.
Use un bucle for para cada fila. El número de la fila es i, que va desde 1 hasta n.
Dentro de cada fila, primero se imprime una secuencia de números ascendentes, desde el número de la fila i hasta n.
Después, se imprimen los números descendentes desde n-1 hasta el número de la fila i.
use una  variable leer  de tipo int y  la utilizare para almacenar el número que el usuario ingresa, el cual determinara el tamaño del patrón que se va a imprimir. Esta variable se llama así porque representa el número que se "lee" desde la entrada del usuario. Las variables i y j también son de tipo int y se usan dentro de los bucles for para controlar la impresión del patrón. La variable i es el índice que controla las filas del patrón, y empieza desde 1 hasta el valor de leer, haciendo que el programa pase de una fila a otra. La variable j se usa en los dos bucles internos para imprimir los número,  en el primer bucle , j recorre los números ascendentes desde i hasta leer, y en el segundo bucle interno, j recorre los números descendentes desde leer, creando así el patrón 