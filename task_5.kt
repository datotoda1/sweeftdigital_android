fun countVariants(stearsCount: Int): Int {
    return if (stearsCount in 0..1) 1 else countVariants(stearsCount-1) + countVariants(stearsCount-2)
}
