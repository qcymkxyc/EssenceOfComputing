package chapter2

/**
 *
 */
fun func(currentNum:Int, desNum:Int):Boolean{
    val tempNum1 = currentNum + 1;
    val tempNum2 = currentNum + 2;

    var flag1 = false;
    var flag2 = false;
    if(tempNum1 + 1 == desNum || tempNum1 + 2 == desNum)
        flag1 = true;
    if(tempNum2 + 1 == desNum || tempNum2 + 2 == desNum)
        flag2 = true

    return flag1 && flag2;
}

fun main() {
    var last = 20;
    for(i in 20 downTo 1){
        if(func(i,last)){
            last = i;
            println(last);
        }
    }
}