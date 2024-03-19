package PBL05;

public class Switch {
    public static String tipoUsuario(String opcao) {
        switch (opcao) {
            case "a":
                return "Cliente";
            case "b":
                return "Funcionário";
            case "c":
                return "Gerente";
            default:
                return null; //
        }
    }
}
