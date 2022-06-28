public class Main {
    public static void main(String[] args) {
        Onibus c1 = new Onibus(1, "Volvo", 40, 15);

        System.out.println(c1.getModelo());
        System.out.println(c1.getCodigo());
        System.out.println(c1.getEspacoDisponivel());
        System.out.println(c1.getCargaAtual());
    }
}
