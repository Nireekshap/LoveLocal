import java.util.*;

public class Medium2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		ArrayList<Integer> result = findElement(nums);
		for(int num : result) {
		System.out.print(num + " ");
		}
	}
	public static ArrayList<Integer> findElement(int[] nums){
		if(nums.length == 0) {
			return new ArrayList<>();
		}

		Map<Integer, Integer> counts = new HashMap<>();
		for(int num : nums) {
			if(counts.containsKey(num)) {
				counts.put(num, counts.get(num)+1);
			}
			else {
				counts.put(num, 1);
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
			if(entry.getValue() > nums.length/3) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

}
