public class pattern7 {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
}
