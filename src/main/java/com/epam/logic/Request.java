package com.epam.logic;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Elizaveta_Gnezdilova on 4/28/2015.
 */
public class Request {
    private Map<RequestParamName, Object> params = new HashMap<RequestParamName, Object>();

    public Request() {
    }

    public void putParam(RequestParamName paramName, Object obj) {
        params.put(paramName, obj);
    }

    public Object getParam(RequestParamName paramName) {
        return params.get(paramName);
    }

}
