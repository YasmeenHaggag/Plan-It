package com.example.planIt.repository;

import com.example.planIt.model.Place;
import org.springframework.data.mongodb.repository.*;

import java.util.List;

public interface PlaceRepository extends MongoRepository<Place, String> {
//    @Query("SELECT p FROM Place p WHERE (:town IS NULL OR p.town = :town)")
//    List<Place> getByName(@Param("town") String townName);

//    @Query("SELECT p FROM Place p WHERE p.town = :townName")
//    List<Place> getByName(@Param("townName") String townName);
//    @Query("SELECT p FROM places p WHERE (p.town = townName)")
//    List<Place> getByTownName( String townName);

    @Query("{ 'town' : ?0 }")
    List<Place> getByTownName(String townName);


//    @Query("{ $or: [ { 'town' : ?0 }, { ?0 : { $exists: false } } ] }")
//    List<Place> findByTown(String townName);



}
