package PBL04.A;

public class Fases {
    // Atributos
    private static final int _limiteFases = 3;
    private int _numeroFase;

    // Métodos
    public Fases(int numeroFase) {
        this.setNumero(numeroFase);
    }
    public int getNumero() {
        return _numeroFase;
    }
    public void setNumero(int numeroFase) {
        this._numeroFase = numeroFase;
    }
    public static int getLimiteFases() {
        return _limiteFases;
    }
}
