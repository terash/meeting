package org.terash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloResource {
	
	public HelloResource() {}
	
	@GET
	public String sayHello() {
		return "Hello Jax-RS!";
	}
	
    /** 
     * �^����ꂽ�p�����[�^�ɉ����āuParameter is '���p�����[�^��'!�v�Ƃ����������ԋp���܂��B 
     * 
     * @param param �p�����[�^ 
     * @return �p�����[�^���o�͂��܂��B 
     */  
    @GET  
    @Path( "/{param:.*}" )  
    public String replayParameter( @PathParam( "param" ) String param ) {  
  
        return String.format( "Parameter is '%s'!", param );  
  
    }  
	
	
}
