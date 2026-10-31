# U1Recuperacion1

U1Recuperacion1

Autor: Cristopher Gerardo Villanueva Ramirez Fecha: 30/10/2026

Ejercicios resueltos

Recursivo


Palindromo.java – Palíndromo

MaximoArreglo.java – Máximo de un arreglo

DecimalBinario.java – Conversión de decimal a binario

ContarVocales.java – Contar vocales de una cadena


Arreglos


InvertirArreglo.java – Invirtiendo el arreglo

SinDiagonal.java – Sin la diagonal

SumarFilasColumnas.java – Sumar filas y columnas

QuitarDuplicados.java – Quitar duplicados


Genéricos


CajaGenerica.java – Caja genérica

RegistroAsistencia.java – Registro de asistencia

GrupoEscolar.java – Grupo escolar


Explicación de cada ejercicio

En cada ejercicio se explica: (a) el caso base, la estructura del arreglo o el parámetro de tipo, (b) por qué se eligió esa solución y (c) las pruebas realizadas (al menos 3, una de ellas es un caso límite).

RECURSIVO
1. Palíndromo 

(a) Caso base: cuando , ya se revisó toda la palabra hasta el centro y todas las letras coincidieron, así que devuelve . También hay un caso de corte: si las letras de los extremos son distintas, devuelve .inicio >= fintruefalse

(b) Por qué esta solución: un palíndromo se puede revisar comparando los dos extremos y repitiendo lo mismo con lo que queda en medio. Eso es justo una recursión: cada llamada resuelve un problema más pequeño. Antes de revisar se limpia el texto (minúsculas, sin espacios ni signos) para que frases como "anita lava la tina" también funcionen.

(c) Pruebas:

Entrada	Resultado
"anita lava la tina"	true
"hola"	false
"a" (límite: una sola letra)	true
"" (límite: texto vacío)	true


2. Máximo de un arreglo 

(a) Caso base: cuando , es decir, el último elemento. Ahí solo queda un candidato, así que se devuelve ese valor.posicion == arreglo.length - 1

(b) Por qué esta solución: el máximo de un arreglo es el mayor entre el elemento actual y el máximo del resto. Se compara cada elemento contra lo que devuelve la llamada recursiva, usando . Es corta y fácil de seguir. Limitación: el arreglo debe tener al menos un elemento.Math.max

(c) Pruebas:

Entrada	Resultado
{4, 17, 9, 23, 5, 12}	23
{-8, -3, -15} (todos negativos)	-3
{7} (límite: un solo elemento)	7


3. Conversión de decimal a binario 

(a) Caso base: cuando (es 0 o 1), ese mismo dígito ya es su representación binaria, y se devuelve como texto.numero < 2

(b) Por qué esta solución: el método manual consiste en dividir entre 2 y leer los residuos de abajo hacia arriba. La recursión hace eso solo: primero resuelve y luego agrega al final el residuo . Se devuelve un para poder concatenar los dígitos. Limitación: funciona con enteros no negativos.numero / 2numero % 2String

(c) Pruebas:

Entrada	Resultado
10	1010
255	11111111
0 (límite)	0
1 (límite)	1


4. Contar vocales de una cadena 

(a) Caso base: cuando , ya se recorrió toda la cadena y se devuelve .posicion == texto.length()0

(b) Por qué esta solución: en cada llamada se revisa una letra (suma 1 si es vocal, 0 si no) y se suma lo que devuelva la llamada para el resto de la cadena. Así se recorre el texto letra por letra sin usar ciclos. El método auxiliar revisa mayúsculas y minúsculas.esVocal

(c) Pruebas:

Entrada	Resultado
"hola"	2
"xyz" (sin vocales)	0
"AEIOU" (mayúsculas)	5
"" (límite: cadena vacía)	0


ARREGLOS


5. Invirtiendo el arreglo

(a) Estructura: arreglo unidimensional de enteros (). Se usan dos índices, (empieza en 0) y (empieza en el último), que avanzan uno hacia el otro hasta cruzarse.int[]izquierdaderecha

(b) Por qué esta solución: intercambiar los extremos y avanzar hacia el centro invierte el arreglo sin crear otro arreglo, usando solo una variable temporal. Es eficiente y fácil de entender.

(c) Pruebas:

Entrada	Resultado
{1, 2, 3, 4, 5} (cantidad impar)	[5, 4, 3, 2, 1]
{1, 2, 3, 4} (cantidad par)	[4, 3, 2, 1]
{9} (límite: un elemento)	[9]
{} (límite: arreglo vacío)	[]


6. Sin la diagonal

