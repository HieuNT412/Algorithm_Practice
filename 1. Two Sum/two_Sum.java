import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class two_Sum {

    // public int[] twoSum(int[] nums, int target) {
    //     int i;

    //     //tạo biến total để lưu vị trí 2 phần tử cần tìm
    //     int[] total = new int[2];
    //     //duyệt mảng để tìm 2 phần tử có tổng bằng target
    //     for (i = 0; i < nums.length - 1; ++i) {
    //         for (int j = i + 1; j < nums.length; ++j) {
    //             int sum = nums[i] + nums[j];
    //             if (sum == target) {
    //                 //lưu vị trí phần tử tại giá trị i và i + 1 vào mảng total
    //                 total[0] = i;
    //                 total[1] = j;
    //             }
    //         }

    //     }
    //     return total;
    // }

    public int[] twoSum(int[] nums, int target) {
        // Sử dụng HashMap để lưu trữ các phần tử đã duyệt 
        // với size là độ dài của mảng nums
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i =0; i< nums.length; i++) {
            // Tính phần còn lại cần tìm
            int remain = target - nums[i];
            // Kiểm tra nếu remain đã tồn tại trong map hay chưa
            if (map.containsKey(remain)){
                // có thì trả về chỉ số của 2 phần tử remain và nums[i]
                // map.get(remain) trả về vị trí của phần tử remain trong mảng
                return new int[] {map.get(remain), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public List<Integer> Get() {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);    
        return list;
    }

    public static void main(String[] args) {
        two_Sum ts = new two_Sum();
        int[] nums = {3, 2, 3};
        int target = 6;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

        System.out.println(ts.Get());

    }
}
