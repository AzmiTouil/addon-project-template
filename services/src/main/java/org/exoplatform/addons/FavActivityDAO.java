package org.exoplatform.addons;

import org.exoplatform.commons.api.persistence.GenericDAO;

public interface FavActivityDAO extends GenericDAO<FavouriteActivityEntity, Long> {


    FavouriteActivityEntity getActivityByTitle(String Title);

}
