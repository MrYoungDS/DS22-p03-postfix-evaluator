package language;

/**
 * An {@link Operand} is a wrapper around a value.
 * @author jcollard, jddevaug
 * @param <T> the type of the stored data
 */
public class Operand<T> {

    // TONOTDO: please do not edit this class

    private final T value;

    /**
     * Creates an {@link Operand} with the specified value.
     * @param value the value to be wrapped
     */
    public Operand(T value) {
        this.value = value;
    }

    /**
     * Returns the concrete value stored in this {@link Operand}.
     * @return the concrete value stored in this {@link Operand}
     */
    public T getValue() {
        return value;
    }
}
