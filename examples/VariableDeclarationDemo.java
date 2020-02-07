package fr.uvsq.info.poo.intro;

public class VariableDeclarationDemo {
    public static void main(String[] args) {
        // tag::var-decl[]
        // Exemples de déclaration avec initialisation
        // (pas indispensable mais conseillé)

        byte aByte = 12;            // Un entier sur 8 bits
        short aShort = 130;         // Un entier sur 16 bits
        int anInteger = -153456;    // Un entier sur 32 bits

        // Remarquer le L pour le litteral de type long
        // (sinon erreur a la compilation: entier trop grand)
        long aLong = 987654321234L; // Un entier sur 64 bits

        // Remarquer le F pour le litteral de type float
        // (sinon erreur a la compilation: perte de precision)
        float aFloat = 1.3F;        // Un reel simple precision
        double aDouble = -1.5E-4;   // Un reel double precision

        char aChar = 'S';           // Un caractere
        boolean aBoolean = true;    // Un booleen

        // La constante est introduite par le mot-cle final
        final int aConst = 0;       // Une constante
        // end::var-decl[]
    }
}
