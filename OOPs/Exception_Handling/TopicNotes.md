# Exception Handling in Java - Notes

##  Overview

Exception Handling in Java is a mechanism that allows a program to handle runtime errors gracefully without terminating unexpectedly. It helps maintain the normal flow of the application by separating error-handling code from regular business logic.

# 1. Exception Hierarchy

Java exceptions are organized in a class hierarchy.

```
                Object
                   │
             Throwable
             /        \
         Error      Exception
                       │
               RuntimeException
```

# Error
- Represents serious system-level problems.
- Generally not handled by applications.
- Example:
  - OutOfMemoryError
  - StackOverflowError

# Exception
Represents conditions that an application can recover from.

Types:
- Checked Exceptions
- Unchecked Exceptions

# Example

```java
try {
    int result = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println(e.getMessage());
}
`
# 2. Checked vs Unchecked Exceptions

### Checked Exceptions
- Checked at compile time.
- Must be handled or declared using `throws`.

```java
try {
    FileReader file = new FileReader("data.txt");
} catch (IOException e) {
    System.out.println(e.getMessage());
}
```

### Unchecked Exceptions
- Occur at runtime.
- Extend `RuntimeException`.

```java
int result = 10 / 0;   // ArithmeticException
```

---

## 3. try-catch

Used to handle exceptions and prevent program termination.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
```

---

## 4. finally

The `finally` block always executes, whether an exception occurs or not.

```java
try {
    System.out.println("Inside try");
} finally {
    System.out.println("Cleanup completed.");
}
```

---

## 5. throw

Used to explicitly throw an exception.

```java
int age = 15;

if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above.");
}
```

---

## 6. throws

Declares that a method may throw an exception.

```java
void readFile() throws IOException {
    FileReader file = new FileReader("data.txt");
}
```

---

## 7. Exception Propagation

Exceptions propagate up the call stack until they are handled.

```java
void method1() {
    method2();
}

void method2() {
    throw new RuntimeException("Error occurred");
}
```

---

## 8. Custom Exceptions

Create custom exceptions by extending the `Exception` class.

```java
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
```

Usage:

```java
throw new InvalidAgeException("Age cannot be negative.");
```

---

# Quick Interview Revision

- `try` → Contains risky code.
- `catch` → Handles exceptions.
- `finally` → Always executes for cleanup.
- `throw` → Explicitly throws an exception.
- `throws` → Declares possible exceptions.
- Checked Exception → Compile-time, must be handled.
- Unchecked Exception → Runtime, optional to handle.
- Custom Exception → User-defined exception class.
- Exception Propagation → Exception moves up the method call stack until handled.