public class exercicio05 {

    private static final String ATUAL = null;

    public static void main(String[] args) {
        
        int anterior = 0;
        int atual = 1;
        int proximo;
 
        System.out.println("Sequência de Fibonacci até o décimo quinto termo:");
        System.out.print(anterior + ", " + atual);
 
        
        for (int i = 2; i < 15; i++) {
            proximo = anterior + atual;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}