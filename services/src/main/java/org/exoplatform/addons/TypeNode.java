package org.exoplatform.addons;
        import org.exoplatform.container.ExoContainer;
        import org.exoplatform.container.ExoContainerContext;
        import org.exoplatform.services.jcr.RepositoryService;
        import org.exoplatform.services.log.ExoLogger;
        import org.picocontainer.Startable;
        import org.exoplatform.services.log.Log;


        import javax.jcr.*;
        import javax.jcr.Repository;
        import javax.jcr.RepositoryException;
        import javax.jcr.Session;
        import javax.jcr.SimpleCredentials;
        import javax.jcr.query.Query;
        import javax.jcr.query.QueryManager;




/**
 * Created by eXo Platform SAS.
 *
 */

/*public class TypeNode implements Startable {
    private static final Log LOG = ExoLogger.getLogger(MyService.class);
    Repository repository;



    public void start() {
        LOG.info("Service Started");
        ExoContainer myContainer = ExoContainerContext.getCurrentContainer();
        RepositoryService repositoryService = (RepositoryService) myContainer. getComponentInstanceOfType(RepositoryService.class);


        try {
            repository = repositoryService.getCurrentRepository();
            Credentials credentials = new SimpleCredentials("root", "gtn".toCharArray());
            Session jcrSession = repository.login(credentials, "collaboration");
            Node root = jcrSession.getRootNode();
            Node home = root.getNode("Users/r___/ro___/roo___/root/Public");
            /*Node newNode = home.addNode("MyFavorit2", "exo:favoritActivityI");
            jcrSession.save();*/

            /*home.getNode("MyFavorit2").remove();


            QueryManager qm = jcrSession.getWorkspace().getQueryManager();
            Query q = qm.createQuery("select * from exo:favoritActivityI", Query.SQL);
            NodeIterator ni = q.execute().getNodes();
            while (ni.hasNext()) {
                Node iterNode= ni.nextNode();
                LOG.info( iterNode.getName() );}




            LOG.info(jcrSession);
            LOG.info( repository);
            jcrSession.save();


        } catch (RepositoryException e) {
            e.printStackTrace();
        }

    }

    public void stop() {
        LOG.info("Service Stopped");
    }

}*/