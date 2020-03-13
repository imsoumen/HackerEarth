object SeatingArrangement extends App{

    def getSeatType(seatNo: Int): String = {

        if ( seatNo % 6 == 0 || seatNo % 6 == 1 ) "WS"
        else if ( seatNo % 6 == 2 || seatNo % 6 == 5 ) "MS"
        else "AS"       

    }

    def getFacingSeatNo(seatNo: Int): Int = {
        //Method 1
        //seatNo + 2 * (6 - (seatNo - 1) % 12) - 1

        //Method 2
        val rem = seatNo % 12

        rem match {
            case 0 => seatNo - 11
            case 1 => seatNo + 11
            case 2 => seatNo + 9
            case 3 => seatNo + 7
            case 4 => seatNo + 5
            case 5 => seatNo + 3
            case 6 => seatNo + 1
            case 7 => seatNo - 1
            case 8 => seatNo - 3
            case 9 => seatNo - 5
            case 10 => seatNo - 7
            case 11 => seatNo - 9
        }

    }

    val T = scala.io.StdIn.readInt

    for (i <- 1 to T) {
        //Taking the input seat number
        val inputSeatNo = scala.io.StdIn.readInt

        //Fetching the facing seat number
        val facingSeatNumber = getFacingSeatNo(inputSeatNo)

        //Fetching the facing seat type
        val facingSeatType = getSeatType(facingSeatNumber)

        println(facingSeatNumber + " " + facingSeatType)
    }

}
