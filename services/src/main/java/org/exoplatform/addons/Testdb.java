package org.exoplatform.addons;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.exoplatform.social.core.jpa.storage.entity.ActivityEntity;
import org.picocontainer.Startable;

import java.util.Calendar;

public class Testdb implements Startable {


    private static final Log LOG = ExoLogger.getLogger(MyService.class);


    @Override
    public void start() {
        Calendar calendar = Calendar.getInstance();
        FavActivityDaoImpl dao=new FavActivityDaoImpl();

        LOG.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      /*  FavouriteActivityEntity fv=new FavouriteActivityEntity("comment",calendar);
        FavouriteActivityEntity fv1=new FavouriteActivityEntity("comment1",calendar);
        FavouriteActivityEntity fv2=new FavouriteActivityEntity("comment2",calendar);


        dao.create(fv);
        dao.create(fv1);
        dao.create(fv2);
*/
        LOG.info("##################################");
    }

    @Override
    public void stop() {

    }
}
