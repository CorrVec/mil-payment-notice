package it.pagopa.swclient.mil.paymentnotice.util;

public enum ExceptionType {
    CLIENT_WEB_APPLICATION_EXCEPTION_400,
    CLIENT_WEB_APPLICATION_EXCEPTION_404,
    CLIENT_WEB_APPLICATION_EXCEPTION_500,
    TIMEOUT_EXCEPTION,
    UNPARSABLE_EXCEPTION,
    REDIS_TIMEOUT_EXCEPTION,
    DB_TIMEOUT_EXCEPTION,
    DB_DUPLICATED_KEY
}