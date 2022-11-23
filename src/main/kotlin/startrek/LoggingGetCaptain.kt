package startrek

class LoggingGetCaptain(
    private val starTrekRepository: StarTrekRepository
) : StarTrekRepository by starTrekRepository {

    override fun getCaptain(starshipName: String): String {
        println("Getting captain for $starshipName")
        return starTrekRepository.getCaptain(starshipName)
    }
}