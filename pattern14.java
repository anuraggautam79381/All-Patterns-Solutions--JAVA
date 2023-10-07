public class pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
          for(int row=1;row<=n;row++){
       for(int s=1;s<=n-row;s++){
            System.out.print(" ");
    }
     for(int col=1;col<=n;col++){
        System.out.print("*");
    }
    System.out.println();
}
}
}
