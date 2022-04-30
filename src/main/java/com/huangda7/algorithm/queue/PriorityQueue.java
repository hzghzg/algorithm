package com.huangda7.algorithm.queue;

public class PriorityQueue {
    public static void main(String[] args) {
        //215. 数组中的第K个最大元素
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 3;
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(nums[i]);
            } else if (priorityQueue.peek()<nums[i]) {
                priorityQueue.remove();
                priorityQueue.offer(nums[i]);
            }
            System.out.println(priorityQueue.toString());
        }
//        return priorityQueue.peek();
    }
}
