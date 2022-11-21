import kotlin.math.abs                                           

fun main() {
	val msg = "2022-11-21"
	println("Kotlin, $msg") // sout or soutv
	
	println(abs(-123)) // 123                
	
	println(Buyer().name) // NoName                              
	println(Buyer().price) // 0                                  
	println(Buyer().toString()) // Buyer(name='NoName', price=0) 
	println(Buyer()) // Buyer(name='NoName', price=0)            
}

class Buyer(val name: String = "NoName", val price: Int = 0) {   
                                                                 
	override fun toString(): String {                            
		return "Buyer(name='$name', price=$price)"               
	}                                                            
}                                                                
