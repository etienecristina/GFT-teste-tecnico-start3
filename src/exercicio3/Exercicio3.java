package exercicio3;

/**
 * Conforme as strings de teste, criar programa que encontre a primeira letra que não se
 * repete no restante da string, caso não seja encontrado deve retornar o valor “_”.
 * Strings para utilizar no teste:
 * 1: → “aaabccccdeeef”
 * 2: → “strings”
 * 3: → “microsoft visual studio 2022”
 * 4: → “abcedoftz”
 * Exemplo:
 * Input → “aabbcddeffgg”
 * Output → “c”
 **/

public class Exercicio3 {
    public static void main(String[] args) {
        String string1 = "aaabccccdeeef";
        String string2 = "strings";
        String string3 = "microsoft visual studio 2022";
        String string4 = "abcedoftz";

        System.out.println("1->" + primeiraStringQueNaoSeRepete(string1));
        System.out.println("2->" + primeiraStringQueNaoSeRepete(string2));
        System.out.println("3->" + primeiraStringQueNaoSeRepete(string3));
        System.out.println("4->" + primeiraStringQueNaoSeRepete(string4));
        System.out.println("Exemplo->" + primeiraStringQueNaoSeRepete("aabbcddeffgg"));
    }

    private static String primeiraStringQueNaoSeRepete(String string) {
        char[] characters = string.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            String str = String.valueOf(characters[i]);
            boolean stringRepete = false;
            for (int j = 0; j < characters.length; j++) {
                if (i != j) {
                    String strComparar = String.valueOf(characters[j]);
                    if (str.equals(strComparar)) {
                        stringRepete = true;
                        break;
                    }
                }
            }

            if (!stringRepete) {
                return str;
            }
        }
        return "_";
    }
}



