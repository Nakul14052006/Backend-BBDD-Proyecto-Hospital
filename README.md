# Proyecto Intermodular: Introducción al Back-end (Hospital)

Proyecto en grupo hecho con Spring Boot para crear la parte del servidor de un hospital, donde gestionamos la información y el acceso de los enfermeros.

## Equipo y reparto de tareas
* **Pol Canut**: Creación del proyecto base, estructura general y subida a GitHub.
* **Eduard Caringal**: Issue #2 - Validación de login de un enfermero.
* **Roger Serrats**: Issue #1 - Información de todos los enfermeros registrados.
* **Gurpi Singh**: Issue #3 - Búsqueda de enfermeros por nombre.

---

## Tecnologías utilizadas
* Java
* Spring Boot
* Eclipse IDE
* Postman (para probar el funcionamiento de las peticiones)
* GitHub (para el control de versiones, ramas e issues)

---

## Funciones del programa

Todas las rutas del programa empiezan por `/nurse` y devuelven la información en formato JSON:

1. **Ver todos los enfermeros**
   - Ruta: `GET /nurse/index`
   - Qué hace: Muestra la lista con todos los enfermeros que tenemos guardados de prueba.

2. **Login de enfermeros**
   - Ruta: `POST /nurse/login`
   - Qué hace: Comprueba el usuario y la contraseña enviados en el cuerpo de la petición. Si son correctos responde con `true` (código 200), y si no son correctos responde con `false` (código 403).

3. **Buscar enfermero por nombre**
   - Ruta: `GET /nurse/name/{nombre}`
   - Qué hace: Busca si existe un enfermero con ese nombre o usuario. Si lo encuentra muestra sus datos (código 200) y si no lo encuentra da un error 404.

---

## Cómo ejecutar el proyecto en Eclipse

1. Importar el proyecto en Eclipse como proyecto Maven existente (`File > Import... > Maven > Existing Maven Projects`).
2. Abrir la clase principal `HospitalApplication.java`.
3. Hacer clic derecho y seleccionar `Run As > Spring Boot App`.
4. Usar **Postman** para probar las rutas llamando a `http://localhost:8080`.
