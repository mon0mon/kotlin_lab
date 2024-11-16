package generic.super_type_token

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

abstract class TypeToken<T> {
    val type: Type
        get() = (this::class.java.genericSuperclass as ParameterizedType).actualTypeArguments[0]
}

fun main() {
    val stringType = object : TypeToken<List<String>>() {}.type
    println(stringType) // 출력: java.util.List<java.lang.String>

    val mapType = object : TypeToken<Map<String, Int>>() {}.type
    println(mapType) // 출력: java.util.Map<java.lang.String, java.lang.Integer>
}
