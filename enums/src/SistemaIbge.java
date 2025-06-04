public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.MARANHAO;
        System.out.println(eb.getNome());
        System.err.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
