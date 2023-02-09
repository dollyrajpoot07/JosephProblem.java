// Given the total number of persons N and a number k which indicates that k-1 
// persons are skipped and the kth person is killed in a circle. The task is to 
// choose the person in the initial circle that survives.

// Input: N = 5 and k = 2
// Output: 3
// Explanation: Firstly, the person at position 2 is killed, 
// then the person at position 4 is killed, then the person at position 1 is killed. 
// Finally, the person at position 5 is killed. So the person at position 3 survives. 

import java.io.*;

class JosephusProblem {

	static int josephus(int n, int k) {
		if (n == 1)
			return 1;
		else
			return (josephus(n - 1, k) + k - 1) % n + 1;
	}

	public static void main(String[] args) {
		int n = 14;
		int k = 2;
		System.out.println("The chosen place is " + josephus(n, k));
	}
}
