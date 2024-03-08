public class MinhaClasse {
    public static void main(String [] args){

        String primeiroNome = "Eduardo";
        String segundoNome = "Danelli";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static class BoletimEstudantil{
        public static void main(String[] args){
            int mediaFinal = 7;
            if (mediaFinal < 7){
                System.out.println("Reporvado");
            } else if (mediaFinal == 7){
                System.out.println("Prova Minerva");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}
