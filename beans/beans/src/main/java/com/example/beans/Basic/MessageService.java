package com.spring.beans.Basic;

import org.springframework.stereotype.Component;

/*
 * A service usually contains application or business logic.
 *
 * This class needs a MessageRepository to do its work. Instead of creating
 * the repository itself, it declares that dependency in its constructor.
 * Spring then supplies the required object. This is dependency injection.
 */
@Component
public class MessageService {

    /*
     * private means only this class can access the field.
     * final means the field must be assigned once and cannot be replaced.
     * Together, this makes the dependency available and stable.
     */
    private final MessageRepository repository;

    /*
     * Constructor injection means Spring passes a MessageRepository bean
     * into this constructor while creating MessageService.
     *
     * Without Spring, we might write:
     *
     *     new MessageService(new MessageRepository());
     *
     * With Spring, Spring performs that wiring for us.
     */
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    /*
     * The service delegates the data lookup to its repository dependency.
     * This keeps responsibilities separate: the repository provides data,
     * while the service coordinates application logic.
     */
    public String getMessage() {
        return repository.findMessage();
    }
}
