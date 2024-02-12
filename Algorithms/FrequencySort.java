package Algorithms;
import java.util.*;

public class FrequencySort {
    public static int[] sortByFrequency(int[] nums) {
        
        // Create a HashMap to store the frequency of each value
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a PriorityQueue to sort the values based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freqCompare = frequencyMap.get(a) - frequencyMap.get(b);
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return b - a; // Sort in decreasing order if frequencies are the same
            }
        });

        // Add all unique values from the array to the PriorityQueue
        for (int num : nums) {
            if (!pq.contains(num)) {
                pq.offer(num);
            }
        }

        // Build the sorted array based on the PriorityQueue
        int[] sortedArray = new int[nums.length];
        int index = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                sortedArray[index++] = num;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] sortedArray = sortByFrequency(nums);
        System.out.println(Arrays.toString(sortedArray));
    }
}