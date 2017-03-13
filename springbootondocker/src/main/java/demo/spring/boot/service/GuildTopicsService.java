package demo.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
 * Topics for each guild.
 */
@Component
@Path("/topics")
public class GuildTopicsService {

    @GET
    @Path("/ef")
    public Response efGuild() {
    	List<String> topics = new ArrayList<String>(6);
    	topics.add("Spring");
    	topics.add("JPA");
    	topics.add("NoSQL");
    	topics.add("Tomcat");
    	topics.add("JavaEE");
        return Response.status(200).entity("Hello World").build();
    }

}
