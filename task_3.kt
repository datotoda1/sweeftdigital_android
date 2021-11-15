fun notContains(array: Array<Int>): Int {
    for (i in 1..array.size){
        if (!(i in array)){
            return i
        }
    }
    return array.size + 1
}
