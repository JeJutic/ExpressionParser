package expression.parser;

public interface CharSource {
    char get(int off);
    boolean eof(int off);
    void next();
    ParsingException error(String message);
    ParsingException error(String message, Throwable cause);
}
