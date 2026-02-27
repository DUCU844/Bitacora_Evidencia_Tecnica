# Semana 4: Análisis de Requerimientos

## Ejercicio en Clase

### Diagrama de Contexto de UBER
> *Diagrama elaborado en clase — adjuntar imagen del diagrama aquí.*

---

### Análisis de Requerimientos — Formulario de Inscripción ECI

---

## Documento de Análisis de Requerimientos – RF-01
**Escuela Colombiana de Ingeniería Julio Garavito – Registro de Aspirante en la Página Web**

---

### Información General

| Campo | Detalle |
|---|---|
| **Funcionalidad** | Gestión de Usuarios – Registro de Aspirante |
| **Código** | RF-01 |
| **Nombre** | Registro de aspirante en la página de la ECI |
| **Tipo** | Funcional |
| **Actor Principal** | Aspirante (persona externa interesada en inscribirse a un programa de la ECI) |

**Descripción:**
El sistema debe permitir que un aspirante (persona interesada en ingresar a la ECI) pueda completar un formulario de registro en la página web de la Escuela Colombiana de Ingeniería, proporcionando sus datos personales, académicos y de contacto, con el fin de iniciar el proceso de inscripción formal. Al finalizar, el sistema debe confirmar el registro y enviar un correo de verificación.

**Cómo se ejecutará:**
El aspirante accede a la página web de la ECI, navega a la sección *"Inscripciones"* o *"Registro"*, completa el formulario en línea con sus datos y lo envía. El sistema valida la información, registra al aspirante en la base de datos y envía un correo de confirmación.

---

### Precondiciones

1. El aspirante debe tener acceso a internet y un navegador web.
2. El aspirante no debe estar registrado previamente con el mismo correo electrónico.
3. El proceso de inscripción debe estar habilitado (vigente en el calendario académico).
4. El servicio de correo electrónico del sistema debe estar operativo.

---

### Datos de Entrada

| Campo | Descripción | Tipo | Reglas / Validación | Obligatorio |
|---|---|---|---|:---:|
| Nombres completos | Primer y segundo nombre del aspirante | Texto | Solo letras y espacios. Mín 3 – Máx 100 caracteres. | ✅ |
| Apellidos completos | Primer y segundo apellido | Texto | Solo letras y espacios. Mín 3 – Máx 100 caracteres. | ✅ |
| Tipo de documento | Tipo de identificación (CC, TI, etc.) | Lista | Selección de opciones predefinidas. | ✅ |
| Número de documento | Número de identificación del aspirante | Numérico | Solo dígitos. Mín 6 – Máx 15 caracteres. No puede existir en BD. | ✅ |
| Correo electrónico | Email personal del aspirante | Email | Formato válido (usuario@dominio.ext). No puede estar registrado previamente. | ✅ |
| Confirmación de correo | Repetir el correo para validación | Email | Debe coincidir con el campo Correo electrónico. | ✅ |
| Contraseña | Contraseña de acceso | Contraseña | Mín 8 caracteres. Al menos 1 mayúscula, 1 número y 1 carácter especial. | ✅ |
| Confirmación contraseña | Repetir la contraseña para validación | Contraseña | Debe coincidir con la contraseña ingresada. | ✅ |
| Número de teléfono | Celular o teléfono de contacto | Numérico | 10 dígitos. Formato colombiano. | ✅ |
| Ciudad de residencia | Ciudad donde reside actualmente | Texto | Solo letras y espacios. | ✅ |
| Programa de interés | Carrera o programa al que desea inscribirse | Lista | Debe seleccionarse de programas vigentes de la ECI. | ✅ |
| Año de grado bachillerato | Año en que terminó el bachillerato | Numérico | Año entre 1970 y el año en curso. | ✅ |
| Aceptación de términos | Acepta Términos y Condiciones y Política de Privacidad | Checkbox | Debe estar marcado para continuar. | ✅ |

---

### Datos de Salida

| Salida | Descripción | Tipo | Reglas |
|---|---|---|---|
| Mensaje de éxito | Confirma el registro exitoso al aspirante | Texto | Se muestra en pantalla inmediatamente. |
| Correo de verificación | Email con enlace de confirmación al aspirante | Email | Enlace válido por 24 horas. |
| ID de registro | Identificador único generado por el sistema | Numérico | Generado automáticamente. Único en BD. |
| Estado de cuenta | Estado inicial de la cuenta del aspirante | Texto | Valor: *"Pendiente de verificación"* hasta confirmar email. |
| Redirección | Redirige al aspirante a pantalla de confirmación | URL | Redirige a `/registro/confirmacion` después del registro exitoso. |

---

### Flujo Básico

