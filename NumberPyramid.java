//pattern is 
//    1           
//   2 2         
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {

            //print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //print row numbers, row number times 
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        
    }
    
}
