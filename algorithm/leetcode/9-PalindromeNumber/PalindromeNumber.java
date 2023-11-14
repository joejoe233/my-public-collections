/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
        public boolean palindromeNumber(int x) {
                int num = x;
                int reversedNum = 0;
                // Negative numbers cannot be palindromes
                if (x < 0) {
                        return false;
                }
                while (num > 0) {
                        reversedNum = reversedNum * 10 + num % 10;
                        num = num / 10;
                }
                return reversedNum == x;

                // To optimize: you can loop half of the number: when reversedNum>=num, it means that you already loop half of the number.
        }
}
