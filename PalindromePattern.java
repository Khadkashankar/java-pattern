//           1
//         2 1 2
//       3 2 1 2 3 
//     4 3 2 1 2 3 4
//   5 4 3 2 1 2 3 4 5  
//palindrome patern 
// at first printing the spaces, then print the first half loop which runs to j to i and and next loop return 1 to i
public class PalindromePattern {

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            //print spaces
            for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
           }
            
           //print the first half  of palindrome
           for (int j = i; j >= 1; j--) {
               System.out.print(j);
           }
           
           //print after middle of pattern
           for (int j = 2; j <= i; j++) {
            System.out.print(j);
           }
            System.out.println();

        }


    }
    
}
