package com.softserve.dao;

import com.softserve.entity.Artpieces;
import dto.ExcursionsDTO;
import dto.Task03DTO;
import dto.Task08DTO;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 */
@Repository
public class ArtpiecesDaoImpl extends BaseDaoImpl<Artpieces, Long> implements ArtpiecesDao {

    public Artpieces getArtpieceByName(String artpiece) {
        TypedQuery<Artpieces> query = entityManager.createNamedQuery("Task1", Artpieces.class);
        query.setParameter(1,artpiece);
        return query.getSingleResult();
    }

    public List<Artpieces> getArtpieceByAuthors(String author) {
        Query query = entityManager.createNamedQuery("Task2");
        query.setParameter(1,author);
        return query.getResultList();
    }

    public List<Task03DTO> getEmployArt(String name) {
        Query query = entityManager.createNamedQuery("Task3");
        List<Object[]> resultList = query.setParameter(1,name).getResultList();
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

    public List<Task08DTO> getMaterialStatistic(String material) {
        Query query = entityManager.createNamedQuery("Task8.1");
        Query query1 = entityManager.createQuery("select a.id from Artpieces a");
        //Query query1 = entityManager.createNamedQuery("Task8.11");
        query.setParameter(2, material);
        //why it doesnt work when we use just count
        Long llong = new Long(query1.getResultList().size());
        query.setParameter(1, new Long(llong));
        List<Object[]> list1 = query.getResultList();
        Iterator<Object[]> listIterator = list1.iterator();
        List<Task08DTO> list = new LinkedList<Task08DTO>();
        while (listIterator.hasNext())
        {
            Task08DTO ed = new Task08DTO();
            Object[] fuck = listIterator.next();
            ed.setMaterial(fuck[0].toString());
            ed.setQuantity(Long.parseLong(fuck[1].toString()));
            ed.setPercentage(Double.parseDouble(fuck[2].toString()));
            list.add(ed);
        }
        return list;
    }


}
