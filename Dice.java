package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		
//		Udkommenterer tidligere l'
		
//		float d1=(float)Math.random();     // 0-1
//		float d2=d1*5;                     // 0-5
//		int d3=Math.round(d2);             // 0-5 integer
//		return d3 + 1;                     // 1-6		

		
//		Opretter her vores nye metode. Den består af et interval, fra 1 - 6, og en random metode inden i. da Math.Random retunerer en double fra ]0 : 1[, lægger vi netop dette resultat multipliceret med 6 til ét. 
//		Dette giver os et præcist, og (rimligt) tilfældigt output 
		
		int randomNum = 1 + (int)(Math.random() * 6); 
		return randomNum;
				
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}

