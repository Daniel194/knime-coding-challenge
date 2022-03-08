package org.daniel.lungu.operation;

/**
 * Operation factory interface implemented by all input type operation factory
 *
 * @author Daniel Lungu
 */
public interface OperationFactory {

	Operation create(Operations operation);
}
