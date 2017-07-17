package com.softserve.dao;

import com.softserve.entity.Artpieces;
import dto.Task03DTO;

import java.util.List;

/**
 * Created by shmidt on 16.07.17.
 */
public interface ArtpiecesDao extends BaseDao<Artpieces, Long> {
    Artpieces getArtpieceByName(String artpiece);
    List<Artpieces> getArtpieceByAuthors(String author);
    List<Task03DTO> getEmployArt(String name);
    List<Artpieces> getArtpieceByHall(Long id);
}