(a) Estructura: matriz de enteros (). La diagonal principal son las posiciones donde .int[][]fila == columna

(b) Por qué esta solución: con dos ciclos anidados se recorre toda la matriz y, con un , se omiten las posiciones de la diagonal. El programa tiene dos métodos: uno que muestra la matriz con un guion en lugar de la diagonal y otro que suma todo lo que no está en la diagonal.if

(c) Pruebas (suma sin diagonal):

Entrada	Resultado
{{1,2,3},{4,5,6},{7,8,9}}	30
{{1,2},{3,4}}	5
{{5}} (límite: matriz de 1x1, solo hay diagonal)	0


7. Sumar filas y columnas 

(a) Estructura: matriz de enteros (). El resultado de cada método es un arreglo : uno con la suma de cada fila y otro con la suma de cada columna.int[][]int[]

(b) Por qué esta solución: se usa el mismo recorrido de dos ciclos anidados para ambos métodos; solo cambia dónde se acumula el valor ( o ). Funciona también con matrices que no son cuadradas.resultado[fila]resultado[columna]

(c) Pruebas:

Entrada	Filas	Columnas
{{2,4,6},{1,3,5},{7,8,9}}	[12, 9, 24]	[10, 15, 20]
{{1,2},{3,4}}	[3, 7]	[4, 6]
{{1,2,3}} (una sola fila, no cuadrada)	[6]	[1, 2, 3]
{{5}} (límite: 1x1)	[5]	[5]


8. Quitar duplicados 

(a) Estructura: arreglo unidimensional de enteros (). Se usa un arreglo temporal del mismo tamaño y un contador que indica cuántos valores únicos van guardados.int[]cantidad

(b) Por qué esta solución: se recorre el original y, por cada valor, se revisa con si ya está guardado. Si no está, se agrega. Así se conserva el orden original y no se necesitan estructuras avanzadas. Al final se recorta el arreglo al tamaño real con .yaExisteArrays.copyOf

(c) Pruebas:

Entrada	Resultado
{3, 7, 3, 1, 7, 9, 1}	[3, 7, 1, 9]
{1, 2, 3} (sin repite)	[1, 2, 3]
{5, 5, 5, 5} (todos iguales)	[5]
{} (límite: arreglo vacío)	[]


CLASES PARAMETRIZADAS / GENÉRICOS



9. Caja genérica

(a) Parámetro de tipo: . Representa el tipo del contenido, que se decide al crear el objeto (, , etc.).TCajaGenerica<String>CajaGenerica<Integer>

(b) Por qué esta solución: sin genéricos habría que hacer una caja para cada tipo (una de texto, una de números...). Con , una sola clase sirve para cualquier tipo, y Java verifica en compilación que no se mezclen tipos.T

(c) Pruebas:

Prueba	Resultado
CajaGenerica<String> Contra "Hola"	getContenido() devuelve Hola
CajaGenerica<Integer> Contra 2026	getContenido() devuelve 2026
Caja creada con (límitenull)	estaVacia() devuelve true


10. Registro de asistencia 

(a) Parámetro de tipo: . Es el tipo con el que se identifica a cada alumno (por ejemplo nombre o matrícula ). Internamente usa un .TStringIntegerArrayList<T>

(b) Por qué esta solución: un crece según se necesite y permite revisar rápido si alguien ya está con . Con esto, evita agregar al mismo alumno dos veces. Al ser genérica, el mismo registro sirve para nombres o matrículas.ArrayListcontainsregistrar

(c) Pruebas:

Prueba	Resultado
Registrar , y otra vez "Ana""Luis""Ana"	Se guardan solo 2 alumnos
asistio("Luis")	true
asistio("Marta") (no registrada)	false
RegistroAsistencia<Integer> con matrículas, , 101102101	asistio(101) es, es trueasistio(999)false
Registro recién creado, sin alumnos (límite)	Muestra 0 alumnos


11. Grupo escolar

(a) Parámetro de tipo: . Es el tipo de los integrantes del grupo (nombres, objetos alumno, etc.). Guarda el nombre del grupo y un con los integrantes.TArrayList<T>

(b) Por qué esta solución: un grupo escolar cambia de tamaño (entran y salen alumnos), y el lo maneja sin tener que fijar un tamaño de antemano. Al ser genérico, no depende de cómo se represente a cada integrante.ArrayList

(c) Pruebas:

Prueba	Resultado
Agregar , y "Sofía""Carlos""Valeria"	totalIntegrantes() es 3
Eliminar "Carlos"	Devuelve y quedan 2 integrantestrue
Eliminar un integrante que no existe (límite)	Devuelve y el total no cambiafalse
