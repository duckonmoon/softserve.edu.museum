package com.softserve.services.imp;

import com.softserve.dao.ArtpiecesDao;
import com.softserve.entity.Artpieces;
import com.softserve.services.ArtpiecesService;
import dto.Task03DTO;
import dto.Task08DTO;
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

        artpiecesDao.addEntity(entity);
    }

    public void update(Artpieces entity) {

        artpiecesDao.updateEntity(entity);
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

    public List<Artpieces> getArtpieceByAuthors(String author) {

        return artpiecesDao.getArtpieceByAuthors(author);
    }

    public List<Task03DTO> getEmployArt(String name) {

        return  artpiecesDao.getEmployArt(name);
    }

    public List<Artpieces> getArtpieceByHall(Long id) {

        return artpiecesDao.getArtpieceByHall(id);
    }

    public List<Task08DTO> getMaterialStatistic(String material) {
        return artpiecesDao.getMaterialStatistic(material);}

}
