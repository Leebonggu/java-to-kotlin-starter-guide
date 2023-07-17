package section_3

import section_3.interfaces.Flyable
import section_3.interfaces.Swimmable

class Penguine(species: String) : Animal(species, 2), Swimmable, Flyable {
    private val wingCount = 2

    override fun move() {
        println("펭귄은 괙꽥")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount;

    override fun act() {
        super<Flyable>.act()
        super<Swimmable>.act()
    }

    override val swimmability: Int
        get() = 3
}