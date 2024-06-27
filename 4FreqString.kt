fun main() {
    val string="sanskar"
    var i=0
    var j=0
    var temp=0
    var freq=0
    for (i in 0 .. string.length -1 )
    {
        freq=1
        val char=string[i]
        for(j in 0 .. string.length -1)
        {
            if(i!=j)
            {
            if(char==string[j])
                {
                    freq++
                }
            }
        }
        println("Frequency of $char is $freq")
    }
}
