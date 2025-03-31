import java.util.Scanner;

public class TesteMatriz {
    public static void main(String[] args){
        int[][] A = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira valores: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("X" + i +" Y" + j);
                A[i][j] = Integer.parseInt(scan.nextLine());
            }
        }
        System.out.println("Matriz: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
