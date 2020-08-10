 *********************************************************************************
import kotlin.io.println as println

fun main (){
    println("Mi nombre es: David Mix Fuentes")
    var num1 = 10
    var num2 = 20
    var num3 = 30
    println(num1 + num2 + num3)
    var palabra:String
    var letra:Char
    palabra = "Arataka Reigen"
    letra = 'A'
    var conteo = palabra.length
    println("La variable String tiene $conteo caracteres")
    letra = 'D'
    var flotante:Float
    flotante = 3.14F
    println("Los valores maximos que puede almacenar los valores BYTE es ${Byte.MAX_VALUE}")
    println("Los valores maximos que puede almacenar los valores SHORT es ${Short.MAX_VALUE}")
    println("Los valores maximos que puede almacenar los valores INT es ${Int.MIN_VALUE}")
    println("Los valores maximos que puede almacenar los valores LONG es ${Long.MIN_VALUE}")
    var trulse:Boolean = true;
    println("La variable booleana de la variable TRULSE es: $trulse")
    imprimiendoParametros("Hola", "Que tal?")
    obtieneIVA(100000)
}

fun imprimiendoParametros(word1:String, word2:String){
    var cuenta:Int
    cuenta = word1.length + word2.length
    println("Las palabras suman un total de $cuenta caracteres")
}

fun obtieneIVA(valor:Int){
    println("El IVA del valor $valor es de ${valor*0.19F}")
}