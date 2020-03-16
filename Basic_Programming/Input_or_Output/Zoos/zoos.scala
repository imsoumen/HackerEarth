object zoos extends App {

    val inputString = scala.io.StdIn.readLine()
    
    //Converting the String to Array character wise
    val inputStringArr = inputString.toArray
    
    //Filtering and counting the Zs and Os
    val zCnt = inputStringArr.filter(_.toString == "z").length
    val oCnt = inputStringArr.filter(_.toString == "o").length
    
    if ( oCnt == 2*zCnt ) println("Yes") 
    else println("No")

}
