import java.util.Scanner;

public class TesteMedia {
    public static void main(String[] args){
        double array[] = new double[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<array.length; i++) {
            System.out.println("Insira o valor de Nº" + (i+1) + ": ");
            array[i] = Double.parseDouble(scan.nextLine());
        }
        System.out.println("A media é: " + media(array));

    }
    public static double media(double[] val){
        double total=0;
        for(int i = 0; i<val.length; i++)
            total += val[i];
        return total/val.length;
    }
}
