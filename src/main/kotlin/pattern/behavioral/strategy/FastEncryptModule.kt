package pattern.behavioral.strategy

class FastEncryptModule : EncryptModule {

    override fun encrypt(text: String): String = text

    override fun decrypt(encryptedText: String): String = encryptedText
}
