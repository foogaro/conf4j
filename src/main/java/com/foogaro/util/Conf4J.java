package com.foogaro.util;

import java.util.Optional;

/**
 * This call provides two methods to get configuration settings from your environment or system properties.
 */
public final class Conf4J {

    private Conf4J() {
    }

    /**
     *
     * @param parameterName is the name of configuration setting to look for as system property or environment variable.
     * @return returns the value of the configuration setting as a string. It throws a IllegalStateException if it's null.
     */
    public final static String get(String parameterName) {
        Optional<String> value = Optional.ofNullable(System.getenv(parameterName));
        if (!value.isPresent()) value = Optional.ofNullable(System.getProperty(parameterName));
        return value.orElseThrow(() -> new IllegalStateException("Configuration for '" + parameterName + "' was not found."));
    }

    /**
     *
     * @param parameterName is the name of configuration setting to look for as system property or environment variable.
     * @param defaultValue in case the configuration setting is not found (thus null), it will return the default value.
     * @return returns the value of the configuration setting as a string or it's default value.
     */
    public final static String get(String parameterName, String defaultValue) {
        Optional<String> value = Optional.ofNullable(System.getenv(parameterName));
        return value.orElse(System.getProperty(parameterName, defaultValue));
    }

}
