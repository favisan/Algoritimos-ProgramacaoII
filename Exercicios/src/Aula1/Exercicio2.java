package Aula1;

/*
 * @author pedro.saraujo
 */
public class Exercicio2 {
   static String diferenca(int a[], int b[]){
       //StringBuilder melhor desempenho na concatenação.
        StringBuilder res = new StringBuilder();
        boolean find;
        for (int i = 0; i < a.length; i++) {
            find = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    find=true;
                    
                }
            }
            if (!find) {
                res.append(a[i]+" ");
            }
       }
       return res.toString();
   }
    public static void main(String[] args) {
        int []a={7,2,5,8,4};
        int []b={4,2,9,5};
        
        System.out.println(diferenca(a,b));
        System.out.println(diferenca(b, a));
    }
}
