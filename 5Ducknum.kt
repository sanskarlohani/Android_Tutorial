fun main() {
    val num = 143
    var temp=0
    var a=0
    
    temp=num
    while(temp>0)
    {
        if(temp%10==0)
        {
            println("Duck number")
            break
        }
        temp=temp/10
    }
}
