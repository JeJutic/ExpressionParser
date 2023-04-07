package expression.parser;

abstract class BaseParser {
    private final CharSource source;
    private char lastTaken;
    public static final char FAIL = 0;

    BaseParser(CharSource source) {
        this.source = source;
        lastTaken = FAIL;
    }

    protected char get() {
        return source.get(0);
    }

    protected boolean test(char expected) {
        return !eof() && get() == expected;
    }

    protected boolean test(String expected) {
        for (int i = 0; i < expected.length(); i++) {
            if (source.eof(i) || source.get(i) != expected.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    protected char testGetNext(String expected) {
        for (int i = 0; i < expected.length(); i++) {
            if (source.eof(i) || source.get(i) != expected.charAt(i)) {
                return FAIL;
            }
        }
        if (source.eof(expected.length())) {
            return FAIL;
        }
        return source.get(expected.length());
    }

    protected boolean test(TokenPredicate tokenPredicate) {
        return !eof() && tokenPredicate.test(get());
    }

    public char getLastTaken() {
        return lastTaken;
    }

    protected char take() {
        char res = get();
        lastTaken = res;
        source.next();
        return res;
    }

    private void take(int cnt) {
        for (int i = 0; i < cnt; i++) {
            take();
        }
    }

    protected boolean take(char expected) {
        if (test(expected)) {
            take();
            return true;
        } else {
            return false;
        }
    }

    protected boolean take(String expected) {   // , boolean wsSurround
        if (test(expected)) {
            take(expected.length());
            return true;
        } else {
            return false;
        }
    }

    protected boolean take(TokenPredicate tokenPredicate) {
        if (test(tokenPredicate)) {
            take();
            return true;
        } else {
            return false;
        }
    }

    private String errorChar(char err) {
        return "'" + err + "'";
    }

    protected void checkEof() throws ParsingException {
        if (!eof()) {
            throw source.error("Expected EOF, found " + errorChar(get()));
        }
    }
    protected boolean eof() {
        return source.eof(0);
    }

    protected void expect(char expected) throws ParsingException {
        if (!take(expected)) {
            if (eof()) {
                throw error("Expected '" + expected + "', EOF found");
            } else {
                throw error("Expected '" + expected + "', found: " + errorChar(take()));
            }
        }
    }

    protected void expect(String expected) throws ParsingException {
        for (char ch: expected.toCharArray()) {
            expect(ch);
        }
    }

    ParsingException error(String message) {
        return source.error(message);
    }

    ParsingException error(String message, Throwable cause) {
        return source.error(message, cause);
    }
}
