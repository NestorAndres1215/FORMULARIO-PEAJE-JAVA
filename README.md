# Formulario de Peaje - CRUD en Java

Este proyecto contiene una aplicación de peaje con operaciones CRUD sobre las tablas de **Peaje** y **Empleado** en una base de datos. El sistema permite gestionar los peajes y la información de los empleados encargados de la gestión.

## Estructura del Proyecto

El proyecto está dividido en las siguientes partes:

1. **Base de datos**
2. **Clases Java**
3. **Operaciones CRUD**
4. **Formulario de entrada (GUI)**

---

## 1. Base de Datos

### Tablas

#### Tabla: `peaje`

| Columna        | Tipo de dato | Descripción                              |
|----------------|--------------|------------------------------------------|
| `cod`          | VARCHAR(50)  | Código único del peaje                  |
| `dist`         | VARCHAR(255) | Distrito o ubicación del peaje          |

#### Tabla: `empleado`

| Columna        | Tipo de dato | Descripción                              |
|----------------|--------------|------------------------------------------|
| `codpeaje`     | VARCHAR(50)  | Código del peaje asociado al empleado    |
| `codemple`     | VARCHAR(50)  | Código único del empleado                |
| `nomemple`     | VARCHAR(255) | Nombre del empleado                      |
| `cargoemple`   | VARCHAR(255) | Cargo o puesto del empleado              |

---
