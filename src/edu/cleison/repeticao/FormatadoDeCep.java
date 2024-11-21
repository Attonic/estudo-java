package edu.cleison.repeticao;

public class FormatadoDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("O cep não corresponde");
        }


    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8){
            throw new CepInvalidoException();

        }

        return "00.000-000";
    }
}
