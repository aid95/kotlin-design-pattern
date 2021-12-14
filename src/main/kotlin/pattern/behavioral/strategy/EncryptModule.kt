package pattern.behavioral.strategy

interface EncryptModule {

    fun encrypt(text: String): String
    fun decrypt(encryptedText: String): String
}