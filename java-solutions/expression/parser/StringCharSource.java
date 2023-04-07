package expression.parser;

public class StringCharSource implements CharSource {
    private final String str;
    private int pos;

    public StringCharSource(String str) {
        this.str = str;
        pos = 0;
    }

    @Override
    public char get(int off) {
        return str.charAt(pos + off);
    }

    @Override
    public boolean eof(int off) {
        return pos + off >= str.length();
    }

    @Override
    public void next() {
        pos++;
    }

    @Override
    public ParsingException error(String message) {
        return new ParsingException("String at position " + pos + ": " + message);
    }

    @Override
    public ParsingException error(String message, Throwable cause) {
        return new ParsingException("String at position " + pos + ": " + message, cause);
    }
}
