

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topk {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }   

        List<Integer>[] buckets=new List[nums.length+1];

        for(int num:map.keySet()){
            int frequency=map.get(num);
            if(buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(num);

        }

        int[] result =new int[k];
        int resultindex=0;
        for(int i = buckets.length-1;i>=0&&resultindex<k;i--){
            if(buckets[i]!=null){
                for(int num:buckets[i]){
                    result[resultindex]=num;
                    resultindex++;
                    if(resultindex==k){
                        break;
                    }
                }
            }
        }
        return result;
        
    }
    


}
