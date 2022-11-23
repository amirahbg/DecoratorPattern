package startrek

fun main() {
    val starTrekRepository = DefaultStarTrekRepository()
    val withValidating = ValidatingAdd(starTrekRepository)
    val withLoggingAndValidating =
        LoggingGetCaptain(withValidating)
    withLoggingAndValidating.getCaptain("USS Enterprise")
    withLoggingAndValidating.addCaptain("USS Voyager",
        "Kathryn Janeway")
}
