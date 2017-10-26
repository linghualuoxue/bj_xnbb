package com.bj.xnbb.service;


import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.bj.xnbb.entity.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/userservice")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
public interface UserService {

    @GET
    @Path("/testGet")
    public void testGet();

    @GET
    @Path("/getUser")
    public User getUser();

    @GET
    @Path("/get/{id:\\d+}")
    public User getUser(@PathParam("id")Integer id);

    @GET
    @Path("/get/{id:\\d+}/{name:[a-zA-Z][0-9]}")
    public User getUser(@PathParam("id")Integer id,@PathParam("name")String name);

    @POST
    @Path("/testPost")
    public void testPost();

    @POST
    @Path("/postUser")
    public User postUser(User user);

    @POST
    @Path("/post/{id}")
    public User postUser(@PathParam("id")String id);
}
