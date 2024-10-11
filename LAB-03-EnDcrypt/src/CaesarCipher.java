public class CaesarCipher implements Algorithm{
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    // Encrypts the plaintext
    public String encrypt(String plaintext) {
        StringBuilder encrypted = new StringBuilder();
        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                encrypted.append((char) ((character - base + shift) % 26 + base));
            } else {
                encrypted.append(character);
            }
        }
        return encrypted.toString();
    }

    // Decrypts the ciphertext
    public String decrypt(String ciphertext) {
        StringBuilder decrypted = new StringBuilder();
        for (char character : ciphertext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                decrypted.append((char) ((character - base - shift + 26) % 26 + base));
            } else {
                decrypted.append(character);
            }
        }
        return decrypted.toString();
    }
}
