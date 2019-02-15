
int wordCount = 0
int lineCount = 0
int numRepeatedWords = 0
def userInput =''
def theText = ""
def greeting = "Enter the word \"done\" when complete \nEnter Your Text:"



Map doublesMap = [:]


/*def readln = javax.swing.JOptionPane.&showInputDialog
def theText = readln 'Enter Your Text'*/

    while (userInput != 'done')
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

    if(greeting != "")
    {
        println greeting
        greeting = ""
    }

    userInput = br.readLine()

    if(userInput != 'done')
    {
        theText = theText + "\n " + userInput
        lineCount ++
    }

}



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

println "number of lines ${lineCount}"

println "The total number of words ${wordCount}"

println "The number of repeated words ${numRepeatedWords}"

doublesMap.each{k , v -> println  " \"${k}\" is used ${v} times"}
