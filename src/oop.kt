import kotlin.random.Random

fun main(){
    abstract class animal(var na: String,var ag: Int){
        var name = ""
        var age = 0
        init {
            name = na
            age = ag
        }
        abstract fun talk(): String
    }
    class dog(var ani: String, var agee: Int): animal(ani, agee){

        override fun talk():String {
            return "$name: Woof"
        }
    }
    class cat(var ani: String, var agee: Int): animal(ani, agee){

        override fun talk():String {
            return "$name: Meow"
        }
    }


    var cats = arrayListOf<ArrayList<cat>>()
    cats.add(arrayListOf(cat("Lili",Random.nextInt(9))))
    cats.add(arrayListOf(cat("Meep",Random.nextInt(9))))
    cats.add(arrayListOf(cat("Patchy",Random.nextInt(9))))
    cats.add(arrayListOf(cat("Furball",Random.nextInt(9))))
    cats.add(arrayListOf(cat("Snowball",Random.nextInt(9))))

    var dogs = arrayListOf<ArrayList<dog>>()
    dogs.add(arrayListOf(dog("Rufus",Random.nextInt(9))))
    dogs.add(arrayListOf(dog("Fred",Random.nextInt(9))))
    dogs.add(arrayListOf(dog("Spot",Random.nextInt(9))))
    dogs.add(arrayListOf(dog("Rex",Random.nextInt(9))))
    dogs.add(arrayListOf(dog("Rudy",Random.nextInt(9))))

    for(i in 0..4){
        println(cats[i][0].talk())
        for(j in 0..4){
            if (dogs[j][0].age > cats[i][0].age){
                println(dogs[j][0].talk())
            }
        }
    }
}
