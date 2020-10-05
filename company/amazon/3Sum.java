// Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Note: The solution set must not contain duplicate triplets.

// For example, given array S = [-1, 0, 1, 2, -1, -4],

// A solution set is:
// [
//   [-1, 0, 1],
//   [-1, -1, 2]
// ]

class Solution {
public List<List> threeSum(int[] arr) {

    Arrays.sort(arr); 
    Set<List<Integer >>  map = new HashSet<>();
    int k =arr.length-1;
    
    for(int i=0; i<arr.length-2 ; i++){
      int j = i+1;
       k = arr.length-1;
        
    while(j<k){
     int sum = arr[j]+arr[k];
        
         if(sum == -arr[i]){
            map.add(Arrays.asList(arr[i], arr[j], arr[k]));
            j++;
            k--;
        }
        
        else if(sum < -arr[i])
                j++;
        
        else if(sum > -arr[i])
                k--;
        
    }  
}
     return new ArrayList<>(map);
}
}
