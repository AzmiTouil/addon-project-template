package org.exoplatform.addons;
import org.exoplatform.container.ExoContainer;
import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.container.PortalContainer;
import org.exoplatform.services.log.ExoLogger;
import org.picocontainer.Startable;
import org.exoplatform.services.log.Log;

/**
 * Created by eXo Platform SAS.
 *
 */

public class MyService implements Startable{

    private static final Log LOG = ExoLogger.getLogger(MyService.class);

    ExoContainer  currentContainer = ExoContainerContext.getCurrentContainer();
        Myser  myser  =  (Myser)   currentContainer.getComponentInstanceOfType(Myser.class);

    public void start(){

        LOG.info(" service Started");
        myser.afficher();
    }
    public void stop(){
        LOG.info("service stopped");



}
}
