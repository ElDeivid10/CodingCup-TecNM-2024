import java.util.Scanner;

class CajaDeCereal {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        Resolver(n);
        t.close();
    }
    public static void Resolver(int n){
        float r = ((((n * 567) / 9) + 7492) * 235) / 47;
        float resultado = r - 498;
        if(resultado %2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
