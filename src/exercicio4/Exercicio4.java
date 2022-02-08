package exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        int inteiro1 = 15485448;
        int inteiro2 = 2195498;
        int inteiro3 = 12;
        int inteiro4 = 98716549;
        //nao cabe no inteiro
        //int inteiro5 = 9999998999;
        int inteiro6 = 1654891;

        System.out.println(inteiro1 + " → " + inverteNumeroInteiro(inteiro1));
        System.out.println(inteiro2 + " → " + inverteNumeroInteiro(inteiro2));
        System.out.println(inteiro3 + " → " + inverteNumeroInteiro(inteiro3));
        System.out.println(inteiro4 + " → " + inverteNumeroInteiro(inteiro4));
        //System.out.println(inteiro5+" → "+inverteNumeroInteiro(inteiro5));
        System.out.println(inteiro6 + " → " + inverteNumeroInteiro(inteiro6));
    }

    private static int inverteNumeroInteiro(int numeroAInverter) {
        String numeroAInverterString = String.valueOf(numeroAInverter);
        String numeroInvertido = "";
        char[] arrayChar = numeroAInverterString.toCharArray();

        for (int i = arrayChar.length - 1; i >= 0; i--) {
            numeroInvertido += arrayChar[i];
        }

        return Integer.valueOf(numeroInvertido);
    }
}

