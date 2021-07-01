//10727131 10727124
class Dice {
  int six1;
  int six2;
  int eight;
  int win;
  
  public Dice() {                               // constructor
    six1 = 0;
	six2 = 0;
	eight = 0;
	win = 0;
  }
  
  public void SetSix( int dice1 , int dice2 ) {                        // set six dice
    six1 = dice1;
    six2 = dice2;
  }
	
  public void SetEight() {                     // set eight dice
	eight = ( int ) ( Math.random() * 8 + 1 );
  }
  
  public void AddWin() {                       // add win
    win = win + 1;
  }
  
  public  int ReturnWin() {                   // return value of win
    return win;
  }
  
  public  int ReturnSix() {	                  // return value of six dice's total
    return (six1 + six2);
  }
  
  public  int ReturnEight() {                 // return value of eight dice
	return eight;
  }
}

class Gamers {
	Dice Mary;
	Dice Tom;
	int draw;
	
	public Gamers() {                //constructor
		Mary = new Dice();
		Tom = new Dice();
		draw = 0;
	}
	
	public  void Compare( int dice1 , int dice2 , int dice3 , int dice4 ) {	
		Mary.SetSix( dice1 , dice2 );
		Tom.SetSix( dice3 , dice4 );
		  
		Mary.SetEight();
		Tom.SetEight();	
		
		if ( Mary.ReturnSix() > Tom.ReturnSix() ) {  		 		    // Mary win	
			Mary.AddWin();
		}
		else if ( Mary.ReturnSix() < Tom.ReturnSix() ) {    		    // Tom win	
			Tom.AddWin();
		}
		else {			
			if ( Mary.ReturnEight() > Tom.ReturnEight() ) { 		    // Mary win
				Mary.AddWin();
			}
			else if (  Mary.ReturnEight() < Tom.ReturnEight() ) {       // Tom win
				Tom.AddWin();

			}
			else {                                          		    // draw
				draw = draw + 1;
			}
		}
			
	}
	
	public void PrintResult() {                                         // print result of game
		System.out.print( "Tom win:" );
		System.out.println( Tom.ReturnWin() );
		System.out.print( "Mary win:" );
		System.out.println( Mary.ReturnWin() );
		System.out.print( "draw:" );
		System.out.println( draw );
		
	}
	
	
}

public class Test2 {                            // six dice : Tom win
	
  public static void main ( String[]  args ) {
	  Gamers game = new Gamers();
	  int dice1 = 1;
	  int dice2 = 1;
	  int dice3 = 6;
	  int dice4 = 6;
	  game.Compare( dice1 , dice2 , dice3 , dice4 );
	  game.PrintResult();

	  
	  
  }
}