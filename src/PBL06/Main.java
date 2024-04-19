package PBL06;

public class Main {
    public static void main(String[] args) {
        Camisa c1 = new Camisa("Azul","M","camisa",10,"nike");
        c1.calcularPrecoFinal(5);
        Vestido v1 = new Vestido("Rosa","P","vestido",10,"prada");
        v1.calcularPrecoFinal(5);
        Calca calca = new Calca("preta com listras brancas","G","calça",10,"adidas");
        calca.calcularPrecoFinal(5);
    }
}
