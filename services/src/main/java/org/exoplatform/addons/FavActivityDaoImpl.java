package org.exoplatform.addons;

import org.exoplatform.commons.persistence.impl.GenericDAOJPAImpl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class FavActivityDaoImpl extends GenericDAOJPAImpl<FavouriteActivityEntity, Long> implements FavActivityDAO {


    @Override
    public Long count() {

        return super.count();
    }

    @Override
    public FavouriteActivityEntity find(Long aLong) {

        return super.find(aLong);
    }

    @Override
    public List<FavouriteActivityEntity> findAll() {

        return super.findAll();
    }

    @Override
    public FavouriteActivityEntity create(FavouriteActivityEntity favouriteActivityEntity) {

        return super.create(favouriteActivityEntity);
    }

    @Override
    public void createAll(List<FavouriteActivityEntity> list) {
        super.createAll(list);

    }


    @Override
    public FavouriteActivityEntity update(FavouriteActivityEntity favouriteActivityEntity) {
        return super.update(favouriteActivityEntity);
    }

    @Override
    public void updateAll(List<FavouriteActivityEntity> list) {
        super.updateAll(list);

    }


    @Override
    public void delete(FavouriteActivityEntity favouriteActivityEntity) {
        super.delete(favouriteActivityEntity);

    }

    @Override
    public void deleteAll(List<FavouriteActivityEntity> list) {
        super.deleteAll(list);

    }

    @Override
    public void deleteAll() {
        super.deleteAll();

    }

    @Override
    public FavouriteActivityEntity getActivityByTitle(String Title) {
        TypedQuery<FavouriteActivityEntity> query = getEntityManager().createNamedQuery("FavActivEntity.getActivityByTitle", FavouriteActivityEntity.class);
        query.setParameter("Title", Title);
        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }

    }

    public FavActivityDaoImpl() {
    }
}
