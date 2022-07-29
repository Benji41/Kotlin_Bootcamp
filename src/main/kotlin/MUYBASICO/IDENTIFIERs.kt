package MUYBASICO

fun main(){
    //tienes dos variables
    var a = 10
    //aqui asignamos el valor de una variable tipo var a otra variable "b" de tipo value
    val b = a
    //cambiamos el valor de a
    a= 41
    //apesar de que "a" sea mutable, la variable no almacena la referencia de la variable, si no el valor de ella, por lo tanto
    //si cambia de valor "a", "b" no cambiara su valor
}