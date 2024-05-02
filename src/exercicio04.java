public class exercicio04 {

    public static void main(String[] args) {

        int base = 3;
        int resultado = 1;
       
        System.out.println("Potências de 3:");
        System.out.println(resultado);
       
       
        for (int expoente = 1; expoente <= 15; expoente++) {
            resultado *= base;
            System.out.println(resultado);
        }
        
    }
    
}