| Paso | Actor | Descripción | Excepción |
|:---:|---|---|---|
| 1 | Aspirante | Ingresa a `www.eci.edu.co` y navega a la sección *"Inscripciones"*. | — |
| 2 | Aspirante | Hace clic en el botón *"Regístrate aquí"*. | — |
| 3 | Sistema | Muestra el formulario de registro con todos los campos requeridos. | — |
| 4 | Aspirante | Diligencia todos los campos obligatorios del formulario. | — |
| 5 | Aspirante | Acepta los términos y condiciones marcando la casilla de verificación. | — |
| 6 | Aspirante | Hace clic en el botón *"Registrarse"*. | — |
| 7 | Sistema | Valida que todos los campos obligatorios estén llenos y con formato correcto. | → FA-01 si hay errores de validación. |
| 8 | Sistema | Verifica que el correo electrónico no esté registrado previamente en la BD. | → FA-02 si el correo ya existe. |
| 9 | Sistema | Crea el registro del aspirante en la base de datos con estado *"Pendiente"*. | — |
| 10 | Sistema | Envía correo electrónico de verificación al email registrado. | → FA-03 si el correo no puede enviarse. |
| 11 | Sistema | Muestra pantalla de confirmación indicando que el registro fue exitoso y que debe verificar su correo. | — |

---

### Flujo Alterno (Manejo de Errores)

| Código | Actor | Descripción del Error | Acción del Sistema |
|:---:|---|---|---|
| FA-01 | Sistema | Uno o más campos tienen formato incorrecto o están vacíos. | Resalta en rojo los campos con error y muestra mensaje descriptivo. No envía el formulario. |
| FA-02 | Sistema | El correo electrónico ingresado ya está registrado en la BD. | Muestra mensaje: *"Este correo ya está registrado. ¿Olvidaste tu contraseña?"* con enlace a recuperación. |
| FA-03 | Sistema | Falla en el envío del correo de verificación. | Registra el aspirante con estado *"Pendiente"* y muestra opción para reenviar el correo de verificación. |
| FA-04 | Sistema | El número de documento ya existe en la base de datos. | Muestra mensaje: *"Este número de documento ya está registrado. Comunícate con la ECI."* y no permite continuar. |
| FA-05 | Sistema | El proceso de inscripción no está vigente (fuera del calendario). | Muestra mensaje: *"Las inscripciones están cerradas. Consulta el calendario académico."* y redirige a inicio. |

---

### Diagrama de Casos de Uso

> *Adjuntar imagen del diagrama aquí.*
>
> **Descripción:** Actor `Aspirante` – Caso de Uso `Registrarse`.
> Incluye `<<extend>>` hacia `Verificar correo electrónico` y `<<include>>` hacia `Validar datos del formulario`.

---

### Reglas de Negocio

| No. | Regla |
|:---:|---|
| 1 | El sistema de inscripción **solo estará activo** durante las fechas establecidas por la ECI en su calendario académico. |
| 2 | Cada aspirante solo puede tener **un registro por número de documento**. No se permiten duplicados. |
| 3 | Cada aspirante solo puede registrar **un único correo electrónico**. El correo actúa como identificador único de usuario. |
| 4 | El aspirante debe **verificar su correo dentro de las 24 horas** siguientes al registro; de lo contrario, la cuenta queda inactiva y debe repetir el proceso. |
| 5 | La contraseña debe cumplir la **política de seguridad**: mínimo 8 caracteres, al menos una letra mayúscula, un dígito y un carácter especial. |
| 6 | El programa académico seleccionado debe corresponder a uno de los **programas activos** ofrecidos por la ECI en el periodo vigente. |
| 7 | El aspirante debe **aceptar explícitamente** los Términos y Condiciones y la Política de Privacidad para completar el registro. |

---

### Notas y Comentarios

- Se recomienda implementar **CAPTCHA** para prevenir registros automáticos masivos.
- Considerar integración con el **Sistema de Información Académica (SIA)** de la ECI para evitar duplicados al momento de la matrícula.
- El formulario debe ser **responsivo** y funcionar correctamente en dispositivos móviles.
- Aplicar **Heurística de Nielsen #5** (Prevención de errores): validar campos en tiempo real (*on-blur*) antes del envío.

---

### Abreviaturas y Glosario

| Abreviatura | Significado |
|---|---|
| RF | Requerimiento Funcional |
| ECI | Escuela Colombiana de Ingeniería Julio Garavito |
| BD | Base de Datos |
| CC | Cédula de Ciudadanía |
| TI | Tarjeta de Identidad |
| T&C | Términos y Condiciones |
| SIA | Sistema de Información Académica |
| CAPTCHA | Completely Automated Public Turing test to tell Computers and Humans Apart |
| Aspirante | Persona externa interesada en inscribirse a un programa de la ECI |

---

### Anexos

| Tipo | Descripción |
|---|---|
| Prototipo | Mockup del formulario de registro de aspirante (pantallas: inicio → inscripción → formulario → confirmación). |
| Diagrama CU | Diagrama de Caso de Uso: Actor *"Aspirante"* – CU *"Registrarse"*. Incluye `<<extend>>` → *"Verificar correo electrónico"* y `<<include>>` → *"Validar datos del formulario"*. |
| Diagrama de contexto | Diagrama C4 Nivel 1: Sistema *"Página Web ECI"* interactúa con Aspirante, Sistema de Correo (externo) y Sistema de Información Académica (externo). |

---

### Control de Versiones

| Elaborado por | Aprobado por | Fecha | Descripción |
|---|---|---|---|
| Squad DOSW – Grupo 2 | Docente DOSW | 17/02/2026 | Versión 1.0 – Creación inicial del análisis de requerimientos RF-01. |

---

## Ejercicio en Clase: Manual de Identidad del Estudiante
> *Hecho en Semana3 al final del README por confusión.*

