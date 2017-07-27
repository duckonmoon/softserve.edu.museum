package com.softserve.dao.imp;

import com.softserve.dao.ExcursionsDao;
import com.softserve.dao.imp.BaseDaoImpl;
import com.softserve.entity.Excursions;
import dto.ExcursionsDTO;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
@Repository
public class ExcursionsDaoImpl extends BaseDaoImpl<Excursions> implements ExcursionsDao {

    public List<ExcursionsDTO> getAllExcursionsWithGuides() {
        List<Object[]> resultList = entityManager.createQuery("select e.start,e.end,g.firstname,g.lastname from Excursions e join e.guide g").getResultList();
        Iterator<Object []> listIterator = resultList.iterator();
        List<ExcursionsDTO> list = new LinkedList<ExcursionsDTO>();
        while (listIterator.hasNext())
        {
            ExcursionsDTO ed = new ExcursionsDTO();
            Object[] fuck = listIterator.next();
            ed.setStart(fuck[0].toString());
            ed.setEnd(fuck[1].toString());
            ed.setFirstname(fuck[2].toString());
            ed.setLastname(fuck[3].toString());
            list.add(ed);
        }
        return list;
    }

    public List<Excursions> getExcursionsByStartEnd(String start, String end) {
        return entityManager.createNamedQuery("Task07")
                .setParameter(1,start)
                .setParameter(2,end)
                .getResultList();
    }


}
