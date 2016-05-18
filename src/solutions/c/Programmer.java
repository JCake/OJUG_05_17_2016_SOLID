package solutions.c;

/**
 * LSP - Liskov Substitution Principle.
 * Beware of creating type hierarchies where a subtype
 * cannot really be substituted for its parent type.
 */
public interface Programmer {
    void writeCode();
}
