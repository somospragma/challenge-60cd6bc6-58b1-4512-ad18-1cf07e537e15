# Prompt para Mejorar el Codigo Base

Copia y pega el siguiente contenido completo en un asistente de IA (Claude, ChatGPT, etc.)
para obtener un ZIP con el proyecto arrancable. Si el adjunto es una carcasa (docs/placeholders),
el asistente debe materializar la estructura del stack del briefing, sin resolver las fases del reto.

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Junior

### Brecha de conocimiento
Aplica los principios básicos de la programación orientada a objetos en el código (también conocida como OOP). Esto incluye los pilares de OOP, bucles, genéricos, anotaciones y más.

### Misión / candidato
Candidato Junior en Backend con Java.

### Reto
- Tema: Desarrollo de Software con OOP
- Seniority: junior-l2
- Tipo: practical
- Título: Implementación de un Sistema de Gestión de Biblioteca con OOP
- Tiempo estimado: 4-6 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Modelado de Entidades — objetivo: Definir las clases y atributos necesarios para representar libros, usuarios y préstamos. — entregable (NO resolver): Diagrama de clases con las entidades y sus atributos.
- Fase 2: Implementación de Métodos — objetivo: Implementar los métodos necesarios para manejar las operaciones del sistema. — entregable (NO resolver): Código que implementa los métodos para registrar y manejar libros, usuarios y préstamos.
- Fase 3: Manejo de Excepciones — objetivo: Implementar el manejo de excepciones para asegurar la robustez del sistema. — entregable (NO resolver): Código que implementa el manejo de excepciones para las operaciones del sistema.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación o descripciones sin código, genera los archivos
correspondientes sin aplicar análisis de compilación
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/com/library/LibraryApplication.java ===
package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }
}

// === ARCHIVO: src/main/java/com/library/model/Book.java ===
package com.library.model;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// === ARCHIVO: src/main/java/com/library/model/User.java ===
package com.library.model;

public class User {
    private String name;
    private String email;
    private int loanLimit;
    private int currentLoans;

    public User(String name, String email, int loanLimit) {
        this.name = name;
        this.email = email;
        this.loanLimit = loanLimit;
        this.currentLoans = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    public int getCurrentLoans() {
        return currentLoans;
    }

    public void setCurrentLoans(int currentLoans) {
        this.currentLoans = currentLoans;
    }
}

// === ARCHIVO: src/main/java/com/library/model/Loan.java ===
package com.library.model;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;

    public Loan(Book book, User user, LocalDate startDate, LocalDate endDate) {
        this.book = book;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

// === ARCHIVO: src/main/java/com/library/service/BookService.java ===
package com.library.service;

import com.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookAvailable(String title) {
        Book book = getBookByTitle(title);
        return book!= null && book.isAvailable();
    }
}

// === ARCHIVO: src/main/java/com/library/service/UserService.java ===
package com.library.service;

import com.library.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserUnderLoanLimit(String email) {
        User user = getUserByEmail(email);
        return user!= null && user.getCurrentLoans() < user.getLoanLimit();
    }
}

// === ARCHIVO: src/main/java/com/library/service/LoanService.java ===
package com.library.service;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    private List<Loan> loans = new ArrayList<>();

    public List<Loan> getAllLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public boolean canUserBorrowBook(User user, Book book) {
        return user.getCurrentLoans() < user.getLoanLimit() && book.isAvailable();
    }
}

// === ARCHIVO: src/main/java/com/library/controller/LibraryController.java ===
package com.library.controller;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;
import com.library.service.BookService;
import com.library.service.LoanService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @Autowired
    private LoanService loanService;

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/loans")
    public ResponseEntity<Loan> borrowBook(@RequestParam String userEmail, @RequestParam String bookTitle) {
        User user = userService.getUserByEmail(userEmail);
        Book book = bookService.getBookByTitle(bookTitle);
        if (user!= null && book!= null && loanService.canUserBorrowBook(user, book)) {
            Loan loan = new Loan(book, user, LocalDate.now(), LocalDate.now().plusWeeks(2));
            loanService.addLoan(loan);
            user.setCurrentLoans(user.getCurrentLoans() + 1);
            book.setAvailable(false);
            return new ResponseEntity<>(loan, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

// === ARCHIVO: src/main/resources/application.properties ===
# Configuración de la aplicación Spring Boot
server.port=8080
```
