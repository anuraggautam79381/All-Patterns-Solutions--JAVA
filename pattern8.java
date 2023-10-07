public class pattern8 {
    public static void main(String[] args) {
        pattern(4,5);
    }
    static void pattern(int trow,int tcol){
        for(int row=1;row<=trow;row++){
            for(int col=1;col<=tcol;col++){
                if(row == 1 || row == trow || col == 1 || col ==tcol ){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
