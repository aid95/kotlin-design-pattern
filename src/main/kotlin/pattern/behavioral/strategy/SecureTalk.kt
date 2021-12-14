package pattern.behavioral.strategy

class SecureTalk(private val encryptModule: EncryptModule) {

    fun sendMessage(text: String): String = encryptModule.encrypt(text)

    fun decryptMessage(encryptedText: String) = encryptModule.decrypt(encryptedText)
}
