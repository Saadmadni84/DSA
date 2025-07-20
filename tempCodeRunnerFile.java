int reversed = 0;
        int temp = num;

        while (temp!= 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
        }

        return reversed == num;  // Returns true if the reversed number is equal to the original number, otherwise false.

        
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
        num = 123;  
        System.out.println(isPalindrome(num));
    }
    
}
