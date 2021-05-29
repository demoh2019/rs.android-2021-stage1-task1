package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var mutable_sad_Array = sadArray.toMutableList()
        var is_happy = true
//        index -1 next remove
        var remove = 0
        while (is_happy){
            is_happy = false
            remove = 0
            for(i in 1..mutable_sad_Array.size - 2){
                if(mutable_sad_Array[i-1-remove] + mutable_sad_Array[i+1-remove]<mutable_sad_Array[i-remove]){
                    is_happy = true
                    mutable_sad_Array.removeAt(i-remove)
                    remove++
                }
            }

        }
        return mutable_sad_Array.toIntArray()
    }
}
