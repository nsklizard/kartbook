package ru.nsk.lizard.db.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.nsk.lizard.db.entities.Customer;

/**
 * Created by dkim on 21.11.2016.
 */
public interface CustomerRepository extends CrudRepository<Customer, String> {
}
