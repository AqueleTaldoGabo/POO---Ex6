public class TesteSoma {
    public static void main(String[] args){
        int soma1= soma(2, 3, 7, 8);
        int soma2= soma(6,190, 102, 12);
        System.out.println("A soma1 é: " + soma1);
        System.out.println("A soma2 é: " + soma2);
    }
    public static int soma(int ... nums){
        int soma=0;
        for(int x: nums)
            soma+=x;
        return soma;
    }
}
