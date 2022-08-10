package com.demo.film.dto;

public class BaseResponse <T>{
    public int status = 1;
    public String message = "success";
    public T data;

    public BaseResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse() {
    }

    public BaseResponse(T data) {
        this.data = data;
    }
}
