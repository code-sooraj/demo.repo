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
    	final List<String> topics = new ArrayList<String>(8);
    	topics.add("Spring");
    	topics.add("JPA");
    	topics.add("NoSQL");
    	topics.add("Docker");
    	topics.add("JavaEE");
    	topics.add("Hibernate");
    	topics.add("Cassandra");
    	topics.add("SQLite");
        return Response.status(200).entity(topics.toString()).build();
    }

}
