package startrek

class DefaultStarTrekRepository: StarTrekRepository {
    private val starShipCaptains = mutableMapOf("USS Enterprise" to "Jean-Luc Picard")

    override fun getCaptain(starshipName: String): String {
        return starShipCaptains[starshipName] ?: "Unknown"
    }

    override fun addCaptain(starshipName: String, captainName: String) {
        starShipCaptains[starshipName] = captainName
    }
}