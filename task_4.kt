fun isProperly(sequence: String): Boolean {
    val deep_list = mutableListOf<String>()
    
    sequence.forEach({ ch ->
        when (ch){
            '(' -> deep_list.add("(")
            ')' -> {
                try {
                    deep_list.removeAt(0)
                } catch(e: Exception) {
                    return false
                }
            }
        }
    })
    if (deep_list.isEmpty()){
        return true
    }
    return false
}
