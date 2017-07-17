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

    public List<Artpieces> getAllArtpieces() {
        return artpiecesDao.getAllEntities();
    }

    
}
