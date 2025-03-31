import java.io.PrintStream;
import java.util.Scanner;
public class TesteDecompositor {
    public TesteDecompositor() {
    }

    public static void main(String[] args) {
        Decompositor decomp1 = new Decompositor();
        Decompositor[] decomps = new Decompositor[2];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < decomps.length; ++i) {
            System.out.println("Qual o codigo: ");
            String a = scan.nextLine();
            System.out.println("Qual o nome: ");
            String b = scan.nextLine();
            decomps[i] = new Decompositor(a, b);
        }

        System.out.println("Objeto sem vetor: ");
        System.out.println("Codigo: " + decomp1.getCodigo() + "\nNome: " + decomp1.getNome());
        System.out.println("\nObjetos com vetor: ");

        for(Decompositor v : decomps) {
            System.out.println("Codigo: " + v.getCodigo() + "\nNome: " + v.getNome());
        }

    }
}
