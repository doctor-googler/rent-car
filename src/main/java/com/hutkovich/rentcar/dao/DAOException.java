package com.hutkovich.rentcar.dao;

public class DAOException extends Exception {

    private static final long serialVersionUID = 1L;

    public DAOException(String message, Exception e) {
        super(message, e);
    }

}
