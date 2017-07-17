package com.softserve.dao;

import com.softserve.entity.Artpieces;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 */
@Repository
public class ArtpiecesDaoImpl extends BaseDaoImpl<Artpieces, Long> implements ArtpiecesDao {

    public Artpieces getArtpieceByName(String artpiece) {
        TypedQuery<Artpieces> query = entityManager.createNamedQuery("Task1",Artpieces.class);
        query.setParameter(1,artpiece);
        return query.getSingleResult();
    }
}
