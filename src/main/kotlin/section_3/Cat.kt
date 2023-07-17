package section_3

class Cat (
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이는 사뿐사뿐")
    }
}
