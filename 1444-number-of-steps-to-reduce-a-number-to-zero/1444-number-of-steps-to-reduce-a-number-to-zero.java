class Solution {
    public int numberOfSteps(int num) {
        return StepsToZero(num,0);
    }
    private int StepsToZero(int n,int steps) {
		// TODO Auto-generated method stub
		if(n==0) {
			return steps;
		}
		else if(n%2==0) {
			steps++;
			return StepsToZero(n/2, steps);
		}
		else {
			steps++;
			return StepsToZero(--n, steps);
		}
	}
}