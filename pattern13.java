public class pattern13 {
    public static void main(String[] args) {
       pattern(4); 
       pattern1(4);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-row);s++)
            {
                System.out.print(" ");
            }
              for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                  System.out.print("*");
            }
             for(int s=1;s<=2*row-2;s++){
                System.out.print(" ");
             }
             for(int col=1;col<=n-row+1;col++){
                  System.out.print("*");
            }
           System.out.println();  
    }
}
}


/*
 public class prac {
    public static void main(String[] args) {
       pattern(4); 
       pattern1(4);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-row);s++)
            {
                System.out.print(" ");
            }
              for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        static void pattern1(int n){
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-row);s++)
            {
                System.out.print(" ");
            }
              for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
 */
