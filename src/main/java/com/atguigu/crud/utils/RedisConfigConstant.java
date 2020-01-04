package com.atguigu.crud.utils;

public enum RedisConfigConstant {

    SYS_OK(1,"处理成功！")
    ,PARAM_IS_NULL(RedisConfigConstant.ERROR_CODE+1,"id为空")
    ,ERROR_SEND_CODE(RedisConfigConstant.ERROR_CODE+2,"验证码发送失败")
    ,ERROR_CHECK_CODE(RedisConfigConstant.ERROR_CODE+3,"验证码校验未通过")
    ,PARAMS_ILLEGE(RedisConfigConstant.ERROR_CODE+4,"参数错误")
    ,PARAMS_PHONE(RedisConfigConstant.ERROR_CODE+5,"手机号参数缺失!")
    ,PARAMS_CAPTCHA(RedisConfigConstant.ERROR_CODE+6,"验证码参数缺失!")
    ,ERROR_EXIST_PHONE(RedisConfigConstant.ERROR_CODE+7, "该手机号码已被注册!")
    ,ERROR_CODEID(RedisConfigConstant.ERROR_CODE+8, "codeId为空!")
    ,PARAMS_PHONE_ERROR(RedisConfigConstant.ERROR_CODE+9,"手机号参数缺失!"),
    ERROR_PARAMS_GET_IMGCODE(RedisConfigConstant.ERROR_CODE+10, "获取Banner信息失败!"),
    ;
    /**
     * 默认ERROR_CODE.<br>
     * 按公司要求8位长度，前两位产品。
     */
    public static final int ERROR_CODE=400;

    private Integer code;
    private String message;

    private RedisConfigConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        // TODO Auto-generated method stub
        return code;
    }

    public String getMessage() {
        // TODO Auto-generated method stub
        return message;
    }
    public static void main(String[] args) {
       // System.out.println(RedisConfigConstant.JPUSH_INDEX_URL);


        System.out.println("所有汽车的价格："+RedisConfigConstant.SYS_OK.getCode());
        for (RedisConfigConstant c : RedisConfigConstant.values())
            System.out.println(c + " 需要 "
                    + c.getMessage()+c.getCode() + " 千美元。");    }
}
