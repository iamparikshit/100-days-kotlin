package arrayAndDynamicArrays.noOfFlowers

import java.util.*

class FullBloomFlowers {
    fun fullBloomFlowers1(flowers: Array<IntArray>, people: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        val result = IntArray(people.size) { 0 }
        var sequence = 0
        flowers.map {
            for (index in it.first()..it.last()) {
                map[index] = map.getOrDefault(index, 0) + 1
            }
        }

        people.map {
            result[sequence] = map.getOrDefault(it, 0)
            sequence++
        }

        return result
    }


    fun fullBloomFlowers(flowers: Array<IntArray>, people: IntArray): IntArray {
        val result = IntArray(people.size) { 0 }
        var sequence = 0
        var count: Int
        people.map { single ->
            count = 0
            flowers.map {
                if (it.first() <= single && it.last() >= single) count++
            }
            result[sequence++] = count
        }

        return result
    }

    fun fullBloomFlowers2(flowers: Array<IntArray>, people: IntArray): IntArray {
        val sortedPeople = people.copyOf(people.size)
        sortedPeople.sort()

        flowers.sortWith(compareBy({ it[0] }, { it[1] }))
        val dic = HashMap<Int, Int>()
        val heap = PriorityQueue<Int>()

        var index = 0
        for (person in sortedPeople) {
            while (index < flowers.size && flowers[index][0] <= person) {
                heap.add(flowers[index][1])
                index++
            }

            while (heap.isNotEmpty() && heap.peek() < person) heap.remove()

            dic[person] = heap.size
        }

        val ans = IntArray(people.size)
        for (personIndex in people.indices) {
            ans[personIndex] = dic[people[personIndex]]!!
        }
        return ans
    }

}