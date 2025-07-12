public class CalculoRetangulo {
    public static void main(String[] args) {
        // Declarando variáveis da base e altura (valores decimais)
        double base = 5.5;
        double altura = 3.2;

        // Calculando a área (base × altura)
        double area = base * altura;

        // Calculando o perímetro (2 × (base + altura))
        double perimetro = 2 * (base + altura);

        // Exibindo os resultados no console
        System.out.println("Base do retângulo: " + base);
        System.out.println("Altura do retângulo: " + altura);
        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
