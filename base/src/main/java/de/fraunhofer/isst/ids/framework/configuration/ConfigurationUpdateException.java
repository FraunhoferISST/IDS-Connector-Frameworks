package de.fraunhofer.isst.ids.framework.configuration;

/**
 * Exception that is thrown, when an error occurs while trying to change the configuration
 * using {@link ConfigurationContainer}.
 */
public class ConfigurationUpdateException extends Exception {
    static final long serialVersionUID = 42L;

    /**
     * Create a ConfigurationUpdateException with a given Message and Cause.
     *
     * @param message error message of the exception
     * @param cause cause for the exception
     */
    public ConfigurationUpdateException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
