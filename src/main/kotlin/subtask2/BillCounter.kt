package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = bill.sum()
        var without_Anna = sum - bill[k]
        var cost_person = without_Anna/2
        return if (cost_person == b) {
            "Bon Appetit"
        }else{
            (b-cost_person).toString()
        }
    }
}
