# ProyectoAyC

Para generar el build del proyecto es necesario ejecutar el siguiente comando:

  > ./gradlew clean build
  
El mismo descarga las dependencias necesarias, ejecuta los tests, arma el ejecutable del proyecto
y genera un reporte de los tests ejecutados. Adicionalmente se agrego un script para analizar el 
coverage de los tests.

Los reportes son generados en la carpeta build\reports.

El jar de la aplicacion se genera en la carpeta build\libs.
