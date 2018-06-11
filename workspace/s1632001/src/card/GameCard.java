package card;

public class GameCard extends Card{
	private boolean faceup;
	
	public GameCard(){
		super();
		faceup =Math.random()<0.3;
	}
	
	public GameCard(int number, char suit, boolean faceup){
		super(number,suit);
		this.faceup = faceup;
	}
	
	@Override
	public String toString(){
		if(faceup == false)
			return "??";
		else
			return super.toString();
	}
	
	void turn(){
		if (this.faceup == true)
			this.faceup =false;
		else 
			this.faceup = true;
	}
	boolean isFaceup(){
		return faceup;
	}
	
	public static void main(String args[]){
		GameCard c = new GameCard();
		GameCard d = new GameCard(4,'d',true);
		System.out.println(c);
		System.out.println(d);
		int n = c.getNumber();
		
		for (int i=0;i<=3;i++){
			for (int j=1;j<=13;j++){
			GameCard f = new GameCard(j,Suit[i],true);
			System.out.print(f+" ");
			}
		}
			
	}
}
