package org.exoplatform.addons.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.exoplatform.addons.FavActivityDaoImpl;
import org.exoplatform.addons.FavouriteActivityEntity;
import org.exoplatform.container.PortalContainer;
import org.exoplatform.services.rest.resource.ResourceContainer;
import org.exoplatform.social.core.jpa.storage.dao.ActivityDAO;
import org.exoplatform.social.core.jpa.storage.entity.ActivityEntity;

import java.util.Calendar;

@Path("/user/")
public class MyRESTService implements ResourceContainer {

    @Path("/name/{name}/")
    @GET
    public Response getName(@PathParam("name") String name) throws Exception {
        return Response.ok("Hello " + name + " !").build();
    }

    @Path("/Createfavourite/")
    @GET
    public Response createActivity() throws Exception {
        try{
        PortalContainer container = PortalContainer.getInstance();
        ActivityDAO DAO = (ActivityDAO) container.getComponentInstancesOfType(ActivityDAO.class);
        ActivityEntity activityEntity = DAO.find(1l);

        FavActivityDaoImpl fav = new FavActivityDaoImpl();
        Calendar calendar = Calendar.getInstance();


        FavouriteActivityEntity fav1 = new FavouriteActivityEntity("comment10",calendar,activityEntity);
       /* FavouriteActivityEntity fav1 = new FavouriteActivityEntity();
        fav1.setTarget(activityEntity);
        fav1.setTitle("comment12");
        fav1.setFavouritedDate(calendar);*/
        fav.create(fav1);


    }catch (Exception e){
            System.out.print(e);
        };
        return Response.ok("added !").build();

}}