package ru.nsk.lizard.db.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.nsk.lizard.db.entities.Slot;

/**
 * Created by dkim on 21.11.2016.
 */
public interface SlotRepository extends CrudRepository<Slot, Long> {
}
