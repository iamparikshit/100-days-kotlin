package dataStructure.designHashMap

class MyHashMap {
    val array = Array<Int>(1000_001){-1}

    fun put(key: Int, value: Int) {
        array[key] = value
    }

    fun get(key: Int): Int {
        return array[key]
    }

    fun remove(key: Int) {
        array[key] =-1
    }

}