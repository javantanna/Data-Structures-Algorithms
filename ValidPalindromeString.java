public class ValidPalindromeString {
        public boolean isPalindrome(String s) {
        
            if(s==null || s.isEmpty()){
                return true;
            }

            int left=0;
            int right=s.length()-1;

            while(left<right){
                char leftCharacter=s.charAt(left);
                char rightCharacter=s.charAt(right);

                if(!Character.isLetterOrDigit(leftCharacter)){
                    left++;
                    continue;
                }

                if(!Character.isLetterOrDigit(rightCharacter)){
                    right--;
                    continue;
                }


                if(Character.toLowerCase(rightCharacter)!=Character.toLowerCase(leftCharacter)){
                    return false;
                }

                left++;
                right--;

            }


            return true;
        }
}
