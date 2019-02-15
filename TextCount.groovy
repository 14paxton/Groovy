
int wordCount = 0
int lineCount = 0
int numRepeatedWords = 0


Map doublesMap = [:]


def readln = javax.swing.JOptionPane.&showInputDialog
def theText = readln 'Enter Your Text'


/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
println "Enter Your Text:"
def theText = br.readLine()*/


def splitText = theText.split()

for(item in splitText){
    def x = 0

    for(word in splitText)
    {
        if(item == word)
        {
            x++
        }

        if(x > 1 && !doublesMap.containsKey(item))
        {
            doublesMap[item] = x

        }
    }

}

wordCount = splitText.size()
numRepeatedWords = doublesMap.size()

println "your input ${theText}"

println "The total number of words ${wordCount}"

println "The number of repeated words ${numRepeatedWords}"

doublesMap.each{k , v -> println  " \"${k}\" is used ${v} times"}
