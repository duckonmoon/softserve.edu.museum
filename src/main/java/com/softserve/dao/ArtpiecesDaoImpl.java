package com.softserve.dao;

import com.softserve.entity.Artpieces;
import dto.ExcursionsDTO;
import dto.Task03DTO;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.LinkedList;
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

    public List<Artpieces> getArtpieceByAuthors(String author) {
        Query query = entityManager.createNamedQuery("Task2");
        query.setParameter(1,author);
        return query.getResultList();
    }

    public List<Task03DTO> getEmployArt() {
        List<Object[]> resultList = entityManager.createNamedQuery("Task3").getResultList();
        Iterator<Object []> listIterator = resultList.iterator();
        List<Task03DTO> list = new LinkedList<Task03DTO>();
        while (listIterator.hasNext())
        {
            Task03DTO ed = new Task03DTO();
            Object[] fuck = listIterator.next();
            ed.setName(fuck[0].toString());
            ed.setFirstname(fuck[1].toString());
            list.add(ed);
        }
        return list;
    }

    public List<Artpieces> getArtpieceByHall(Long id) {
        Query query = entityManager.createNamedQuery("Task4");
        query.setParameter(1,id);
        return query.getResultList();
    }


}
