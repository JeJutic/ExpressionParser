package expression.exceptions;

import expression.parser.CharSource;
import expression.parser.ExpressionToComparatorParser;
import expression.plugins.*;

import java.util.List;

public class CheckedExpressionToComparatorParser extends ExpressionToComparatorParser {
    public CheckedExpressionToComparatorParser(CharSource source) {
        super(
                source,
                List.of(
                        new CheckedAddPlugin(), new CheckedSubtractPlugin(),
                        new CheckedMultiplyPlugin(), new CheckedDividePlugin(),
                        new CheckedSetPlugin(), new CheckedClearPlugin()
                ),
                List.of(
                        new CheckedNegatePlugin(), new CountPlugin()
                )
        );
    }
}
