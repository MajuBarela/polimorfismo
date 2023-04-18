public class Principal {
    
    public static void main(String [] args) {
        Figura figura1 = new Circulo("vermelho", 5);
        Figura figura2 = new Retangulo("roxo", 3, 4);
        System.out.println("A área do círculo é " + figura1.area() + " e a cor dessa forma é " + figura1.cor + ".");
        System.out.println("A área do retângulo é " + figura2.area() + " e a cor dessa forma é " + figura2.cor + ".");
    }
}
