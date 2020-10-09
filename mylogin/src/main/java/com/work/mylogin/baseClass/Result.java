package com.work.mylogin.baseClass;

public class Result {
    private final int code;
    private String response;

    public Result(int code, String response){
        this.code = code;
        this.response = response;
    }

    public int getCode(){
        return this.code;
    }

    public String getResponse(){
        return this.response;
    }

    public void setResponse(String response){
        this.response = response;
    }
}
