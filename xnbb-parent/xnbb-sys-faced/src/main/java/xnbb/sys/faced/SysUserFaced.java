package xnbb.sys.faced;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import xnbb.sys.entity.SysUser;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("sysUserService")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface SysUserFaced {

    @GET
    @Path("testGet")
    public void testGet();

    @GET
    @Path("getUser")
    public SysUser getUser();

    @POST
    @Path("postUser")
    public SysUser postUser();

    @POST
    @Path("insertUser")
    public void inserUser(SysUser user);
}
