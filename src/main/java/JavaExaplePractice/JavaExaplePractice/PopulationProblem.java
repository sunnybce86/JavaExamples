package JavaExaplePractice.JavaExaplePractice;
/*In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases
 *  by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years 
 *  does the town need to see its population greater or equal to p = 1200 inhabitants?
 * 
 */

// p => 1200

public class PopulationProblem {

	static int total;
	public static int nbYear(int p0, double percent, int aug, int p) {
		
		total=p0+(p0*2/100)+50;
		
		return total;    
    }
	
	public static void main(String[] args) {
		
		int p0=1000;
		double percent=2;
		int aug = 0;
		int p=1300;
		
		int res=nbYear(p0,percent,aug,p);
		System.out.println(res);
	}
}
