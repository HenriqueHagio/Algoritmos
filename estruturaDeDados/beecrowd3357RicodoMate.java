import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class beecrowd3357RicodoMate {
    public static void recurso(int N, double L , double Q, List<String> nomes, String nome){
        double R = L;

        if(R <= Q) {
            System.out.println(Q +  " " + nome);
        }
        else {
            for(int i = 0; i < N && R >= Q; i++){
                R = L - Q;
                L = R;
                nome = nomes.get(i);
         }
         String ultimo = nomes.get(nomes.size()-1);
         nomes.remove(nomes.size() -1 );
         nomes.add(0, ultimo);
         recurso(N, L, Q, nomes, nome);
        }
       

    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
    
        int N = 0;
    
        double L = 0.0;
    
        double Q = 0.0;
        
        String entrada = "";
        
        System.out.println("N");
        N = scanner.nextInt(); 
        System.out.println("L");
        L = scanner.nextDouble();
        System.out.println("Q");
        Q = scanner.nextDouble();
        entrada = scanner.nextLine();
        System.out.print("Digite os nomes separados por espaços: ");
        entrada = scanner.nextLine();
        String[] nomes = entrada.split("\\s+");
        List<String> listaDeNomes = new ArrayList<>();
        for (String nome : nomes) {
            listaDeNomes.add(nome);
        }
        String nome = "";
        recurso(N, L, Q, listaDeNomes, nome);
           
    }
 
}