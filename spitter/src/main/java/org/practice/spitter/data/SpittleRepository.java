package org.practice.spitter.data;

import org.practice.spitter.Spittle;

import java.util.List;

public interface SpittleRepository {
    /**
     * Get list of spittle with {@code id <= max} and {@code sizeOfReturnedList <= count}
     *
     * @param max   maxID (def = Long.MAX_VALUE)
     * @param count max amount of spittles returned in list (def = 20)
     * @return unordered list of spittles
     */
    List<Spittle> findSpittles(long max, int count);

    /**
     * Get Spittle with specified id
     *
     * @param id specified id of the Spittle
     * @return Spittle object with given id. If no object found return null.
     */
    Spittle findOne(long id);

    /**
     * Save the Spittle to DB
     *
     * @param spittle given spittle to save
     */
    void save(Spittle spittle);

}
