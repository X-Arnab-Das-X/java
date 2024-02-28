import java.util.*;
public class part2_InvertedRotatedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your row number : ");
        int n = sc.nextInt();

        inverted_rotated_half_pyramid(n);
    }
}
