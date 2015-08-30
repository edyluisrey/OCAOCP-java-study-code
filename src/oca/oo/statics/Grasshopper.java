package oca.oo.statics;

public class Grasshopper {
	/**
	 * Initialization of view field with n leaves and grasshopper on leaf 'position'.
	 * 
	 * @param n Number of leaves in row.
	 * @param position
	 */
	private int[] leaves;
	private int cPosition;
	public Grasshopper(int n, int position) {		
	    this.leaves = new int[n];
        for (int i = 0; i < n; i++){
        	leaves[i] = 1;
        }
        this.cPosition = position;
	}

	/**
	 * Grasshopper has eaten the current leaf and hopped left.
	 */
	public void eatAndHopLeft() {
		leaves[cPosition] = 0;
    	cPosition -= 2;
    	while (cPosition >= 0 && leaves[cPosition] == 0)
			cPosition--;
        if (leaves[cPosition] == 1)
        	leaves[cPosition] = 0;
	}

	/**
	 * Grasshopper has eaten the current leaf and hopped right.
	 */
	public void eatAndHopRight() {
		leaves[cPosition] = 0;
    	cPosition += 2;
		while (cPosition < leaves.length && leaves[cPosition] == 0)
			cPosition--;
        if (leaves[cPosition] == 1) 
        	leaves[cPosition] = 0;
	}

	/**
	 * Return the leaf number that grasshopper is feeding on right now.
	 * 
	 * @return Leaf number that grasshopper is feeding on right now.
	 */
	public int whereAmI() {
		return cPosition;
	}

	public static void main(String[] args) {
		Grasshopper g = new Grasshopper(5, 2);
		System.out.println(g.whereAmI());

		g.eatAndHopRight();
		System.out.println(g.whereAmI());

		g.eatAndHopLeft();
		System.out.println(g.whereAmI());
	}
}