package org.wyy;

/**
 * 合并两个有序数组
 *
 * @author wangyuanye
 * @date 2024/8/27
 **/
public class Q1 {
    public static void main(String[] args) {

    }

    // 第一版: 先合并,再排序
    public static void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        // 参数校验
        if(m < 0 || n < 0) throw new RuntimeException("illegal args");
        if(m > 200 || n > 200) throw new RuntimeException("illegal args");
        if(n == 0) return;
        if(m == 0){
            System.arraycopy(nums2, 0, nums1, m, n);
            return;
        }
        // 合并数组
        int count = m + n;
        System.arraycopy(nums2, 0, nums1, m, n);
        // 数组排序
        for(int i = 0; i< count; i++) {
            for(int j=i+1; j < count;j++){
                if(nums1[i] > nums1[j]){
                    int s = nums1[j];
                    nums1[j] = nums1[i];
                    nums1[i] = s;
                }
            }
        }
    }
}
