package PBL06;

public class Calca extends Roupa{
    private String nome;
    private double preco;
    private String marca;
    public Calca(String cor, String tamanho,String nome, double preco, String marca){
        super(cor,tamanho);
        this.setPreco(preco);
        this.nome = nome;
        this.marca = marca;
    }
    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calcularPrecoFinal(float acrescimo){
        double desconto = this.preco * 0.15;
        this.preco -= desconto;
        this.preco += acrescimo;
        System.out.println("----------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Marca: "+ this.marca);
        System.out.println("Cor: "+ this.getCor());
        System.out.println("tamanho: "+ this.getTamanho());
        System.out.println("Valor final do produto : R$"+ this.getPreco());
    }
}
