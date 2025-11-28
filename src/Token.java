public class Token {
    public final TokenType type;
    public final String lexeme;
    public final int ligne;
    public final int colonne;

    public Token(TokenType type, String lexeme, int ligne, int colonne) {
        this.type = type;
        this.lexeme = lexeme;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public String toString() {
        return String.format("%-15s | %-15s | [L:%d, C:%d]", type, lexeme, ligne, colonne);
    }
}
