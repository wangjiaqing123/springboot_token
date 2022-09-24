package com.wjq.springboot_token.util;


//枚举,这里必须有一个构造函数
public enum ResultCode {

    success(1,"操作成功"),
    error(2,"操作失败，未知指定错误信息"),
    //参数错误10001-19999
    param_is_invalid(10001,"参数无效"),
    param_is_blank(10002,"参数为空"),
    param_type_bind_error(10003,"参数类型错误"),
    param_not_complete(10004,"参数缺失"),
    //用户错误20001-29999
    user_not_login(20001,"用户未登入"),
    user_login_error(20002,"账号不存在或密码错误"),
    user_account_forbidden(20003,"账号已被禁用"),
    user_not_exist(20004,"用户不存在"),
    user_has_existed(20005,"用户已存在"),
    //业务错误30001-39999
    specified_questioned_user_not_seist(30001,"业务逻辑出现问题"),
    //系统错误40001-49999
    system_inner_error(40001,"系统内部错误，请稍后重试"),
    //数据错误50001-59999
    data_none(50001,"数据未找到"),
    data_wrong(50002,"数据错误"),
    data_sxisted(50003,"数据已存在"),
    //接口错误:60001-69999
    interface_inner_invoke_error(60001,"内部系统接口调用异常"),
    interface_outer_invoke_error(60002,"外部系统接口调用异常"),
    interface_forbid_visit(60003,"该接口静止访问"),
    interface_address_invalid(60004,"接口地址无效"),
    interface_request_timeout(60005,"接口请求超时"),
    //权限错误:70001-79999
    permission_no_access(70001,"无访问权限");






    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer code(){
        return  this.code;
    }
    public String Message(){
        return this.message;
    }


}
