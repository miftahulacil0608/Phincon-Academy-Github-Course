object ConfigApp {
    private var _configBahasa: String = "Bahasa Indonesia"
    var configEnv = "Development"
        private set
    private var _configTema: String = "Dark"

    fun getConfigApp(state: String) {
        println(
            """
        ---$state---
        Bahasa = $_configBahasa
        Env = $configEnv
        Tema = $_configTema
    """.trimIndent()
        )
    }

    fun editConfigBahasa(inputConfig: String) {
        _configBahasa = inputConfig
    }

    fun editConfigEnv(inputConfig: String) {
        configEnv = inputConfig
    }

    fun editConfigTema(inputConfig: String) {
        _configTema = inputConfig
    }
}