@main def run() = {
    Logger.printMessage("message")
    Logger.printMessage("message")
    Logger.printMessage("message")
    val list = List(1, 2, 3, 4, 5, 5)
    val uniqueList = uniqueList(test)
    val translated = translateToEnglish("Hadet")
}

// Make a simple function translating from one language to another,
// e.g. Norwegian to English. The function should go take a Norwegian
// String as input and return an English String.
def translateToEnglish(s: String) : String = {
    val words = Map("Hei" -> "Hello", "Hadet" -> "Bye", "Skole" -> "School")
    return words(s)
}

// Make a function that takes in a list of items and returns a unique
// list (not set) of the same items.
def uniqueList(l: List[Int]) : List[Int] = {
    return l.toSet.toList
}

// Create a logger-object that always prints out the updated line
// number along with a user-given log message. E.g. (1) This is the log
// from the first line. (2) This is the log from the second, etc.
object Logger {
    var count = 1;

    def printMessage(message: String) : Unit = {
        println("This is the log from the " + numToOrdinal(count) + " line")
        println(message)
        count += 1
    }

    def numToOrdinal(num: Int) : String = {
    num %100 match
        case 1 => (return num.toString() + "st")
        case 2 => (return num.toString() + "nd")
        case 3 => (return num.toString() + "rd")
        case _ => return(num.toString() + "th")
    }
}


