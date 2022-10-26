# POO-Project-Despacho-de-comidas
**Trabajo practico especial para la cursada de Programacion Orientada a Objetos de la carrera de Ingenieria en Sistemas UNICEN**

Damian Betular desea informatizar el despacho de
comidas del Palacio Duhau. En el Despacho cada mesa
ordena un pedido, el cual se encuentra formado por un
conjunto de comidas, el número de mesa y el mozo que
lo levantó. El Despacho se caracteriza por la diversidad de
preparaciones y comidas que se puede realizar. Una
comida puede ir de algo tan simple como un tomate a
algo tan complejo como lentejas rellenas con mousse de
champagne y portobellos. Cada comida posee un
nombre, un tipo (ensalada, postre, plato principal, tapas,
vegetal, fruta, etc), un modo de preparación principal (frito, al horno, al microondas, solo,
etc), las calorías, un precio y el tiempo necesario para su preparación (expresado en
minutos).

Luego de trabajar en el Palacio durante un tiempo, Damian se
dio cuenta de que muchas de las comidas que preparaba se
componían de otras comidas más simples. Por ejemplo para los
“Macarons rellenos de frutilla” es necesario contar tanto con
comidas simples como “pasta de frutilla” como con comidas más
complejas como “Tapa de Macarons” y “Ganache”.

Con esta idea de refactorizar las comidas, ahora las comidas simples seguirán teniendo
definido un precio, un tiempo de preparación y la cantidad de calorías, pero para las
comidas complejas, las calorías, el tiempo de preparación y el precio se calculan como la
suma de cada una de sus partes. El nombre, el tipo de comida y el modo de preparación se
mantiene común a ambos tipos de comidas.

Damian decidió organizar la cocina en estaciones de trabajo las cuales se encuentran
encargadas de la elaboración de las comidas. Dado que cada estación tiene especialidades
diferentes, cuando un pedido arriba a la cocina, las comidas que se pidieron en el mismo se
van asignado a las diferentes estaciones, hasta que alguna la acepte. Para mantener al
equipo atento, las especialidades de cada estación de trabajo puede variar en cualquier
momento (en tiempo de ejecución).

Una estación de trabajo aceptará preparar una comida, si su especialidad lo permite según
los siguientes criterios (o variantes de los mismos):

- Solo aceptar recetas cuyo modo de preparación principal sea “al
horno”.
- Solo se aceptan recetas que sean del tipo “ensalada”.
- Solo se aceptan recetas que se preparen en menos de 15 minutos.
- También pueden existir combinaciones de especialidades, por
ejemplo aceptar solo comidas del tipo “ensalada” y que el tiempo de
preparación sea menor a 20 minutos; o aceptar recetas que se
hagan al horno y no contengan menos de 400 calorías.

En la cocina puede haber muchas estaciones de trabajo cada una con diferentes
especialidades. Si ninguna estación acepta la comida, la cocina tiene una estación por
defecto a la cual le asignan las comidas que no son aceptadas.

Finalmente, también se definieron criterios a la hora de cobrar a los comensales. El costo
total de un pedido se calcula como la suma de los costos de todas sus comidas más un
adicional que aplica el Palacio a cada comida ordenada, en base a algún criterio. Ejemplos
de posibles criterios son:

Si es cocinada al horno y en menos de 15 minutos
suman $50; en otro caso se suman $130.
- Si es una ensalada:suman $10; otro caso $50.
- Sumar 100$ solo si las calorías son mayores a 500.
- Sumar un 10% del precio de la comida en calidad de
propina para los mozos
- Sumar un 55% del precio de la comida en concepto de
“día agitado”.
- Descontar un 20% los días miércoles.

NOTA: El criterio lo establece la cocina y es el mismo para todos los pedidos. Sin embargo,
cada día la cocina puede establecer un criterio diferente, o incluso una combinación de
varios criterios, por ejemplo sumar un 10% por propina y también sumar $100 si las calorías
eran mayores a 500
