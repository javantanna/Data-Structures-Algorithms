import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
        public int longestConsecutive(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;
            }

            Set<Integer> numset = new HashSet<>();
            for(int num: nums){
                numset.add(num);
            }
            int longestStreak=0;

            for (int num:numset){
                if(!numset.contains(num-1)){
                    int currentNum=num;
                    int currentStreak=1;

                    while(numset.contains(currentNum+1)){
                        currentNum+=1;
                        currentStreak+=1;
                    }

                    longestStreak=Math.max(currentStreak,longestStreak);
                }
            }
            

            return longestStreak;

        }
}
