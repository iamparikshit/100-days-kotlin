package arrayAndDynamicArrays.majorityOfElements

class Solution {
    fun majorityElement(inputArray: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var maxValue = 0
        var result = 0

        for(number in inputArray){
            if(map.containsKey(number)) map[number] = map.getValue(number)+1
            else map[number] = 1
        }

        map.map{
            if(maxValue < it.value){
                maxValue = it.value
                result = it.key
            }
        }
        return result
    }
}

//
//class Solution {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i =0;i<nums.length;i++) {
//            int index=0;
//            if(map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i])+1 );
//            } else {
//                map.put(nums[i], 1);
//            }
//        }
//        int max = 0;
//        for (Integer value : map.values()) {
//            if(max < value) max = value;
//        }
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            int key = iterator.next();
//            if(map.get(key) == max)
//                return key;
//        }
//        return -1;


// int max = nums.length/2;
// for(int i : nums) {
//     int count = 0;
//     for(int j :nums) {
//         if(i==j)
//         count++;
//     }
//     if(count>max)
//         return i;
// }
// return -1;
//    }
//}
