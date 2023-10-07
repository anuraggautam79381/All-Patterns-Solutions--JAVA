public class pattern6 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int s=1;s<=n-row;s++){
            System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
            System.out.print("*");
            }
             System.out.println();
    }
}
}