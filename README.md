# ucse-prog2-2024-U2-Manna

La conclusión del ejercicio 2 es que el "parallelStreamFilter" tiene un mayor puntaje que el "StreamFilter", esto quiere
decir que el primer proceso realiza mayor cantidad de operaciones por segundo con respecto al segundo proceso. Esto es
asi debido a que el "parallelStreamFilter" permite la ejecución a través del uso de múltiples hilos de ejecución y por
lo tanto un mayor rendimiento.

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- El proyecto no compila ni con java 21, java 22. Por favor especificar la versión a utilizar en el `README.md`
- No se pueden ver las imágenes de las conclusiones
- Los test deberían de ir en la carpeta correspondiente, no en el package main. Los tests no se pueden ejecutar y tienen
  errores de imports no encontrados.
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Se podría analizar qué Modo de Benchmark utilizaron, por qué lo
  eligieron (o incluso comparar los resultados entre los distintos modos), análizar qué representan los resultados, cómo
  influye la tasa de errores, etc. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Para futuros trabajos, les sugiero actualizar directamente el archivo `README.md` con estas conclusiones y las nuevas
  imágenes pertinentes, en lugar de incluirlas únicamente en la sección de "Correcciones realizadas".

## Adicionales:

- Seguir como estándar CamelCase para los nombres de las variables en las clases, y corregir los nombres de las clases y
  archivos para seguir un mismo estándar.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto
  en vez de ir en test/java deberían de ir dentro de test/java/org/example
- Se podrían optimizar los imports
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package
  correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear
