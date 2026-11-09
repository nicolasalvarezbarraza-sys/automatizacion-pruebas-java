# automatizacion-pruebas-java
Proyecto de automatización de pruebas Java con Maven y JUnit.
# Automatización de pruebas Java

## 1. Objetivo
El objetivo de este proyecto es implementar pruebas unitarias automatizadas utilizando Java, Maven y JUnit, además de ejecutar las pruebas mediante un pipeline de Integración Continua (CI).

## 2. Tecnologías utilizadas
- Java 17.
- Maven.
- JUnit 5.
- Git y GitHub.
- GitHub Actions.

## 3. Estructura del proyecto

- `pom.xml`: configuración del proyecto y dependencias.
- `src/main/java/cl/iplacex/Calculadora.java`: contiene las operaciones de suma y resta.
- `src/test/java/cl/iplacex/CalculadoraTest.java`: contiene las pruebas unitarias.
- `.gitignore`: excluye archivos que no deben subirse al repositorio.
- `.github/workflows/ci.yml`: configura la ejecución automática de las pruebas.

## 4. Pruebas unitarias
Se implementaron dos pruebas independientes:
- Prueba de suma: verifica que 5 + 3 sea igual a 8.
- Prueba de resta: verifica que 9 - 4 sea igual a 5.

## 5. Ejecución local
Para ejecutar las pruebas desde la terminal se utiliza:

`mvn clean test`

El comando compila el proyecto y ejecuta las pruebas automatizadas.

## 6. Integración continua
Se configuró GitHub Actions para ejecutar automáticamente las pruebas cuando se realiza un push o pull request en la rama main.

El pipeline realiza las siguientes acciones:
1. Descarga el código del repositorio.
2. Configura Java 17.
3. Ejecuta las pruebas con Maven.
4. Guarda el reporte de resultados como artefacto.

## 7. Resultados
La ejecución local finalizó correctamente con dos pruebas ejecutadas, cero fallas y cero errores.

La ejecución del pipeline en GitHub Actions también finalizó con estado Success.Prueba de ejecución en rama desarrollo
