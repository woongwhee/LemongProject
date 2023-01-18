package site.lemongproject.common.response;

public class ResponseBuilder{


    public static ResponseBody success(Object o){
        ResponseBody response=new ResponseBody();
        response.setCode("2000");
        response.setMessage("SUCCESS");
        response.setResult(o);
        return response;
    }

    public static ResponseBody fail(Object o){
        ResponseBody response=new ResponseBody();
        response.setCode("4000");
        response.setMessage("fail");
        response.setResult(o);
        return response;
    }


}