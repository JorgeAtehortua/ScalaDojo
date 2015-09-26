object funcional{
	def main(args: Array[String]) {
		
		var lista = List(1,2,3)

		lista.map((x:Int) => println(x+4))

		println("suma")
		println(suma(6,8))

		println("suma Funcional")
		println(suma2(10,15))

	}
		
	def suma(x:Int,y:Int)=x+y
   	val suma2=(x:Int,y:Int) => x+y

}