package p.o.o;

// Clase de ejemplo para mostrar encapsulamiento y modificadores
class CuentaBancaria {
    // 1. PRIVATE: Solo esta clase (CuentaBancaria) puede ver y modificar el saldo.
    // Es el nivel más estricto de protección. ¡Nadie de afuera puede cambiarlo directamente!
    private double saldo;

    // 2. PROTECTED: Clases en el mismo paquete (p.o.o) o clases hijas (herencia) pueden acceder.
    protected String tipoDeCuenta;

    // 3. PUBLIC: Cualquier parte de tu programa puede acceder a esta variable.
    // Generalmente NO es buena idea hacer atributos públicos por seguridad, pero es un ejemplo.
    public String titular;

    // Constructor para iniciar la cuenta
    public CuentaBancaria(String titular, String tipoDeCuenta) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = 0.0; // El saldo inicia en 0
    }

    // --- GETTERS y SETTERS ---
    // Son métodos "public" que actúan como "ventanillas del banco" para acceder al dinero "private"

    // Getter: Nos permite "leer" (obtener) el valor de saldo de forma controlada.
    public double getSaldo() {
        return saldo; // Te digo cuánto tienes, pero no te dejo meter la mano en la caja.
    }

    // Setter (o en este caso un método modificador): Nos permite cambiar el saldo, pero APLICANDO REGLAS.
    public void depositar(double cantidad) {
        // La ventaja del setter es que podemos poner validaciones (lógica):
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de: $" + cantidad);
        } else {
            System.out.println("Error: No puedes depositar cantidades negativas.");
        }
    }
}

public class Modicadores_Acceso {
    public static void main(String[] args){
        // Creamos nuestro objeto
        CuentaBancaria miCuenta = new CuentaBancaria("Oziel", "Ahorro");

        // --- Probando los modificadores ---

        // Acceso PUBLIC: Funciona sin problemas desde cualquier lado.
        System.out.println("Titular: " + miCuenta.titular);

        // Acceso PROTECTED: Funciona aquí porque estamos en la misma carpeta/paquete (p.o.o).
        System.out.println("Tipo: " + miCuenta.tipoDeCuenta);

        // Acceso PRIVATE:
        // ❌ Si intentas hacer la línea de abajo, Java te dará un ERROR porque 'saldo' está protegido.
        // miCuenta.saldo = 1000000; // <- El compilador te dirá que "saldo has private access"

        // --- Usando GETTERS y SETTERS ---
        
        // Para modificar el saldo, DEBEMOS usar la "ventanilla" que nos dejaron (el método público)
        miCuenta.depositar(500); // Esto sí funciona
        miCuenta.depositar(-100); // Aquí nos saltará la validación que pusimos en el setter

        // Para leer el saldo actual, usamos la otra "ventanilla" (el getter)
        System.out.println("Mi saldo actual es: $" + miCuenta.getSaldo());
    }
}
