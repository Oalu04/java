public class SistemaCadastro {
    public static void main (String[] args) {
        Pessoa marcos = new Pessoa("123", "Marcos Silva");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
