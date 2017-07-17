package com.softserve.services;

import com.softserve.entity.Artpieces;
import dto.Task03DTO;

import java.util.List;

/**
 *
 */
public interface ArtpiecesService {
    void add(Artpieces entity);
    void update(Artpieces entity);
    Artpieces getArtpieceById(Long id);
    List<Artpieces> getAllArtpieces();
    void delete(Artpieces entity);

    Artpieces getArtpieceByName(String id);

    List<Artpieces> getArtpieceByAuthors(String author);


    List<Task03DTO> getEmployArt();

    List<Artpieces> getArtpieceByHall(Long id);

}
