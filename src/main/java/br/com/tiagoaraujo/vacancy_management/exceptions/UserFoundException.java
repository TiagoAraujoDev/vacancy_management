package br.com.tiagoaraujo.vacancy_management.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("User Already exists!");
    }
}
