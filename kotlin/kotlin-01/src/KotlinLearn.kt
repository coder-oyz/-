import java.util.*
import kotlin.math.max

fun  main(args:Array<String>){
    val a=21;
    val b=20;
    val value= largerNumber(a,b);
    println("the largeNum is "+value);

    val score=getSocre("Tom");
    println("the score is "+score);
    checkNumber(score);
}

//fun largerNumber(num1: Int, num2: Int): Int{
//    return max(num1,num2);
//}
//兩種使用方法一樣
//fun largerNumber(num1: Int, num2: Int): Int = max(num1,num2);
//fun largerNumber(num1: Int, num2: Int) = max(num1,num2);

//if 语句
/*fun largerNumber(num1: Int, num2: Int): Int{
    var value=0;
    if(num1 > num2){
        value = num1;
    }else{
        value = num2;
    }
    return value;
}*/

/*fun largerNumber(num1: Int, num2: Int): Int{
    var value= if (num1 > num2){
        num1;
    }else{
        num2;
    }
    return value;
}*/

/*fun largerNumber(num1: Int, num2: Int): Int{
    return if (num1 > num2){
        num1;
    }else{
        num2;
    }
}*/

fun largerNumber(num1: Int, num2: Int) = if (num1 > num2){
    num1;
}else{
    num2;
}

//when 语句
//1  带参数的
/*fun getSocre(name: String) =when(name){
    "Tom" -> 86;
    "Jim" -> 77;
    "Jack" -> 95;
    "Lily" -> 100;
    else -> 0;
}*/
//2 不带参的
/*fun getSocre(name: String) =when{
    name == "Tom" -> 86;
    name == "Jim" -> 77;
    name == "Jack" -> 95;
    name == "Lily" -> 100;
    else -> 0;
}*/

fun getSocre(name: String) =when{
    name.startsWith("Tom") -> 86;
    name == "Jim" -> 77;
    name == "Jack" -> 95;
    name == "Lily" -> 100;
    else -> 0;
}

fun checkNumber(num : Number){
    when (num) {
        is Int -> println("number is int");
        is Double -> println("number is double");
        else -> println("number is not support");
    }
}

