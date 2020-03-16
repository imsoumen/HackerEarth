//Method: 1

import scala.util.control.Breaks._

object bricksGame extends App {
    
    val N = scala.io.StdIn.readInt
    
    var rem = N
	
	var round = 1

    breakable{
        while ( rem > 0 ){
            rem = rem - round
            if ( rem <= 0 ) {
                println("Patlu")
                break
            }
            rem = rem - (2*round)
            if ( rem <= 0 ) {
                println("Motu")
                rem = 0
                break
            }
        
            round += 1

        }
    }
}

//Method: 2

import scala.util.control.Breaks._

object bricksGame extends App {
    
    val N = scala.io.StdIn.readInt
    
    var rem = N
	var patluPick = 1
	var motuPick = 0
	
    breakable{
        while ( patluPick <= rem ){
            motuPick  = 2*patluPick
            if ( motuPick < rem-patluPick ) {
				rem = rem - (patluPick + motuPick)
                patluPick += 1
            }
            else{
				println("Motu")
				break
			}
        
        }
		println("Patlu")
    }

}



