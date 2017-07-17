package com.softserve.services;

import com.softserve.dao.ArtpiecesDao;
import com.softserve.entity.Artpieces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ArtpiecesServiceImpl implements ArtpiecesService {

    @Autowired
    private ArtpiecesDao artpiecesDao;

    public void add(Artpieces entity) {
        artpiecesDao.add(entity);
    }

    public void update(Artpieces entity) {
        artpiecesDao.update(entity);
    }

    public Artpieces getArtpieceById(Long id) {
        return artpiecesDao.getEntityById(id);
    }

    public List<Artpieces> getAllArtpieces() {
        return artpiecesDao.getAllEntities();
    }

    public void delete(Artpieces entity) {
        artpiecesDao.delete(entity);
    }

    public Artpieces getArtpieceByName(String ap) {
        return artpiecesDao.getArtpieceByName(ap);
    }


}
