package com.softserve.dao;

import com.softserve.entity.Artpieces;

import java.util.List;

/**
 * Created by shmidt on 16.07.17.
 */
public interface ArtpiecesDao extends BaseDao<Artpieces, Long> {
    Artpieces getArtpieceByName(String artpiece);
}
