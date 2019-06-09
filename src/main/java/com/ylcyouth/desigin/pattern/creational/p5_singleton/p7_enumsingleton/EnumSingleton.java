package com.ylcyouth.desigin.pattern.creational.p5_singleton.p7_enumsingleton;

/**
 * @author ylcyouth
 * @create 2019/6/9 10:59
 */
public enum  EnumSingleton {

    INSTANCE {
        protected void test() {
            System.out.println("test...");
        }
    };

    protected abstract void test();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
