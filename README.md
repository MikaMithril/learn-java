# Learn Java

java intro code resource based on w3 schools tutorial

## W3 Schools Link

https://www.w3schools.com/java/default.asp

## Install Java

### 1. Check if installed:

Run:
```commandline
java -version
```

If installed you should see something similar too: 
```java version "22.0.0" 2024-08-21 LTS
Java(TM) SE Runtime Environment 22.9 (build 22.0.0+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 22.9 (build 22.0.0+13-LTS, mixed mode)
```

### 2. If not installed:

Navigate to [oracle.com](https://www.oracle.com/java/technologies/downloads/#jdk22-windows)
 and install java

# Quickstart

Create a class file `Main.java`:

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

To compile run the following in the command line: 

```commandline
javac Main.java
```

If compilation is successful run the following to run the file:

```commandline
java Main
```