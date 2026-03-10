[CHALLENGE_CONVERSOR.md](https://github.com/user-attachments/files/25685582/CHALLENGE_CONVERSOR.md)
# CHALLENGE_CONVERSOR

[![Made by DigitalPro](https://img.shields.io/badge/Made%20by-DigitalPro-blue)](https://digitalpro.dev)
![Version](https://img.shields.io/badge/Version-1.0.2-blue)
![Tecnología](https://img.shields.io/badge/Tecnología-Java-red)
![Build Tool](https://img.shields.io/badge/Build_Tool-Maven-orange)
![Librería](https://img.shields.io/badge/Librería-Gson-green)

## Descripción del Sistema

Este proyecto, **CHALLENGE_CONVERSOR**, es una aplicación de escritorio desarrollada en Java que funciona como un conversor de unidades o monedas. Utiliza la librería `Gson` para el manejo de datos JSON, lo que sugiere que interactúa con una API externa para obtener las tasas de conversión o datos necesarios. La arquitectura del proyecto está organizada siguiendo un patrón de diseño que incluye controladores (`ConversorController`), servicios (`CallApi`) para la lógica de negocio y la comunicación con la API, y una interfaz de usuario (`ConversorUI`) para la interacción con el usuario.

## Características Principales

*   **Conversión de Unidades/Monedas:** Permite realizar conversiones entre diferentes unidades o monedas.
*   **Integración con API Externa:** Capacidad de consumir datos de una API para obtener información actualizada.
*   **Interfaz de Usuario Intuitiva:** Proporciona una interfaz gráfica para facilitar su uso.
*   **Manejo de JSON:** Utiliza `Gson` para serializar y deserializar objetos Java a/desde JSON.

## Tecnologías Utilizadas

*   **Java**: Lenguaje de programación principal.
*   **Maven**: Herramienta de gestión de proyectos y construcción.
*   **Gson**: Librería Java para trabajar con JSON.

## Cómo Ejecutar el Sistema

Para ejecutar este proyecto, sigue los siguientes pasos:

1.  **Clonar el Repositorio:**
    ```bash
    git clone https://github.com/yumanyer/CHALLENGE_CONVERSOR.git
    cd CHALLENGE_CONVERSOR/demo
    ```

2.  **Compilar el Proyecto con Maven:**
    Asegúrate de tener Maven instalado en tu sistema. Luego, navega al directorio `demo` y compila el proyecto:
    ```bash
    mvn clean install
    ```

3.  **Ejecutar la Aplicación:**
    Una vez compilado, puedes ejecutar la aplicación desde la línea de comandos. El punto de entrada principal se encuentra en `com.ejemplo.Principal` o `com.ejemplo.Main`.
    ```bash
    java -cp target/classes:../lib/gson-2.10.1.jar com.ejemplo.Principal
    ```
    *(Nota: Ajusta la ruta a `gson-2.10.1.jar` si es diferente en tu entorno.)*

    Alternativamente, puedes abrir el proyecto en un IDE como IntelliJ IDEA o Eclipse, y ejecutar la clase `Principal.java` o `Main.java` directamente.
