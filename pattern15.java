public class pattern15 {
    public static void main(String[] args) {
        pattern(4);
        pattern1(4);
    }
    static void pattern(int n){
      for(int row=1;row<=n;row++){
        for(int s=1;s<=n-row;s++){
            System.out.print(" ");
    }
     for(int col=1;col<=2*(row-1)+1;col++){
        System.out.print("*");
    }
    System.out.println();
      }
    }
    static void pattern1(int n){
         for(int row=n;row>=n;row--){
             for(int s=1;s<=n-row;s++){
            System.out.print(" ");
    }
     for(int col=1;col<=2*(row-1)+1;col++){
        System.out.print("*");
    }
    System.out.println();
      }
    }
}

