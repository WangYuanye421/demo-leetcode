package org.wyy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 返回 k。
 *
 * @author wangyuanye
 * @date 2024/8/27
 **/
public class Q2 {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};

        int i = removeElementV2(a, 2);
        System.out.println("i :" + i);
        System.out.println(Arrays.toString(a));
    }

    public static int removeElementV1(int[] nums, int val) {
        List<Integer> result = new ArrayList<>(nums.length);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                result.add(nums[i]);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        return result.size();
    }

    public static int removeElementV2(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if(num != val){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }

}
