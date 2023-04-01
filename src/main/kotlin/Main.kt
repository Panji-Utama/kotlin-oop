class human(var name : String, var age : Int){
    fun intro(){
        println("Hey, I'm $name and I am currently $age years old!")
    }
    fun jump(height : Int){
        println("$name jumped $height meter in the air!")
    }
    fun walk(dis : Int){
        println("$name has walked $dis km today")
    }
    fun count(count : Int){
        println("$name will start counting from 1 to $count")
        var i = 1
        while(i != count+1){
            println(i)
            i++
        }
    }
    fun isOld(age : Int){
        if (age > 50){
            println("$name is old")
        } else {
            println("$name is still young")
        }
    }
    fun penambahan(a : Int, b : Int){
        var hasil = a + b
        println("Setelah menghitung penambahan $a dan $b, $name mendapatkan hasil $hasil")
    }
}

fun main() {
    println("Hello, world!!!")
    var h1Name = "Panji"
    var h1Umur = 21
    var h2Name = "Firman"
    var h2Umur = 60
    var H1 = human(h1Name, h1Umur)
    H1.intro()
    H1.jump(10)
    H1.walk(20)
    H1.count(5)
    H1.isOld(h1Umur)
    H1.penambahan(11,22)

    println("")

    var H2 = human(h2Name, h2Umur)
    H2.intro()
    H2.jump(30)
    H2.walk(10)
    H2.count(10)
    H2.isOld(h2Umur)
    H2.penambahan(3,4)
}


