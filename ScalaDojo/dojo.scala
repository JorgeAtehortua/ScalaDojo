import Array._


object dojo{
     def main(args: Array[String]) {
        
        var sumaT= suma(2,3)

//***************************
        //Creacion de un arreglo 
        var Array1= new Array[Int](2)
   		 	Array1(0)=1
    		Array1(1)=2
    		println("Arreglo")
    		for( i <- 0 to (Array1.length-1)) {
    			println(Array1(i))
    		}
    		//println(Array1(0))

    	var Array2= ("Hola","Mundo")
    	var Array3= (1,2,5)

		// Creacion de matrices
		var nombre = "Scala"
		var matriz=ofDim[Int](2,2)
		println("matriz")
		for( i <- 0 to 1) {
			for( j <- 0 to 1) {
				println(matriz(i)(j))
			}
		}
//***************************	
        println("suma: "+ sumaT)
      
    }

    def suma(x:Int,y:Int)=x+y
    val suma2(x:Int,y:Int) => x+y



    var Array1= new Array[Int](2)
    Array1(0)=1
    Array1(1)=2

}
println("El valor es:" + dojo.suma(3,5))