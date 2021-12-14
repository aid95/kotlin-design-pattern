package pattern.behavioral.strategy

class StrongEncryptModule : EncryptModule {

    override fun encrypt(text: String): String = text.reversed()

    override fun decrypt(encryptedText: String): String = encryptedText.reversed()
}
