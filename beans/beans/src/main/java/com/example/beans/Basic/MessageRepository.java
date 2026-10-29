package com.spring.beans.Basic;

import org.springframework.stereotype.Component;

/*
 * A repository usually represents the class responsible for reading or
 * storing data, often using a database. This learning example returns a
 * fixed String instead of querying a real database.
 *
 * @Component makes MessageRepository available as a Spring bean so that
 * another bean, such as MessageService, can receive it as a dependency.
 */
@Component
public class MessageRepository {

    /*
     * This method represents a data lookup. In a real application it might
     * return data fetched from a database, file, or web service.
     */
    public String findMessage() {
        return "Message loaded by the repository";
    }
}