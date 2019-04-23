package com.epam.jtc.zlobin.advanced_ava_curse;

import java.lang.annotation.*;

@Documented
//попадает в javadoc
@Inherited
//Наследуется потомками
@Target(ElementType.TYPE)
//Область применения
//ElementType.PACKAGE - только для пакетов
//ElementType.TYPE - только для классов
//ElementType.CONSTRUCTOR - только для конструкторов
//ElementType.METHOD - только для методов
//ElementType.FIELD - только для атрибутов(переменных) класса
//ElementType.PARAMATER - только для параметров метода
//ElementType.LOCAL_VARIABLE - только для локальных переменных
//
//В случае, если необходимо, что бы аннотация использовалась больше чем для одного типа параметров, то можно указать @Target следующим образом:
//
//@Target({ ElementType.PARAMETER, ElementType.LOCAL_VARIABLE })
@Retention(RetentionPolicy.RUNTIME)
//Время жизни
//RetentionPolicy.SOURCE - аннотация используется на этапе компиляции и должна отбрасываться компилятором
//RetentionPolicy.CLASS - аннтоация будет записана в class-файл компилятором, но не должна быть доступна во время выполнения (runtime)
//RetentionPolicy.RUNTIME - аннотация будет записана в class-файл и доступна во время выполнения через reflection
public @interface Service {
    String name();
    boolean lazyLoad() default false;
}
