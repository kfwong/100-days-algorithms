package Day001_HanoiTower

fun main(args: Array<String>) {
    hanoi(3)
}

fun hanoi(height: Int, source: String = "A", destination: String = "C", spare: String = "B") {
    if(height > 0) {
        // Move n-1 disks from source to spare, using destination as intermediate
        hanoi(height - 1, source, spare, destination)

        // Move the remaining largest disk from source to destination
        println("Move " + source + " to " + destination)

        // Move n-1 disks from spare to destination, using source as intermediate
        hanoi(height - 1, spare, destination, source)
    }
}