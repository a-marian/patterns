package ar.com.patterns.behavioral.visitor;
/**Visitor opattern
 * Allows you to add operation to a composite structure without  changing the structure itself.
 * Adding new operations is relatively easy.
 * The code for operations performed by the Visitor is centralized
 * */
public interface Visitor {

    void doForDirector(Director director);
    void doForManager(Manager manager);
    void doForAnalyst(Analyst analyst);
}
