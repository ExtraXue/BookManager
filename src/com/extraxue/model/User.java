package com.extraxue.model;

/**
 * 用户实体
 */
public class User {
    private int id;//编号
    private String userName;
    private String passWord;
    //alt + enter 生成get set方法

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 此User为“构造方法”，用于事先定义好其天生所具有的属性
     * 从而到时可以直接调用这些属性加快编程效率
     * @param userName
     * @param passWord
     */
    public User(String userName, String passWord) {
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
