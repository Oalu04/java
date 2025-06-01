public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado =  formatarCep("2376506");
            System.out.println(cepFormatado);

        } catch (CepInvalidException x) {
            System.out.println("Cep inválido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
          throw new CepInvalidException();
        
          //simulando um cep formatado
          return "23.75-064";
    } 
}
