package com.epam.jtc.zlobin.advanced_ava_curse;
@Service(name = "AAA")
public class SimpleService {
    @Init
    public void initService(){
        System.out.println("Инициализвция сервиса");
    }
    public void asdasd(){
        System.out.println("Левый метода");
    }
}
