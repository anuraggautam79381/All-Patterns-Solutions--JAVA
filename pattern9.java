public class pattern9 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
       for(int row=1;row<=n;row++){
        for(int s=1;s<=(n-row);s++){
             System.out.print(" ");
        }
          for(int col=1;col<=row;col++){
             System.out.print("*");
          }
          System.out.println();
       }
    }
}

