public class prac {
    public static void main(String[] args) {
        pattern5(5);
        pattern6(4);
    }
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
          System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=(n-row)+1;col++){
                System.out.print("* ");
            }
             System.out.println();
        }
    }
}
