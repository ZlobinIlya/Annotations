package com.epam.jtc.zlobin.advanced_ava_curse;
@Service(name = "BBBB")
public class LazyService {
    @Init
    public void lazyInit() throws Exception {
        System.out.println("Lezy инициализация");
    }
}
