fun minSplit(amount: Int): Int {
    
    var money = amount
    var count = 0

    while (money > 0){
        when {
            money >= 50 -> money -= 50
            money >= 20 -> money -= 20
            money >= 10 -> money -= 10
            money >= 5 -> money -= 5
            money >= 1 -> money -= 1
        }
        count += 1
    }
    return count
}
