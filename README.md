# Implementación de un Sistema de Gestión de Biblioteca con OOP

El sistema de gestión de biblioteca necesita registrar y manejar libros, usuarios y préstamos. Cada libro tiene título, autor, género y disponibilidad. Cada usuario tiene nombre, email y un límite de préstamos. Los préstamos tienen fecha de inicio y fecha de devolución. El sistema debe evitar préstamos de libros no disponibles y asegurar que los usuarios no superen su límite de préstamos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollo de Software con OOP |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de Entidades

**Objetivo:** Definir las clases y atributos necesarios para representar libros, usuarios y préstamos.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica las entidades del dominio y sus atributos.
- Define las relaciones entre las entidades.

**Entregable:** Diagrama de clases con las entidades y sus atributos.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las clases deben representar conceptos del dominio.
- Las relaciones entre clases pueden ser de asociación, agregación o composición.

</details>

### Fase 2: Implementación de Métodos

**Objetivo:** Implementar los métodos necesarios para manejar las operaciones del sistema.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Define los métodos para registrar libros, usuarios y préstamos.
- Implementa la lógica para verificar la disponibilidad de libros y el límite de préstamos de los usuarios.

**Entregable:** Código que implementa los métodos para registrar y manejar libros, usuarios y préstamos.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda usar encapsulamiento para proteger los atributos de las clases.
- Los métodos deben realizar validaciones antes de realizar cualquier operación.

</details>

### Fase 3: Manejo de Excepciones

**Objetivo:** Implementar el manejo de excepciones para asegurar la robustez del sistema.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica posibles excepciones que pueden ocurrir durante las operaciones del sistema.
- Implementa el manejo de excepciones para asegurar que el sistema maneje errores de manera adecuada.

**Entregable:** Código que implementa el manejo de excepciones para las operaciones del sistema.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las excepciones deben ser específicas y manejables.
- Usa bloques try-catch para capturar y manejar excepciones.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué representa cada clase en el sistema de gestión de biblioteca?
- **paraQueSirve**: ¿Cuál es el propósito de los métodos implementados en cada clase?
- **comoSeUsa**: ¿Cómo se relacionan las clases entre sí en el sistema?
- **erroresComunes**: ¿Qué excepciones pueden ocurrir durante las operaciones del sistema y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones tomaste al implementar el manejo de excepciones en el sistema?

## Criterios de Evaluacion

- Definición de clases y atributos relevantes para el dominio.
- Implementación de métodos para registrar y manejar entidades.
- Manejo de excepciones para asegurar la robustez del sistema.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
