package com.softserve.services;

import com.softserve.entity.Artpieces;

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

}
