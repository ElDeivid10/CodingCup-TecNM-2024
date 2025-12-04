import java.util.Scanner;
public class Main {

    public static String verificarMovimiento(int n, int[] angulos, int d){
        for(int i = 0; i < n-1; i++){
            if(Math.abs(angulos[i + 1] - angulos[i]) > d){
                return "Inseguro";
            }
        }
        return "Seguro";
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        int[] angulos = new int[n];
        for(int i = 0; i < n; i++){
            angulos[i] = t.nextInt();
        }
        int d = t.nextInt();
        String resultado = verificarMovimiento(n, angulos, d);
        System.out.println(resultado);
        t.close();
    }    
}
