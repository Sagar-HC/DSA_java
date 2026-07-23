public class main{
    public static void rhom(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.print("****");
            System.out.println();
        }
    }
    public static void practise(String args[]){
        rhom(005);
    }
}