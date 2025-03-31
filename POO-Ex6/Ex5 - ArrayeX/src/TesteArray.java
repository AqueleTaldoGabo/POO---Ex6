import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args){
            int[] nums = {12, 11, 9, 5, 2, 1};

            Scanner scan = new Scanner(System.in);
            diferenca(nums);
            System.out.println("Insira um numero: ");
            entreX(nums,Integer.parseInt(scan.nextLine()));
    }
    public static void diferenca(int[] nums){
        int[] par = new int[2];
        int maior=0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] - nums[i] > maior){
                maior = nums[i-1] - nums[i];
                par[0] = nums[i-1];
                par[1] = nums[i];
            }
        }
        System.out.println("A maior diferença é: " + maior + "\nOs pares sao: " + par[0] + " " + par[1]);
    }
    public static void entreX(int[] nums, int x){
        int esquerda=0, direita=0;
        for(int v: nums){
            if(v>x)
                esquerda++;
            if(v<x)
                direita++;
        }
        System.out.println("Sao maiores: " + esquerda + "\nSao menores: " + direita);
    }
}
