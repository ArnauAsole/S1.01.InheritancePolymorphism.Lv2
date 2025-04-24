# 📱 S1.01 - Herència i Interfícies: Smartphone en Java

## 📄 Enunciat de l'exercici

### 📞 Exercici: Telèfon intel·ligent amb interfícies

Implementa un sistema de classes i interfícies per representar un telèfon intel·ligent.

#### Classes i interfícies:

- **Classe `Telèfon`**
  - Atributs: `marca`, `model`
  - Mètode: `trucar(String numero)` → mostra: *"S'està trucant al número: [numero]"*

- **Interfície `Camera`**
  - Mètode: `fotografiar()` → mostra: *"S’està fent una foto"*

- **Interfície `Rellotge`**
  - Mètode: `alarma()` → mostra: *"Està sonant l’alarma"*

- **Classe `Smartphone`**
  - Hereta de `Telèfon`
  - Implementa les interfícies `Camera` i `Rellotge`
  - Implementa els mètodes corresponents

#### Al `main()`:
- Crea un objecte de la classe `Smartphone`
- Crida els mètodes:
  - `trucar()`
  - `fotografiar()`
  - `alarma()`

📚 **Objectiu:** Practicar la combinació d’herència i interfícies en Java.

---

## 💻 Tecnologies Utilitzades

- Java 17
- IntelliJ IDEA (Community Edition)
- Maven (opcional)
- Git & GitHub

---

## 📋 Requisits previs

- Java JDK 17
- IntelliJ IDEA Community Edition
- Git Bash o terminal
- Compte a GitHub

---

## 🛠️ Instal·lació i configuració

1. Instal·la:
   - [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   - [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)
   - [Git Bash](https://gitforwindows.org/)
2. Clona el repositori (substitueix per l’URL real si cal):
   ```bash
   git clone https://github.com/elmeuusuari/Smartphone-Java.git
   cd Smartphone-Java
