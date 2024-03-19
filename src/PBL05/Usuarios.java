package PBL05;

public class Usuarios {
    // Atributos
    private String _nomeUsuario;
    private int _numeroUsuario;

    // Método Construtor
    public Usuarios(String nomeUsuario, int numeroUsuario) {
        this._nomeUsuario = nomeUsuario;
        this._numeroUsuario = numeroUsuario;
    }
    // Setter e getter
    public String getNomeUsuario() {
        return _nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this._nomeUsuario = nomeUsuario;
    }
    public int getNumeroUsuario() {
        return _numeroUsuario;
    }
    public void setNumeroUsuario(int numeroUsuario) {
        this._numeroUsuario = numeroUsuario;
    }
}