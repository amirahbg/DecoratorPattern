open class StarTrekRepository {
    private val starShipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")

    open fun getCaptain(starshipName: String): String {
        return starShipCaptains[starshipName] ?: "Unknown"
    }

    open fun addCaptain(starshipName: String, captainName:
    String) {
        starShipCaptains[starshipName] = captainName
    }
}